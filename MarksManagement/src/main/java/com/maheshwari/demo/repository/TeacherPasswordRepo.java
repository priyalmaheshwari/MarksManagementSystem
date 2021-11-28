package com.maheshwari.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maheshwari.demo.model.TeacherPassword;
@Repository
public interface TeacherPasswordRepo extends JpaRepository<TeacherPassword, Integer> {

}
