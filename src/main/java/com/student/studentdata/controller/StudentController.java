package com.student.studentdata.controller;

import com.student.studentdata.entity.Student;
import com.student.studentdata.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/saveStudent")
    public Student addStudent(@RequestBody Student student){
        return  studentService.saveStudent(student);
    }

    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> students){
        return studentService.saveStudents(students);
    }

    @GetMapping("/getStudent/{id}")
    public Student getStudent(@PathVariable int id){
        return  studentService.getStudent(id);
    }

    @GetMapping("/getAllStudent")
    public  List<Student>  getAllStudent(){
         return studentService.getAllStudent();
    }

    @DeleteMapping("/deleteStudent/{id}")
    public  String deleteStudentById(@PathVariable int id){
        studentService.deleteStudentById(id);
        return "Student deleted";
    }
}
