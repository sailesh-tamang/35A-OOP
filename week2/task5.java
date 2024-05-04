package week2;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
                Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the number to check whether a year is a leap year or not");
        int intInput = scan1.nextInt();
            if (intInput%4==0  intInput%100 != 0  intInput%400 == 0) {
                System.out.printf("Leap Year %d", intInput);
            }
            else{
                System.out.println("No it is not");
            }
            scan1.close();
    }
    
}
