package OOP.exercise4.exception;

public class InvalidDOBException extends Exception {
    private String message;
    
    public InvalidDOBException(String message) {
        super(message);
    }
}
