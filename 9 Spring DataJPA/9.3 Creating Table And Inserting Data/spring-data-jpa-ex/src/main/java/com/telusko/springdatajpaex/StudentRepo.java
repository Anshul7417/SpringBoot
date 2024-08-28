package com.telusko.springdatajpaex;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.springdatajpaex.model.Student;

@Repository   // you have to create this repo to be work.
//Create a interface which implements JpaRepository and takes arguments as Model class and primary key data type
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
