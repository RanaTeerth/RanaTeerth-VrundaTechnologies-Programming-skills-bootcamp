import java.io.*;
import java.util.*;

class Authentication {
    private String email;
    private String password;
    
    public Authentication(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPassword() {
        return password;
    }
}

public class UserAuthentication {
    private static HashMap<String, Authentication> users = new HashMap<>();
    private static final String FILE_NAME = "users.txt";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. User Registration");
            System.out.println("2. User Verification");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    registerUser(scanner);
                    break;
                case 2:
                    verifyUser(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
    
    private static void registerUser(Scanner scanner) {
        System.out.print("Enter your email: ");
        String email = scanner.next();
        
        // Check if user already exists
        if (users.containsKey(email)) {
            System.out.println("User already exists!");
            return;
        }
        
        System.out.print("Enter your password: ");
        String password = scanner.next();
        
        Authentication user = new Authentication(email, password);
        users.put(email, user);
        
        // Save user data to file
        saveUsersToFile();
        
        System.out.println("User registration successful!");
    }
    
    private static void verifyUser(Scanner scanner) {
        System.out.print("Enter your email: ");
        String email = scanner.next();
        
        // Check if user exists
        if (!users.containsKey(email)) {
            System.out.println("User not found!");
            return;
        }
        
        System.out.print("Enter your password: ");
        String password = scanner.next();
        
        Authentication user = users.get(email);
        if (user.getPassword().equals(password)) {
            System.out.println("Login Success");
        } else {
            System.out.println("Wrong credentials");
        }
    }
    
    private static void saveUsersToFile() {
        try {
            FileWriter fileWriter = new FileWriter(FILE_NAME);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            for (Map.Entry<String, Authentication> entry : users.entrySet()) {
                String email = entry.getKey();
                String password = entry.getValue().getPassword();
                bufferedWriter.write(email + "," + password);
                bufferedWriter.newLine();
            }
            
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }
}
