package com.example.eurekastudent.controllers;

import com.example.eurekastudent.models.Group;
import com.example.eurekastudent.services.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GroupController {
    private final GroupService groupService;

    @GetMapping("students")
    public ResponseEntity<List<Group>> getAllGroup(){
        return ResponseEntity.ok(groupService.getAllGroups());
    }

    @GetMapping("students/{id}")
    public ResponseEntity<Group> getGroup(@PathVariable Long id){
        return ResponseEntity.ok(groupService.getGroup(id));
    }

    @PostMapping("students")
    public ResponseEntity<Group> addGroup(@RequestBody Group group){
        return ResponseEntity.ok(groupService.addGroup(group));
    }

    @PutMapping("students")
    public ResponseEntity<Group> updateGroup(@RequestBody Group group){
        return ResponseEntity.ok(groupService.updateGroup(group));
    }

    @DeleteMapping("students/{id}")
    public ResponseEntity<String> deleteGroup(@PathVariable Long id){
        return ResponseEntity.ok(groupService.deleteGroup(id));
    }
}
