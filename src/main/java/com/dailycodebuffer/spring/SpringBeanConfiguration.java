package com.dailycodebuffer.spring;

import com.dailycodebuffer.spring.model.Employee;
import com.dailycodebuffer.spring.model.Organization;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//Annotation tell spring that this is a configuration class.
@Configuration
public class SpringBeanConfiguration {
//define different beans here
    @Bean
    public String firstName() {
        return "dcb";
    }
    @Bean
    public int employeeNumber() {
        return 1;
    }
    // we can also define different java object as bean
    @Bean(name = "employeeObj")
    public Employee employee() {
        return new Employee("new", 2);
    }
    @Bean
    public Organization organization() {
        return new Organization(100, "org1");
    }
}
