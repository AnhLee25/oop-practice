package OOP.exercise4.constants;

public class SQLQuery {
    public static String CREATE_STUDENT =
            "INSERT INTO student " + "(`id`, `fullName`, `doB`, `sex`, `phoneNumber`, `universityName`, `gradeLevel`," + " `gpa`, `bestRewardName`," + " englishScore, entryTestScore, type) " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public static String UPDATE_STUDENT =
            "" + "UPDATE `student_management`.`student` " + "SET `id` = ?," + " `fullName` = ?," + " `doB` = ?, " + " `sex` = ?," + " `phoneNumber` = ?," + " `universityName` = ?," + " `gradeLevel` = ?," + " `gpa` = ?," + " `bestRewardName` = ?," + " `englishScore` = ?," + " `entryTestScore` = ?" + " WHERE (`id` = ?)";
    public static String DELETE_STUDENT = "DELETE FROM student WHERE id = ?";
    public static String GET_STUDENT =
            "SELECT* FROM student WHERE id like '?' ORDER BY TYPE DESC, GPA DESC, fullName " + "DESC, " + "englishScore DESC, entryTestScore DESC";
}
