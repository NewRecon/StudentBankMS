package com.example.eurekastudent.repositories;

import com.example.eurekastudent.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepo extends JpaRepository<Group, Long> {
}
