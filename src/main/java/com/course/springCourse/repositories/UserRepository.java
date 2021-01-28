package com.course.springCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.springCourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
