package com.example.springboot.jangjh.day1;


import lombok.extern.apachecommons.CommonsLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CommonsLog
@RestController
public class SampleController {

    @RequestMapping("/hello")
    public String sayHello() {
         return "Hello world";
    }

    @GetMapping("/sample")
    public SampleVO makeSample() {
        SampleVO sampleVO = new SampleVO();
        sampleVO.setVar1("Var1");
        sampleVO.setVar1("Var2");
        sampleVO.setVar1("Var3");
        log.debug("sampleVO--> " + sampleVO.toString());
        return sampleVO;
    }

}
