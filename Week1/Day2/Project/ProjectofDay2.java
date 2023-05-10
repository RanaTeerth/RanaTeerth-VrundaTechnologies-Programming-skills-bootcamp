class ProjectofDay2 {   //Create a class named ProjectofDay2 
    public static void main(String[] args) {
        String email1 = "teerth@email.com";  //Store email
        String password1 = "a1b2c3";         //store password
        String userEmail = "test@email.com";   //store userEmail
        String userPassword = "xyz";           //Store userPassword
        if(email.equals(userEmail)){           //compare email1 and useremail
            if(password.equals(userPassword)){ //if email1 and useremail is matched then compare password1 and userPassword
                System.out.println("Success"); //if both email and password match then print Success
            }else{
                System.out.println("Wrong Credentials"); //if both email matched but password not matched then print Wrong Credentials.
            }
        }else{
            System.out.println("Wrong Credentials");  //if both email not matched then print Wrong Credentials
        }
    }
}
