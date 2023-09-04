package com.liquid.controller;

import com.liquid.entities.Student;
import com.liquid.repository.Studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    Studentrepo studentrepo;

    @PostMapping("/save")
    public Student save(@RequestBody Student student){
        return studentrepo.save(student);
    }
}
