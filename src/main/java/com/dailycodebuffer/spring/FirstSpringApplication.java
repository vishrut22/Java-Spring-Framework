package com.dailycodebuffer.spring;

import com.dailycodebuffer.spring.model.Organization;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FirstSpringApplication {
    public static void main(String[] args) {
        var annotationContext = new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);
        //By method name example
        System.out.println(annotationContext.getBean("firstName"));
        System.out.println(annotationContext.getBean("employeeNumber"));
        // defined custom name
        System.out.println(annotationContext.getBean("employeeObj"));
        //by type example
        System.out.println(annotationContext.getBean(Organization.class));
        try {
            System.out.println(annotationContext.getBean("employee")); // bean not found example
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
