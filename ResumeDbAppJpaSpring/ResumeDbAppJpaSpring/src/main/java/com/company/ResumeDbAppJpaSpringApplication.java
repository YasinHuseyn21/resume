package com.company;

import com.company.dao.inter.UserRepository;
import com.company.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ResumeDbAppJpaSpringApplication {
    @Autowired
    private UserRepository userRepo;


    public static void main(String[] args) {
        SpringApplication.run(ResumeDbAppJpaSpringApplication.class, args);
    }

    @Bean
    public CommandLineRunner run() {
        CommandLineRunner clr = new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                User u = userRepo.findByName("Yasin");
                System.out.println(u);
                User u2 = userRepo.findByNameAndSurname("Jon", "Colman");
                System.out.println(u2);
                User user = userRepo.findByEmail("joncolman@gmail.com");
                System.out.println(user);
            }
        };
        return clr;
    }
}
