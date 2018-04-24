package com.ssll.qxxdemo.demoController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController2 {

    @Autowired
    private DemoPojo dPojo;

    @RequestMapping(value = "/main2" , method = RequestMethod.GET)
    public String main2(){
        return ""+dPojo.getType()+" is "+dPojo.getQuota();
    }

    @RequestMapping(value = "/mainSay/{some}" , method = RequestMethod.GET)
    public String mainSay(@PathVariable("some") String some){
        return "some is "+some;
    }
}
