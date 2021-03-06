/*
*  Use this configuration file when you need to add students each time you restart the application
*  if spring.jpa.hibernate.ddl-auto=create-drop
 */


/*
package com.example.student.management;

import com.example.student.management.persistence.entity.Student;
import com.example.student.management.persistence.repository.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import static java.time.Month.*;

@Configuration
public class CommandLineRunnerConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepo studentRepository){
        return args -> {

            Student emre = new Student(
                    "emre",
                    "emre@mail.com",
                    LocalDate.of(2001, OCTOBER, 11)
            );

            Student goksu = new Student(
                    "goksu",
                    "göksu@mail.com",
                    LocalDate.of(2006, APRIL, 18)
            );

            studentRepository.saveAll(
                    List.of(emre,goksu)
            );
        };
    }
}
*/

