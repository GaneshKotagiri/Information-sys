package com.chopchop;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App{
    public static void main( String[] args ) throws Exception {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        controller con=context.getBean(controller.class);
        Employee emp=context.getBean(Employee.class);
        emp.setAge(25);
        emp.setName("Sanjana");
        //emp.Status();
        Student stu=context.getBean(Student.class);
        stu.setAge(23);
        stu.setName("Ganesh");
        stu.Status();
//        con.profile();
        Service serv=context.getBean(Service.class);
        serv.setStudent(stu);
        serv.service();


//      ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
//      Employee obj= (Employee) context.getBean("student");
//      Student obj1= (Student) context.getBean("employee");
//      controller controller= (com.chopchop.controller) context.getBean("pro");
////      obj.Status();
////      obj1.Status();
//      controller.profile();
    }
}