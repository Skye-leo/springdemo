package com.ssll.qxxdemo.demoController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(value = "/main" , method = RequestMethod.GET)
    public String main(){
        return "hello springBoot   ---     ";
    }
}
