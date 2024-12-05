package com.example.Student.StudentSYS.Repository;

/**
 * Author :-  Aditya Kotasthane
 * Date :- 10/8/2024
 */

import com.example.Student.StudentSYS.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
