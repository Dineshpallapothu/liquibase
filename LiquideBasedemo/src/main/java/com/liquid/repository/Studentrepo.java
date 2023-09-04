package com.liquid.repository;

import com.liquid.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface Studentrepo extends JpaRepository<Student, Integer> {

}
