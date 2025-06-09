package com.project.demo.controller;

import com.project.demo.entity.StudentsDropOutOfClass;
import com.project.demo.service.StudentsDropOutOfClassService;
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
 * 学生退课：(StudentsDropOutOfClass)表控制层
 *
 */
@RestController
@RequestMapping("/students_drop_out_of_class")
public class StudentsDropOutOfClassController extends BaseController<StudentsDropOutOfClass, StudentsDropOutOfClassService> {

    /**
     * 学生退课对象
     */
    @Autowired
    public StudentsDropOutOfClassController(StudentsDropOutOfClassService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
