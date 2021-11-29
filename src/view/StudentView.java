package view;

import controller.StudentController;
import model.Student;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    Scanner scanner = new Scanner(System.in);
    StudentController studentController = new StudentController();
    List<Student> studentList = studentController.showListStudent();

    public void viewShowStudentList() {
        System.out.println(studentList);
    }

    public void viewCreateStudent() {
        int id;
        if (studentList.size() == 0) {
            id = 1;
        } else {
            id = studentList.get(studentList.size() - 1).getId() + 1;
        }
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Age: ");
        int age = Integer.parseInt(scanner.nextLine());
        Student student = new Student(id, name, age);
        studentController.createStudent(student);
    }
}
