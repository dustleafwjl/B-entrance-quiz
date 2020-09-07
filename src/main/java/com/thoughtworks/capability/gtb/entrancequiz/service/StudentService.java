package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    List<Student> students = new ArrayList();
    {
        students.add(new Student("1", "沈乐棋", ""));
        students.add(new Student("2", "徐慧慧", ""));
        students.add(new Student("3", "陈思聪", ""));
        students.add(new Student("5", "王江林", ""));
        students.add(new Student("6", "王登宇", ""));
        students.add(new Student("7", "杨思雨", ""));
        students.add(new Student("8", "江雨舟", ""));
        students.add(new Student("9", "廖燊", ""));
        students.add(new Student("10", "胡晓", ""));
        students.add(new Student("11", "但杰", ""));
        students.add(new Student("12", "盖迈达", ""));
        students.add(new Student("13", "肖美琦", ""));
        students.add(new Student("14", "黄云洁", ""));
        students.add(new Student("15", "齐瑾浩", ""));
        students.add(new Student("16", "刘亮亮", ""));
        students.add(new Student("17", "肖逸凡", ""));
        students.add(new Student("18", "王作文", ""));
        students.add(new Student("7", "郭瑞凌", ""));
        students.add(new Student("7", "李明豪", ""));
        students.add(new Student("7", "党泽", ""));
        students.add(new Student("7", "肖伊佐", ""));
        students.add(new Student("7", "贠晨曦", ""));
        students.add(new Student("7", "李康宁", ""));
        students.add(new Student("7", "马庆", ""));
        students.add(new Student("7", "商婕", ""));
        students.add(new Student("7", "余榕", ""));
        students.add(new Student("7", "谌哲", ""));
        students.add(new Student("7", "董翔锐", ""));
        students.add(new Student("7", "陈泰宇", ""));
        students.add(new Student("7", "赵允齐", ""));
        students.add(new Student("7", "张柯", ""));
        students.add(new Student("7", "廖文强", ""));
        students.add(new Student("7", "刘轲", ""));
        students.add(new Student("7", "廖浚斌", ""));
        students.add(new Student("7", "凌凤仪", ""));
    }

    public List<Student> getAllStudent() {
        return students;
    }
}
