package com.example.controller;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.company.ClassA;

@RestController
@Component
public class HomeController {
    
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String classA(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:WEB-INF/appContext.xml");
        BeanFactory factory = context;
        ClassA a = (ClassA) factory.getBean("classA");
        return "index";
    }
}