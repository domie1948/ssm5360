package com.project.demo.controller;

import com.project.demo.entity.PeacetimeRecord;
import com.project.demo.service.PeacetimeRecordService;
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
 * 平时记录：(PeacetimeRecord)表控制层
 *
 */
@RestController
@RequestMapping("/peacetime_record")
public class PeacetimeRecordController extends BaseController<PeacetimeRecord, PeacetimeRecordService> {

    /**
     * 平时记录对象
     */
    @Autowired
    public PeacetimeRecordController(PeacetimeRecordService service) {
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
