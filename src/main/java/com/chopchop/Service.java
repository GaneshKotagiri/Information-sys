package com.chopchop;

import org.springframework.stereotype.Component;

@Component
public class Service {
    Student student;
//    String operation;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

//    public String getOperation() {
//        return operation;
//    }
//
//    public void setOperation(String operation) {
//        this.operation = operation;
//    }

    public Service(){
       // System.out.println("this is the service of the student ");
    }
    public void service(){
        System.out.println("this is the method in the service");
        //System.out.println(operation);
        student.Status();
    }
}
