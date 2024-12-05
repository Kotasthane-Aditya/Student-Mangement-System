package com.example.Student.StudentSYS.service;

/**
 * Author :-  Aditya Kotasthane
 * Date :- 10/8/2024
 */

import com.example.Student.StudentSYS.Repository.StudentRepository;
import com.example.Student.StudentSYS.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudent(int id) {
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public void deleteAllStudent() {
        studentRepository.deleteAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student putStudent(Student student) {
        return studentRepository.save(student);
    }

}
