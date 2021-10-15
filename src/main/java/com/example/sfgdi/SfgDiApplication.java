package com.example.sfgdi;

import com.example.sfgdi.Contollers.MyControllers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx  = SpringApplication.run(SfgDiApplication.class, args);
        MyControllers myController = (MyControllers) ctx.getBean("myControllers");

        String greeting = myController.sayHello();

        System.out.println(greeting);
    }

}
