package homework.task_1.customException;

public class WrongLoginException extends Exception {
    private int wrongLoginExceptionCode;

    public WrongLoginException (int wrongLoginExceptionCode, String message) {
        super(message);
        this.wrongLoginExceptionCode = wrongLoginExceptionCode;
    }
    public WrongLoginException() {
    }
}
