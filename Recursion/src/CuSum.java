import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CuSum {
    // a simple program to calculate a cumulative sum
    // using a recursive method call

    static BufferedReader In = new BufferedReader( new
            InputStreamReader(System.in));

    // for comparison, here is an iterative version
/*    public static int iterativeCuSum(int n){
        int result = 0;

        for(int i = 0; i <= n; i++)
            result += i;
        return result;
    }*/
    // first attempt wrong - recursive algorithm to calculate a factorial
/*    public static int iterativeCuSum(int n){
        int result = 0;
        for (int i = 0; i <= n; i++)
            result = iterativeCuSum(n-1)*n;
        return result;
    }*/

    // here is the recursive version
/*    public static int recursiveCuSum(int n) {
        if (n == 1)
            return 1;
        else
            return (n + recursiveCuSum(n - 1));
    }*/

    // recursive algorithm to calculate a factorial
/*    public static int recursiveCuSum(int n) {
        if (n == 1)
            return 1;
        else
            return (n * recursiveCuSum(n - 1));
    }*/

    // recursive algorithm to determine a palindrome
    public static boolean isPalindrome(String s) {
        if(s.length() == 0 || s.length() == 1)
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
            return isPalindrome(s.substring(1, s.length()-1));
        return false;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("type a word to check if its a palindrome or not");
        String x = sc.nextLine();
        if(isPalindrome(x))
            System.out.println(x + " is a palindrome");
        else
            System.out.println(x + " is not a palindrome");
    }




   /* public static void main(String args[]) throws java.io.IOException{

        System.out.print("Enter a number (0 to quit): ");
        int number = Integer.parseInt(In.readLine());

        while(number != 0){
            System.out.print("The cusum of " + number + " is ");
            System.out.println(recursiveCuSum(number));

            System.out.print("Enter a number (0 to quit): ");
            number = Integer.parseInt(In.readLine());
        }
    }*/
}
