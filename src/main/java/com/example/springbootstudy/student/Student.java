package com.example.springbootstudy.student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Student {
    private final Integer studentId;
    private final String studentName;

}
