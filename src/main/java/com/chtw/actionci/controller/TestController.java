package com.chtw.actionci.controller;

import com.chtw.actionci.common.response.CommRespUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @GetMapping(value = "state")
    public CommRespUtils<String> test(){
        return CommRespUtils.success("这个接口用于测试！tag");
    }
}
