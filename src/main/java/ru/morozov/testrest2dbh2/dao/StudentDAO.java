package ru.morozov.testrest2dbh2.dao;

import ru.morozov.testrest2dbh2.entity.Student;

import java.util.List;
public interface StudentDAO {

    List<Student> getAllStudents();

    Student saveStudent (Student student);

    Student getStudent(int id);

    void deleteStudent(int id);


}
