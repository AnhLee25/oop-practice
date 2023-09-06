package OOP.exercise4.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import OOP.exercise4.config.DatabaseConnection;
import OOP.exercise4.model.GoodStudent;
import OOP.exercise4.model.NormalStudent;
import OOP.exercise4.model.Student;

import static OOP.exercise4.constants.SQLQuery.CREATE_STUDENT;
import static OOP.exercise4.constants.SQLQuery.GET_STUDENT;
import static OOP.exercise4.constants.Sex.MALE;
import static OOP.exercise4.constants.StudentColumn.BEST_REWARD_NAME;
import static OOP.exercise4.constants.StudentColumn.DOB;
import static OOP.exercise4.constants.StudentColumn.ENGLISH_SCORE;
import static OOP.exercise4.constants.StudentColumn.ENTRY_TEST_SCORE;
import static OOP.exercise4.constants.StudentColumn.FULLNAME;
import static OOP.exercise4.constants.StudentColumn.GPA;
import static OOP.exercise4.constants.StudentColumn.GRADE_LEVEL;
import static OOP.exercise4.constants.StudentColumn.ID;
import static OOP.exercise4.constants.StudentColumn.PHONE_NUMBER;
import static OOP.exercise4.constants.StudentColumn.SEX;
import static OOP.exercise4.constants.StudentColumn.TYPE;
import static OOP.exercise4.constants.StudentColumn.UNIVERSITY_NAME;
import static OOP.exercise4.constants.StudentType.GOOD;
import static OOP.exercise4.constants.StudentType.NORMAL;

public class StudentRepositoryImpl implements StudentRepository {
    private Connection connection = null;
    
    public void createStudent(Student student) {
        try {
            connection = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(CREATE_STUDENT);
            preparedStatement.setString(ID.getIndex(), UUID.randomUUID().toString());
            preparedStatement.setString(FULLNAME.getIndex(), student.getId());
            preparedStatement.setDate(DOB.getIndex(), (Date) Date.from(student.getDoB()));
            preparedStatement.setInt(SEX.getIndex(), MALE.getValue());
            preparedStatement.setString(PHONE_NUMBER.getIndex(), student.getPhoneNumber());
            preparedStatement.setString(UNIVERSITY_NAME.getIndex(), student.getUniversityName());
            preparedStatement.setInt(GRADE_LEVEL.getIndex(), student.getGradeLevel());
            preparedStatement.setInt(TYPE.getIndex(), student.getType());
            if (student instanceof GoodStudent) {
                preparedStatement.setFloat(GPA.getIndex(), ((GoodStudent) student).getGpa());
                preparedStatement.setString(BEST_REWARD_NAME.getIndex(), ((GoodStudent) student).getBestRewardName());
            } else if (student instanceof NormalStudent) {
                preparedStatement.setInt(BEST_REWARD_NAME.getIndex(), ((NormalStudent) student).getEnglishScore());
                preparedStatement.setFloat(ENTRY_TEST_SCORE.getIndex(), ((NormalStudent) student).getEntryTestScore());
                preparedStatement.executeUpdate();
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public List<Student> getAllStudent() {
        List<Student> studentList = new ArrayList<>();
        try {
            connection = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(GET_STUDENT);
            preparedStatement.setString(1, "%%");
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
                String id = resultSet.getString(ID.getName());
                String fullName = resultSet.getString(ID.getName());
                Date doB = resultSet.getDate(DOB.getName());
                Integer sex = resultSet.getInt(SEX.getName());
                String phoneNumber = resultSet.getString(PHONE_NUMBER.getName());
                String universityName = resultSet.getString(UNIVERSITY_NAME.getName());
                Integer gradeLevel = resultSet.getInt(GRADE_LEVEL.getName());
                Integer type = resultSet.getInt(TYPE.getName());
                if (NORMAL.getValue().equals(type)) {
                    Integer englishScore = resultSet.getInt(ENGLISH_SCORE.getName());
                    Float entryTestScore = resultSet.getFloat(ENTRY_TEST_SCORE.getName());
                    Student student =
                            new NormalStudent(id, type, fullName, doB.toInstant(), sex, phoneNumber, universityName,
                                              gradeLevel, englishScore, entryTestScore);
                    studentList.add(student);
                } else if (GOOD.getValue().equals(type)) {
                    Float gpa = resultSet.getFloat(GPA.getName());
                    String bestRewardName = resultSet.getString(BEST_REWARD_NAME.getName());
                    Student student =
                            new GoodStudent(id, type, fullName, doB.toInstant(), sex, phoneNumber, universityName,
                                            gradeLevel, gpa, bestRewardName);
                    studentList.add(student);
                }
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return studentList;
    }
    
    public void updateStudent(String id, Student student) {}
    
    public void deleteStudent(String id) {}
}
