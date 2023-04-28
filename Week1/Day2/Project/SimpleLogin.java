/*
 * This program is just a small login module.
 */

package Week1.Day2.Project;

public class SimpleLogin {
    public static void main(String[] args) {
        String uname = "Ishan";
        String pwd = "password";

        if (uname == "Ishan" || pwd == "password") {
            System.out.println("Welcome to the system");
        } else {
            System.out.println("Invalid Uname or Password");
        }
    }
}
