package com.example.eurekastudent.repositories;

import com.example.eurekastudent.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
}
