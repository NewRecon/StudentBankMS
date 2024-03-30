package com.example.eurekastudent.services;

import com.example.eurekastudent.models.Student;
import com.example.eurekastudent.repositories.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepo studentRepo;

    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

    public Student getStudent(Long id){
        return studentRepo.findById(id).orElse(null);
    }

    public Student addStudent(Student student){
        return studentRepo.save(student);
    }

    public Student updateStudent(Student student){
        return studentRepo.save(student);
    }

    public String deleteStudent(Long id){
        return getStudent(id)!=null ? "user with id = " + id + " deleted" : "user with id = " + id + " not found";
    }
}
