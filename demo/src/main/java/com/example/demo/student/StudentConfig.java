package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {

             Student mariam=new Student(
                            "mariam",
                            "mariam.test@test.com",
                            LocalDate.of(2000, Month.JANUARY,5));
            Student alex=new Student(
                    "alex",
                    "alex.test@test.com",
                    LocalDate.of(2004, Month.JANUARY,5));
             repository.saveAll(
                     List.of(mariam,alex)
             );
        };
    }
}
