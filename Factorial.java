package HomePractice.W3resource.Practice;

/*Q1.Write a java recursive method to calculate the factorial of a given positive integer. */

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        if(n>=0)
        {
            int r = calculateFactorial(n);
            System.out.println("Factorial of "+n+" : "+r);
        }
        else {
            System.out.println("Factorial calculation can't possible!");
        }
    }

    public static int calculateFactorial(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else {
            return n*calculateFactorial(n-1);
        }
    }

}

