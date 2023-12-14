package homework.task_1.registration;

import homework.task_1.customException.WrongLoginException;
import homework.task_1.customException.WrongPasswordException;

public class Registration {
    static int length = 20;
    public static boolean newUser (String login, String password, String confirmPassword) throws Exception {
        if (login.length() > length || login.contains(" ")){
            throw new WrongLoginException(1, "the login does not match the required parameters, it is more than 20 characters or has spaces");
        }
        if (password.length() > length || password.contains(" ") || password.matches("^\\D*$")){
            throw new WrongPasswordException(2, "the password does not meet the required parameters, it is more than 20 characters, does not have numbers or has spaces.");
        }
        if (!confirmPassword.equals(password)){
            throw new Exception ("Password mismatch");
        }
        return true;
    }
}
