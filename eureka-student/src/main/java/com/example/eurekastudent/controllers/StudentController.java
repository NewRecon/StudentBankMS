package com.example.eurekastudent.controllers;

import com.example.eurekastudent.models.Student;
import com.example.eurekastudent.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public final class StudentController {
    private final StudentService studentService;

    @GetMapping("groups")
    public ResponseEntity<List<Student>> getAllStudents(){
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @GetMapping("groups/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id){
        return ResponseEntity.ok(studentService.getStudent(id));
    }

    @PostMapping("groups")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        return ResponseEntity.ok(studentService.addStudent(student));
    }

    @PutMapping("groups")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student){
        return ResponseEntity.ok(studentService.updateStudent(student));
    }

    @DeleteMapping("groups/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        return ResponseEntity.ok(studentService.deleteStudent(id));
    }

}
