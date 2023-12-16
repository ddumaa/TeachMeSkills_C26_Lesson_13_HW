package homework.task_1.registration;

import homework.task_1.customException.WrongLoginException;
import homework.task_1.customException.WrongPasswordException;
import homework.task_1.utils.EConsts;

public class Registration {

    public static boolean newUserRegistration (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > EConsts.LENGTH || login.contains(" ")){
            throw new WrongLoginException(10, "the login does not match the required parameters, it is more than 20 characters or has spaces");
        }
        //изначально использовал данную часть !password.matches("\\d+") - и она не работала
        if (password.length() > EConsts.LENGTH || password.contains(" ") || password.matches("^\\D*$")){
            throw new WrongPasswordException(20, "the password does not meet the required parameters, it is more than 20 characters, does not have numbers or has spaces.");
        }
        if (!confirmPassword.equals(password)){
            throw new WrongPasswordException ();
        }
        return true;
    }
}
