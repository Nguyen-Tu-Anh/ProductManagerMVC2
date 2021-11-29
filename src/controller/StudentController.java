package controller;

import model.Student;
import service.StudentServiceImpl;

import java.util.List;

public class StudentController {
    StudentServiceImpl studentService = new StudentServiceImpl();

    public List<Student> showListStudent() {
        return studentService.findAll();
    }

    public void createStudent(Student student) {
        studentService.save(student);

    }
}
