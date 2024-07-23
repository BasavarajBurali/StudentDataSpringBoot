package com.student.studentdata.service;

import com.student.studentdata.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentService {

    @Autowired
    private StudentRepo studentRepo;
}
