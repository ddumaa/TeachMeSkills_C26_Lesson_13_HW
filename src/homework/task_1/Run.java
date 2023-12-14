package homework.task_1;

import homework.task_1.customException.WrongLoginException;
import homework.task_1.customException.WrongPasswordException;
import homework.task_1.registration.Registration;

import java.util.Locale;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        boolean registration = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create your login, the login must contain less than 20 characters and have no spaces.");
        String login = scanner.nextLine();
        System.out.println("Create your own password, the password must contain less than 20 characters, contain numbers, and have no spaces.");
        String password = scanner.nextLine();
        System.out.println("Repeat the password, it must match the password you entered earlier");
        String confirmPassword = scanner.nextLine();

        try {
            registration = Registration.newUser(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("The login does not match the required parameters, it is more than 20 characters or has spaces");
        } catch (WrongPasswordException e) {
            System.out.println("The password does not meet the required parameters, it is more than 20 characters, does not have numbers or has spaces");
        } catch (Exception e) {
            System.out.println("Password mismatch");
        }

        if(registration == true){
            System.out.println("\nUser created" + "\nLogin: "+ login + "\nPassword: " + password);
        }else{
            System.out.println("\nError creating user");
        }
    }
}
