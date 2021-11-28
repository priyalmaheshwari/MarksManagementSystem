package com.maheshwari.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.maheshwari.demo.model.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
	
	
}
