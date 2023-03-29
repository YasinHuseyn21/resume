package com.company;

import com.company.dao.inter.CountryDaoInter;
import com.company.dao.inter.EmploymentHistoryDaoInter;
import com.company.dao.inter.UserDaoInter;
import com.company.dao.inter.UserSkillDaoInter;
import com.company.entity.UserSkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ResumeDbAppJpaSpringApplication {
    @Autowired
    private UserDaoInter userDao;
    @Autowired
    private EmploymentHistoryDaoInter employmentHistoryDao;
    @Autowired
    private CountryDaoInter countryDao;
    @Autowired
    private UserSkillDaoInter userSkillDao;


    public static void main(String[] args) {
        SpringApplication.run(ResumeDbAppJpaSpringApplication.class, args);
    }

    @Bean
    public CommandLineRunner run() {
        CommandLineRunner clr = new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                List<UserSkill> list = userSkillDao.getAllSkill();
                System.out.println(list);

            }
        };
        return clr;
    }
}
