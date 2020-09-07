package com.thoughtworks.capability.gtb.entrancequiz.api;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Group;
import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @CrossOrigin
    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudent() {
        List<Student> students = studentService.getAllStudent();
        return ResponseEntity.ok(students);
    }

    @CrossOrigin
    @PostMapping("/students")
    public ResponseEntity<List<Student>> createStudent(@RequestBody Student student) {
        List<Student> students = studentService.createStudent(student);
        return ResponseEntity.ok(students);
    }

    @CrossOrigin
    @PatchMapping("/students/divided")
    public ResponseEntity<List<Group>> divideStudent() {
        List<Group> groups = studentService.divideStudent();
        return ResponseEntity.ok(groups);
    }

    @CrossOrigin
    @GetMapping("/groups")
    public ResponseEntity<List<Group>> getAllGroups() {
        List<Group> groups = studentService.getAllGroups();
        return ResponseEntity.ok(groups);
    }
}
