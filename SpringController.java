package com.klef.spring_controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SpringController 
{
    @GetMapping("/index")
    public String index()
    {
        return "index.html";
    }
}
