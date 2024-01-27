package com.atdev.studentcrud.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atdev.studentcrud.model.Student;

@Repository
public interface StudentRepositary extends JpaRepository<Student, Integer>{
	
	

}
