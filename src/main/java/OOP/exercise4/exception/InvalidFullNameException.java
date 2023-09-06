package OOP.exercise4.exception;

public class InvalidFullNameException extends Exception {
    private String message;
    
    public InvalidFullNameException(String message) {
        super(message);
    }
}
