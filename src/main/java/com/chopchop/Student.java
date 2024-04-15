package com.chopchop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Student implements Users{
    String name;
    int age;
//    Service service;
//
//    public Service getService() {
//        return service;
//    }
//
//    public void setService(Service service) {
//        this.service = service;
//    }
//    public Student(){
//        System.out.println("this is the student class");
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void Status(){
        System.out.println("This is the information of the student");
//        System.out.println(service);
        System.out.println(name+ "\n"+age);

    }

}
