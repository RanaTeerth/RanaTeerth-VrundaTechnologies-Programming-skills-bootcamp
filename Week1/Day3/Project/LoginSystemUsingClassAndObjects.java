package Week1.Day3.Project;

import java.util.Scanner;

/*
 * ClassName: User
 * 
 * Properties: 
 *  - User class contains of 2 class variables and a login method.
 * 
 * Variables:
 *  - uName: is the predefined username
 *  - pwd: is the predefined password
 * 
 * Methods: 
 *  - login() --> asks for the username and password and tells that valid credentials are entered or not.
 */
class User {
    private String uName;
    private String pwd;

    public void setCredentials() {
        uName = "Ishan23";
        pwd = "easy";
    }

    public void login() {
        // * Scanner class object to enter input from the user
        Scanner sc = new Scanner(System.in);

        // * variables to store username and password
        String uname, pwd;

        // * taking input from the user
        System.out.print("Enter username: ");
        uname = sc.nextLine();

        System.out.print("Enter password: ");
        pwd = sc.nextLine();

        // * here using the equals() method of the String class as the == operator is not working because we are getting the username and password from the object of a class.
        if (uname.equals(uName) || this.pwd.equals(pwd)) {
            System.out.println("Success !!");
        } else {
            System.out.println("Invalid username or password !!");
        }
    }

}

public class LoginSystemUsingClassAndObjects {
    public static void main(String[] args) {
        // * User class object to validate the login method
        User user = new User();
        // calling the setCredentials() method to initialze values of username and password
        user.setCredentials();
        // calling the login method
        user.login();
    }

}
