package com.project.demo.controller;

import com.project.demo.entity.StudentsChooseCourses;
import com.project.demo.service.StudentsChooseCoursesService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 学生选课：(StudentsChooseCourses)表控制层
 *
 */
@RestController
@RequestMapping("/students_choose_courses")
public class StudentsChooseCoursesController extends BaseController<StudentsChooseCourses, StudentsChooseCoursesService> {

    /**
     * 学生选课对象
     */
    @Autowired
    public StudentsChooseCoursesController(StudentsChooseCoursesService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        String sql = "SELECT MAX(students_choose_courses_id) AS max FROM "+"students_choose_courses";
        Integer max = service.selectBaseCount(sql);
        sql = ("SELECT count(*) count FROM `course_information` INNER JOIN `students_choose_courses` ON course_information.course_no=students_choose_courses.course_no WHERE course_information.maximum_number_of_people < students_choose_courses.number_of_participants AND students_choose_courses.students_choose_courses_id="+max).replaceAll("&#60;","<");
        Integer count = service.selectBaseCount(sql);
        if(count>0){
            sql = "delete from "+"students_choose_courses"+" WHERE "+"students_choose_courses_id"+" ="+max;
            service.deleteBaseSql(sql);
            return error(30000,"课程人数已达上限!");
        }
        sql = "UPDATE `course_information` INNER JOIN `students_choose_courses` ON course_information.course_no=students_choose_courses.course_no SET course_information.maximum_number_of_people= course_information.maximum_number_of_people - students_choose_courses.number_of_participants WHERE students_choose_courses.students_choose_courses_id="+max;
        service.updateBaseSql(sql);
        return success(1);
    }

}
