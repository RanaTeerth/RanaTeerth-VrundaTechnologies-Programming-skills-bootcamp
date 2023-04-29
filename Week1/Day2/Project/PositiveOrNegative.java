/*
 * This program tells whether the number is negative or positive.
 */

package Week1.Day2.Project;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void getAns(int num){
        if(num > 0){ // num is positive
            System.out.println(num + " is positive. ");
        } else if(num < 0){ // num is negative
            System.out.println(num + " is negative. ");
        } else{ // num is 0
            System.out.println("Number is zero. ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = 0;
        
        System.out.print("Enter any int range number: ");
        num = sc.nextInt();

        getAns(num);
    }
}
