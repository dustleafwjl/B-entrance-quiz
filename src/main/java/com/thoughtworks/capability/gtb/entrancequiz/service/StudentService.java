package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Group;
import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class StudentService {
    List<Student> students = new ArrayList();
    {
        students.add(new Student("沈乐棋", ""));
        students.add(new Student("徐慧慧", ""));
        students.add(new Student("陈思聪", ""));
        students.add(new Student("王江林", ""));
        students.add(new Student("王登宇", ""));
        students.add(new Student("杨思雨", ""));
        students.add(new Student("江雨舟", ""));
        students.add(new Student("廖燊", ""));
        students.add(new Student("胡晓", ""));
        students.add(new Student("但杰", ""));
        students.add(new Student("盖迈达", ""));
        students.add(new Student("肖美琦", ""));
        students.add(new Student("黄云洁", ""));
        students.add(new Student("齐瑾浩", ""));
        students.add(new Student("刘亮亮", ""));
        students.add(new Student("肖逸凡", ""));
        students.add(new Student("王作文", ""));
        students.add(new Student("郭瑞凌", ""));
        students.add(new Student("李明豪", ""));
        students.add(new Student("党泽", ""));
        students.add(new Student("肖伊佐", ""));
        students.add(new Student("贠晨曦", ""));
        students.add(new Student("李康宁", ""));
        students.add(new Student("马庆", ""));
        students.add(new Student("商婕", ""));
        students.add(new Student("余榕", ""));
        students.add(new Student("谌哲", ""));
        students.add(new Student("董翔锐", ""));
        students.add(new Student("陈泰宇", ""));
        students.add(new Student("赵允齐", ""));
        students.add(new Student("张柯", ""));
        students.add(new Student("廖文强", ""));
        students.add(new Student("刘轲", ""));
        students.add(new Student("廖浚斌", ""));
        students.add(new Student("凌凤仪", ""));
    }

    public List<Student> getAllStudent() {
        return students;
    }

    public List<Student> createStudent(Student student) {
        students.add(student);
        return students;
    }

    public List<Group> divideStudent() {
        List<String> initGroup = Arrays.asList("Team 1", "Team 2", "Team 3", "Team 4", "Team 5", "Team 6");
        List<Group> groups = new ArrayList<>();
        initGroup.stream().forEach(name -> groups.add(new Group(name)));
        Random random = new Random();
        int index = 0;
        for (int i = 0; i < students.size(); i ++) {
            int randNum = random.nextInt(students.size() - 1);
            groups.get(index).addStudent(students.subList(randNum, randNum+1).get(0));
            index = ++ index % groups.size();
        }
        return groups;
    }
}
