package com.example.eurekastudent.services;

import com.example.eurekastudent.models.Group;
import com.example.eurekastudent.repositories.GroupRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GroupService {
    private final GroupRepo groupRepo;

    public List<Group> getAllGroups(){
        return groupRepo.findAll();
    }

    public Group getGroup(Long id){
        return groupRepo.findById(id).orElse(null);
    }

    public Group addGroup(Group group){
        return groupRepo.save(group);
    }

    public Group updateGroup(Group group){
        return groupRepo.save(group);
    }

    public String deleteGroup(Long id){
        return getGroup(id)!=null ? "group with id = "+id+" deleted" : "no found with id = "+id+" deleted";
    }
}
