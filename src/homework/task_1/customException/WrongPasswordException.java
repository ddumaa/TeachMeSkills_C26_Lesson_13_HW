package homework.task_1.customException;

public class WrongPasswordException extends Exception {
    private int wrongPasswordExceptionCode;

    public WrongPasswordException (int wrongLoginExceptionCode, String message) {
        super(message);
        this.wrongPasswordExceptionCode = wrongLoginExceptionCode;
    }
    public WrongPasswordException() {
    }
}
