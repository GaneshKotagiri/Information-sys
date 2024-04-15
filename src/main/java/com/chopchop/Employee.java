package com.chopchop;

import org.springframework.stereotype.Component;

@Component
public class Employee implements Users{
    String name;
    int age;
//    public Employee(){
//        System.out.println("this is the employee class");
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
        System.out.println("This is the information of the employee");
        System.out.println(name+ "\n"+age);
    }
}
