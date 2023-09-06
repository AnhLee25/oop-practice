package OOP.exercise4.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import OOP.exercise4.model.Student;
import OOP.exercise4.repository.StudentRepository;
import lombok.RequiredArgsConstructor;

import static OOP.exercise4.constants.CustomDateFormat.DATE_SPLASH;
import static OOP.exercise4.constants.ValidPhoneNumber.VALID_PHONE_NUMBER;

@RequiredArgsConstructor
public class StudentService implements IStudentService {
    private final StudentRepository studentRepository;
    
    public static boolean isValidDateFormat(String input) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_SPLASH);
        simpleDateFormat.setLenient(false); // Disable leniency to require strict parsing
        try {
            Date date = simpleDateFormat.parse(input);
            return true;
        }
        catch (ParseException e) {
            return false;
        }
    }
    
    public static boolean isValidPhoneNumber(String phoneNumber) {
        for (String prefix : VALID_PHONE_NUMBER) {
            if (phoneNumber.startsWith(prefix)) {
                return true;
            }
        }
        return false;
    }
    
    public List<Student> getAllStudent() {
        return studentRepository.getAllStudent();
    }
    
    public void createStudent(Student student) {
        studentRepository.createStudent(student);
    }
    
    public void updateStudent() {}
}
