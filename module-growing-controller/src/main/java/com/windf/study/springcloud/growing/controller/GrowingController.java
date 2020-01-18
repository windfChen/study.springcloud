package com.windf.study.springcloud.growing.controller;

import com.windf.study.springcloud.growing.service.GrowingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/growing")
public class GrowingController {

    @Autowired
    private GrowingService growingService;

    @ResponseBody
    @RequestMapping("io.gif")
    public void io(ServletServerHttpRequest request, ServletServerHttpResponse response) {



        response.setStatusCode(HttpStatus.OK);
        response.getHeaders().add("content-type", "image/gif");
    }
}
