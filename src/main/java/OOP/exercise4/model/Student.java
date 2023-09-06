package OOP.exercise4.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Setter
@Getter
@AllArgsConstructor
public abstract class Student {
    private String id;
    private Integer type;
    private String fullName;
    private Instant doB;
    private Integer sex;
    private String phoneNumber;
    private String universityName;
    private Integer gradeLevel;
    
    public Student() {}
    
    public Student(Student student) {
        this.id = student.id;
        this.fullName = student.fullName;
        this.doB = student.doB;
        this.sex = student.sex;
        this.phoneNumber = student.phoneNumber;
        this.universityName = student.universityName;
        this.gradeLevel = student.gradeLevel;
    }
    
    public String showInfo() {
        return "Student{" + "id='" + id + '\'' + ", fullName='" + fullName + '\'' + ", doB=" + doB + ", sex=" + sex + ", phoneNumber='" + phoneNumber + '\'' + ", universityName='" + universityName + '\'' + ", gradeLevel=" + gradeLevel + '}';
    }
}
