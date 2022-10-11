package com.ALU;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        int input_number; int reverse;
        Scanner user_input = new Scanner(System.in);
        System.out.println("Please input a number: ");
        input_number = user_input.nextInt();  // Read user input

        reverse = 0;
        // looping through the input_number as long as the input number is not equal to 0
        while(input_number!=0){
            int remainder = input_number %10; // finding the remainder(the right most digit) of the number inputed
            reverse = reverse *10 + remainder; // Adding our right most digit from the remainder to our reverse variable
            input_number = input_number / 10; //dividing by 10 to remove the right most number
        }
        // Printing the reverse to the user
        System.out.println("reverse : "+ reverse);
    }
}