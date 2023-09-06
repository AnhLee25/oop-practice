package OOP.exercise4.repository;

import java.util.List;

import OOP.exercise4.model.Student;

public interface StudentRepository {
    void createStudent(Student student);
    
    List<Student> getAllStudent();
    
    void updateStudent(String id, Student student);
    
    void deleteStudent(String id);
}
