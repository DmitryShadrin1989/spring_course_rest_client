package com.zaurtregulov.spring.rest;

import com.zaurtregulov.spring.rest.configuration.MyConfig;
import com.zaurtregulov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployee = communication.getAllEmployees();
//        System.out.println(allEmployee);

//        Employee empBuID = communication.getEmployee(1);
//        System.out.println(empBuID);

//        Employee emp = new Employee(14, "Sveta", "Sokolova", "IT", 1200);
//        communication.saveEmployee(emp);

        communication.deleteEmployee(14);


    }
}
