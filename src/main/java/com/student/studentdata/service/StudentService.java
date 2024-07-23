package com.student.studentdata.service;

import com.student.studentdata.entity.Student;
import com.student.studentdata.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;


    public Student saveStudent(Student student){
        return  studentRepo.save(student);
    }

    public List<Student> saveStudents(List<Student> students){
        return  studentRepo.saveAll(students);
    }

    public Student getStudent(int id){
        return studentRepo.findById(id).orElse(null);

    }

    public List<Student> getAllStudent(){
       return   studentRepo.findAll();

    }

    public  String deleteStudentById(int id){
        studentRepo.deleteById(id);
        return "student deleted";
    }

}
