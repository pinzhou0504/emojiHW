package com.emojiHW.worker;

import java.util.Arrays;

import com.emojiHW.worker.service.ReceiveSQSService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Application {
    public static void main(String[] args) {
//        ApplicationContext app =
                SpringApplication.run(Application.class,args);
//        ReceiveSQSService receiveSQSService = app.getBean(ReceiveSQSService.class);
//        receiveSQSService.receiveMessage();
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//
//        };
//    }

}