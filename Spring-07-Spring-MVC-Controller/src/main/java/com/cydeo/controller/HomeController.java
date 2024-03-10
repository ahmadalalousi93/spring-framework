package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //Anotate the class with @Controller stereotype annotation
public class HomeController {
    @RequestMapping("/home") //use @RequestMapping annotation to associate the action with an HTTP request path
    public String home(){
        return "home.html";
    } //return the hrml document name that ocntains the details we want the broswer to display

    @RequestMapping("/welcome")
    public String home2(){
        return "welcome.html";
    }

    @RequestMapping //this always goes to default and makes this or ":/" the default
    public String home3(){
        return "welcome.html";
    }


}
