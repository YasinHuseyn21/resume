package com.company.dao.inter;

import com.company.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByName(String name);
    User findByNameAndSurname(String name,String Surname);
    User findByEmail(String email);



}
