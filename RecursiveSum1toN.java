package HomePractice.W3resource;

import java.util.Scanner;

public class RecursiveSum1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range:");
        int n = sc.nextInt();
        if (n<=0)
        {
            System.out.println("Enter the correct range that is greater than 0 :)");
        }
        else {
            int result = addNumber(n);
            System.out.println("Sum of 1 to "+n+" is : "+result);
        }
    }
    public static int addNumber(int r)
    {
        if(r==1)
        {
            return 1;
        }
        else {
            return r+addNumber(r-1);
        }
    }
}
