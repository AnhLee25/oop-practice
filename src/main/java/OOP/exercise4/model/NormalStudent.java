package OOP.exercise4.model;

import java.time.Instant;

public class NormalStudent extends Student {
    private Integer englishScore;
    private Float entryTestScore;
    
    public NormalStudent(String id, Integer type, String fullName, Instant doB, Integer sex, String phoneNumber, String universityName, Integer gradeLevel, Integer englishScore, Float entryTestScore) {
        super(id, type, fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }
    
    public NormalStudent(Integer englishScore, Float entryTestScore) {
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }
    
    public NormalStudent(Student student, Integer englishScore, Float entryTestScore) {
        super(student);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }
    
    public Integer getEnglishScore() {
        return englishScore;
    }
    
    public void setEnglishScore(Integer englishScore) {
        this.englishScore = englishScore;
    }
    
    public Float getEntryTestScore() {
        return entryTestScore;
    }
    
    public void setEntryTestScore(Float entryTestScore) {
        this.entryTestScore = entryTestScore;
    }
    
    public String showInfo() {
        super.showInfo();
        return "Student{" + "id='" + super.getId() + '\'' + ", fullName='" + super.getFullName() + '\'' + ", doB=" + super
                .getDoB() + ", sex=" + super.getSex() + ", phoneNumber='" + super.getPhoneNumber() + '\'' + ", universityName='" + super
                .getPhoneNumber() + '\'' + ", gradeLevel=" + super.getGradeLevel() + '\'' + ", englishScore=" + this.englishScore + '\'' + ", entryTestScore=" + this.entryTestScore + '}';
    }
}
