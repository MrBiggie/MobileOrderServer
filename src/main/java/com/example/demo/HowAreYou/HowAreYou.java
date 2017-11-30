package com.example.demo.HowAreYou;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Byron.Y.Y
 * @date 2016年10月12日
 */
@RestController
public class HowAreYou {

    @RequestMapping("/HowAreYou")
    public String fine(){
        return "I am fine";
    }
}
