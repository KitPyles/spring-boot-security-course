package com.example.demo.student;

// created by kp on 2/22/2023

public class Student {

    private final Integer studentId;
    private final String studentName;

    public Student(Integer studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}
