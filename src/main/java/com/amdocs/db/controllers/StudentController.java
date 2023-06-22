package com.amdocs.db.controllers;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.db.models.StudentModel;
import com.amdocs.db.service.StudentService;

@RestController
@RequestMapping("/usuario")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping()
    public ArrayList<StudentModel> getStudentList(){
        return studentService.getStudents();
    }
    @GetMapping(path = ("/{id}"))
    public Optional<StudentModel> getStudentById(@PathVariable("id") Long id){
        return this.studentService.getStudentById(id);
    }
    @GetMapping(path = ("/name/{nombre}"))
    public ArrayList<StudentModel> getStudentByName(@PathVariable("nombre") String nombre){
        return this.studentService.getStudentByName(nombre);
    }

    @PostMapping()
    public StudentModel insertStudent(@RequestBody StudentModel student){
        return this.studentService.saveStudent(student);
    }

    @DeleteMapping()
    public Boolean deleteStudentById(@RequestBody StudentModel student){
           return this.studentService.deleteById(student.getId());
    }
}
