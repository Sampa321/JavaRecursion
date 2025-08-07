package HomePractice.W3resource.Practice;

//QS3.Recursion Nth fibonacci Number range.

import java.util.Scanner;

public class FibonacciNumberUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if (n<0)
        {
            System.out.println("Please enter the correct input!");
        }
        else {
            System.out.println("Fibonacci series:");
            System.out.print("0"+" ");
            for(int i=1;i<=n;i++)
            {
                System.out.print(FibonacciCalculate(i)+" ");
            }
        }
    }

    public static int FibonacciCalculate(int n) {
        if (n == 1) {
            return 1;
        }
        else if(n==0)
        {
            return 0;
        }
        else {
            return FibonacciCalculate(n-1)+FibonacciCalculate(n-2);
        }

    }
}
