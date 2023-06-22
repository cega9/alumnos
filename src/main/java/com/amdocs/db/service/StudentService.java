package com.amdocs.db.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.db.models.StudentModel;
import com.amdocs.db.repository.StudentRepository;
 @Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public ArrayList<StudentModel> getStudents(){
        return (ArrayList<StudentModel>)studentRepository.findAll();
    }

    public StudentModel saveStudent(StudentModel usuario){
        return studentRepository.save(usuario);
    }

    public Optional<StudentModel> getStudentById(Long idLong){
        return studentRepository.findById(idLong);
    }

    public ArrayList<StudentModel> getStudentByName(String nombreString){
        return (ArrayList<StudentModel>)studentRepository.findByNombre(nombreString);
    }

    public Boolean deleteById(Long id){
        try{
            studentRepository.deleteById(id);
            return true;
        } catch(Exception e){
            return false;
        }
        
    }
} 
