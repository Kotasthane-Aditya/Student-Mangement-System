package com.example.Student.StudentSYS.service;

/**
 * Author :-  Aditya Kotasthane
 * Date :- 10/8/2024
 */

import com.example.Student.StudentSYS.model.Student;
import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudent(int id);
    public void deleteStudent(int id);
    public void deleteAllStudent();
    public Student putStudent(Student student);
}
