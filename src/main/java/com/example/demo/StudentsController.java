package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentsController {
   @Autowired
    StudentsRepo repo;

    @RequestMapping("/")
    public String getStudents() {

        return "forms";

    }

   @RequestMapping("/getStudents")
    public String getStudents(Students students) {

       repo.save(students);
       return "forms";

   }

}

