package com.springboot.web.application.Blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {
    @RequestMapping("/blog")
    public String blog(){
    	System.out.println("In the Blog Dashboard Controller");
        return "blog";
    }
}
