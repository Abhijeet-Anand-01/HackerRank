import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        double num2  = sc.nextDouble();
        sc.nextLine();
        String text = sc.nextLine();
        
        System.out.print("String: " + text + "\nDouble: " + num2 + "\nInt: " + num1);
    }
}
