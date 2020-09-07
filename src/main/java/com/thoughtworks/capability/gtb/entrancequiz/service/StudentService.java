package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Group;
import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import com.thoughtworks.capability.gtb.entrancequiz.dto.GroupDto;
import com.thoughtworks.capability.gtb.entrancequiz.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class StudentService {

    List<Group> groups = GroupDto.groups;

    public List<Student> getAllStudent() {
        return StudentDto.students;
    }

    public List<Student> createStudent(Student student) {
        StudentDto.students.add(student);
        return StudentDto.students;
    }

    public List<Group> divideStudent() {
        groups.clear();
        List<String> initGroup = GroupDto.initGroup;
        initGroup.stream().forEach(name -> groups.add(new Group(name)));
        Random random = new Random();
        int index = 0;
        List<Student> studentsCopy = new ArrayList<>();
        studentsCopy.addAll(StudentDto.students);
        int size = studentsCopy.size();
        for (int i = 0; i < size; i ++) {
            int randNum = random.nextInt(studentsCopy.size());
            groups.get(index).addStudent(studentsCopy.remove(randNum));
            index = ++ index % groups.size();
        }
        return groups;
    }

    public List<Group> getAllGroups() {
        return groups;
    }
}
