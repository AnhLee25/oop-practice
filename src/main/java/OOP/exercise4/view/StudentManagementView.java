package OOP.exercise4.view;

import java.util.Scanner;

public class StudentManagementView {
    public static int getActionType(Scanner scanner) {
        System.out.println(
                "Please input a number to choose action type,\n" + "[1] add new student,\n" + "[2] update a student,\n" + "[3] get all students,\n" + "[4] get qualified students,\n" + "[5] delete student,\n" + "[6] to exit program");
        int actionType = scanner.nextInt();
        scanner.nextLine();
        return actionType;
    }
    
    public static int getStudentType(Scanner scanner) {
        System.out.println(
                "Please input a number to choose student type,\n" + "[1] Good Student,\n" + "[2] Normal Student");
        int studentTypeInput = scanner.nextInt();
        scanner.nextLine();
        return studentTypeInput;
    }
    
    public static String getStudentId(Scanner scanner) {
        System.out.print("Enter student id: ");
        return scanner.nextLine();
    }
}
