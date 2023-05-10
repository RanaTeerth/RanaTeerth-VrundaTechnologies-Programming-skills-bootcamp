import java.util.Scanner;

class LoginSystem { // Create a class named LoginSystem.

    // Inside the class, define two private fields named email and password to store the pre-defined email and password.

    private String email;
    private String password;
    Scanner sc = new Scanner(System.in);

    // Define a method named setCredentials that initializes data members: email and password. The method should initialize the fields with the provided values.

    public void setCredentials() {
        email = "teerth12@gmail.com";
        password = "abc";
    }

    public void login() {
        // Define a method named login that takes two values from user: userEmail and userPassword.

        System.out.println("Enter your Email");
        String userEmail = sc.nextLine();

        System.out.println("Enter your Password");
        String userPassword = sc.nextLine();

        // The method should compare the provided email and password with the pre-defined values. If they match, print "Login Successful". Otherwise, print "Wrong Credentials".

        if (email.equals(userEmail) && password.equals(userPassword)) {
            System.out.println("Login Successful");

        } else {
            System.out.println("Wrong Credential");
        }

    }
}

// Define a main method that creates an object of the LoginSystem.

public class ProjectofDay3 {
    public static void main(String[] args) {
        LoginSystem l1 = new LoginSystem();

        // Now, call setCredentials to set values, Then call the login method with the provided values.
        l1.setCredentials();
        l1.login();
    }
}
