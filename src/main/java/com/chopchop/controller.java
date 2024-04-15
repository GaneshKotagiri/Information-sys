package com.chopchop;

import org.springframework.stereotype.Component;

@Component
public class controller {
    Employee employee;
    Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public void profile(){
        employee.Status();
        //student.Status();
    }
}
