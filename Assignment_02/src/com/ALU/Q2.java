package com.ALU;

import java.util.Random; // Random Class
import java.util.Scanner;

public class Q2 {
    // Question 02 has an extra txt file interpreting the Algorithm with the files

    public static void main(String[] args) {

        Random rand = new Random(); // Generate random Object
        int n = rand.nextInt(30); //  Generate randome number/variable
//        System.out.println(n);
        int x = 0; // The while condition
        int y = 1; // The number
        int g; //The guess
        int d; // The difference
        Scanner guess_input = new Scanner(System.in);  // Create a Scanner object

        while (x == 0) {
            System.out.println("I have a number in my mind, guess it: ");
            g = guess_input.nextInt();  // Read user input
            //----------------------------------------------

            if ((n > 0) & (g > 0) & (n > g)) {
                y += 1;
                d = n - g;


                if ((1 <= d) & (d <= 5)) {
                    System.out.println("The number is small");
                    System.out.println("Try Again");
                } else if ((6 <= d) & (d <= 15)) {
                    System.out.println("The number is too small");
                    System.out.println("Try Again");
                } else if ((16 <= d) & (d <= 25)) {
                    System.out.println("The number is extra small");
                    System.out.println("Try Again");
                } else if (((26 <= d) & (d <= 30)) || (d > 30))  {
                    System.out.println("You aren't even near");
                    System.out.println("Try Again");


                }
            } else if ((n > 0) & (g > 0) & (n < g)) {

                y += 1;
                d = g - n;

                if ((1 <= d) & (d <= 5)) {
                    System.out.println("The number is large");
                    System.out.println("Try Again");
                } else if ((6 <= d) & (d <= 15)) {
                    System.out.println("The number is too large");
                    System.out.println("Try Again");
                } else if ((16 <= d) & (d <= 25)) {
                    System.out.println("The number is extra large");
                    System.out.println("Try Again");
                } else if (((26 <= d) & (d <= 30)) || (d > 30))  {
                    System.out.println("You aren't even near");
                    System.out.println("Try Again");
                }


            } else if ((n > 0) & (g < 0) & (n > g)) {

                y += 1;
                d = n - g;

                if ((1 <= d) & (d <= 5)) {
                    System.out.println("The number is small");
                    System.out.println("Try Again");
                } else if ((6 <= d) & (d <= 15)) {
                    System.out.println("The number is too small");
                    System.out.println("Try Again");
                } else if ((16 <= d) & (d <= 25)) {
                    System.out.println("The number is extra small");
                    System.out.println("Try Again");
                } else if (((26 <= d) & (d <= 30)) || (d > 30))  {
                    System.out.println("You aren't even near");
                    System.out.println("Try Again");
                }
            } else if ((n < 0) & (g > 0) & (n < g)) {

                y += 1;
                d = g - n;

                if ((1 <= d) & (d <= 5)) {
                    System.out.println("The number is large");
                    System.out.println("Try Again");
                } else if ((6 <= d) & (d <= 15)) {
                    System.out.println("The number is too large");
                    System.out.println("Try Again");
                } else if ((16 <= d) & (d <= 25)) {
                    System.out.println("The number is extra large");
                    System.out.println("Try Again");
                } else if (((26 <= d) & (d <= 30)) || (d > 30))  {
                    System.out.println("You aren't even near");
                    System.out.println("Try Again");
                }
            } else if ((n < 0) & (g < 0) & (n > g)) {

                y += 1;
                d = -g + n;

                if ((1 <= d) & (d <= 5)) {
                    System.out.println("The number is small");
                    System.out.println("Try Again");
                } else if ((6 <= d) & (d <= 15)) {
                    System.out.println("The number is too small");
                    System.out.println("Try Again");
                } else if ((16 <= d) & (d <= 25)) {
                    System.out.println("The number is extra small");
                    System.out.println("Try Again");
                } else if (((26 <= d) & (d <= 30)) || (d > 30))  {
                    System.out.println("You aren't even near");
                    System.out.println("Try Again");
                }
            } else if ((n < 0) & (g < 0) & (n < g)) {

                y += 1;
                d = -n + g;

                if ((1 <= d) & (d <= 5)) {
                    System.out.println("The number is large");
                    System.out.println("Try Again");
                } else if ((6 <= d) & (d <= 15)) {
                    System.out.println("The number is too large");
                    System.out.println("Try Again");
                } else if ((16 <= d) & (d <= 25)) {
                    System.out.println("The number is extra large");
                    System.out.println("Try Again");
                } else if (((26 <= d) & (d <= 30)) || (d > 30)) {
                    System.out.println("You aren't even near");
                    System.out.println("Try Again");
                }

            }

            else if (n == g){
                System.out.printf("Your guess is right, and you have tried %d times before you get it, so don't feel smart", y);
                x = -1;
            }

        }


        }


}
