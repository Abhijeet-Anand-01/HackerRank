import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("================================");
        
        for(int i = 0; i < 3; i++){
            String text = sc.next();
            int num = sc.nextInt();
            
            System.out.printf("%-15s%03d%n", text, num);
            // System.out.print(num);    
        }
        
        System.out.print("================================");    
        
    }
}
