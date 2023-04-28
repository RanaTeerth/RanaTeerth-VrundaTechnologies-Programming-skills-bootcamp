/*
 * This program tells whether the number is negative or positive.
 */

package Week1.Day2.Project;

public class PositiveOrNegative {
    public static void main(String[] args){
        int num = 0;
        
        if(num > 0){ // num is positive
            System.out.println(num + " is positive. ");
        } else if(num < 0){ // num is negative
            System.out.println(num + " is negative. ");
        } else{ // num is 0
            System.out.println("Number is zero. ");
        }
    }
}
