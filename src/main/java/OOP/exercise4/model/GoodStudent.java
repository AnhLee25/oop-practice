package OOP.exercise4.model;

import java.time.Instant;

public class GoodStudent extends Student {
    private Float gpa;
    private String bestRewardName;
    
    public GoodStudent(String id, Integer type, String fullName, Instant doB, Integer sex, String phoneNumber, String universityName, Integer gradeLevel, Float gpa, String bestRewardName) {
        super(id, type, fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }
    
    public GoodStudent(Float gpa, String bestRewardName) {
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }
    
    public GoodStudent(Student student, Float gpa, String bestRewardName) {}
    
    public Float getGpa() {
        return gpa;
    }
    
    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }
    
    public String getBestRewardName() {
        return bestRewardName;
    }
    
    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }
    
    public String showInfo() {
        super.showInfo();
        return "Student{" + "id='" + super.getId() + '\'' + ", fullName='" + super.getFullName() + '\'' + ", doB=" + super
                .getDoB() + ", sex=" + super.getSex() + ", phoneNumber='" + super.getPhoneNumber() + '\'' + ", universityName='" + super
                .getPhoneNumber() + '\'' + ", gradeLevel=" + super.getGradeLevel() + '\'' + ", gpa=" + this.gpa + '\'' + ", bestRewardName=" + this.bestRewardName + '}';
    }
}
