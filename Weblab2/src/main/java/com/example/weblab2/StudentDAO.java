package com.example.weblab2;

import java.sql.SQLException;
import java.util.List;

public interface StudentDAO {
    void addStudent(Student student) throws SQLException;
    void updateStudent(Student student) throws SQLException;
    void deleteStudent(String sid) throws SQLException;
    List<Student> getAllStudents() throws SQLException;
    Student getStudentById(String sid) throws SQLException;
    Student getByName(String sql) throws SQLException;
}

