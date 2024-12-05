package com.example.Student.StudentSYS.controller;

/**
 * Author :-  Aditya Kotasthane
 * Date :- 10/8/2024
 */

import com.example.Student.StudentSYS.model.Student;
import com.example.Student.StudentSYS.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public String add(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "New Student Added";
    }

    @GetMapping
    public List<Student> getAllStudent() {
        return studentService.getAllStudents();
    }

    @RequestMapping(path = "/dtl", method = RequestMethod.DELETE)
    public String deleteall(){
        studentService.deleteAllStudent();
        return "delete all records";
    }

    @GetMapping("{id}")
    public Student getStudent(@PathVariable int id) {
        return studentService.getStudent(id);
    }

    @DeleteMapping("{id}")
    public String deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
        return "delete";
    }

    @PutMapping("{id}")
    public ResponseEntity<Student> updateEmployee(@RequestBody Student student) {
        Student updatedStudent = studentService.putStudent(student);
        return ResponseEntity.ok(updatedStudent);
    }

}
