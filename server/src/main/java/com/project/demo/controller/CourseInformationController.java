package com.project.demo.controller;

import com.project.demo.entity.CourseInformation;
import com.project.demo.service.CourseInformationService;
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
 * 课程信息：(CourseInformation)表控制层
 *
 */
@RestController
@RequestMapping("/course_information")
public class CourseInformationController extends BaseController<CourseInformation, CourseInformationService> {

    /**
     * 课程信息对象
     */
    @Autowired
    public CourseInformationController(CourseInformationService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> mapfirst_class_time = new HashMap<>();
        mapfirst_class_time.put("first_class_time",String.valueOf(paramMap.get("first_class_time")));
        List listfirst_class_time = service.selectBaseList(service.select(mapfirst_class_time, new HashMap<>()));
        if (listfirst_class_time.size()>0){
            return error(30000, "字段第一次上课时间内容不能重复");
        }
        Map<String, String> mapplace_of_the_first_class = new HashMap<>();
        mapplace_of_the_first_class.put("place_of_the_first_class",String.valueOf(paramMap.get("place_of_the_first_class")));
        List listplace_of_the_first_class = service.selectBaseList(service.select(mapplace_of_the_first_class, new HashMap<>()));
        if (listplace_of_the_first_class.size()>0){
            return error(30000, "字段第一次上课地点内容不能重复");
        }
        Map<String, String> mapsecond_class_time = new HashMap<>();
        mapsecond_class_time.put("second_class_time",String.valueOf(paramMap.get("second_class_time")));
        List listsecond_class_time = service.selectBaseList(service.select(mapsecond_class_time, new HashMap<>()));
        if (listsecond_class_time.size()>0){
            return error(30000, "字段第二次上课时间内容不能重复");
        }
        Map<String, String> maplocation_of_the_second_class = new HashMap<>();
        maplocation_of_the_second_class.put("location_of_the_second_class",String.valueOf(paramMap.get("location_of_the_second_class")));
        List listlocation_of_the_second_class = service.selectBaseList(service.select(maplocation_of_the_second_class, new HashMap<>()));
        if (listlocation_of_the_second_class.size()>0){
            return error(30000, "字段第二次上课地点内容不能重复");
        }
        this.addMap(paramMap);
        return success(1);
    }

}
