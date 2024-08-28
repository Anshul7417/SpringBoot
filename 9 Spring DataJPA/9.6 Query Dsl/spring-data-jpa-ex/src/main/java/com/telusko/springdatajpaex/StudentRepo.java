package com.telusko.springdatajpaex;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.springdatajpaex.model.Student;


@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

//	@Query("select s from Student s where s.name=?1")     it is called jpql . 1 means first parameter in findByName
// in sql we use table name and column names in jpql we use class name and the property name
//	List<Student> findByName(String name);
//	List<Student> findByMarks(int marks);
	List<Student> findByMarksGreaterThan(int marks);

//  Now the magic is sometime we dont have to write query jpql. data jpa will write it in backend but we have to choose    name carefully
}
