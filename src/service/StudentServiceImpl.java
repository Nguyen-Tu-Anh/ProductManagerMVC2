package service;

import config.ConfigReadAndWriteFile;
import model.Student;

import java.io.IOException;
import java.util.List;

public class StudentServiceImpl implements IStudentService {
    public String PATH_STUDENT = "D:\\[1] InteliJ project\\2 ProductMannager\\src\\file\\student.txt";
    ConfigReadAndWriteFile configReadAndWriteFile = new ConfigReadAndWriteFile();
    List<Student> studentList = configReadAndWriteFile.readFromFile(PATH_STUDENT);

    @Override
    public List<Student> findAll() {
        try {
            configReadAndWriteFile.writeToFile(PATH_STUDENT, studentList);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentList;
    }

    @Override
    public void save(Student student) {
        studentList.add(student);
    }
}
