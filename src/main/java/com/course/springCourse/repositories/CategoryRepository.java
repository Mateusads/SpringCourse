package com.course.springCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.springCourse.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
