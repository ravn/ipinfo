package com.runjva.ipinfo.main;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResultController {

    @RequestMapping("/")
    public Result home(HttpServletRequest request) {
        return new Result(request.getRemoteAddr());
    }
}