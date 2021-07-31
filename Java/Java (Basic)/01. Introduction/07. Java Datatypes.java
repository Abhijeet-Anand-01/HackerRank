import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        
        while(test-- > 0){
            
            try{
            long num = sc.nextLong();
            System.out.println(num + " can be fitted in:");
            
            if(num >= -Math.pow(2, 7)  && num <= Math.pow(2, 7) - 1)
                System.out.println("* byte");

            if(num >= -Math.pow(2, 15)  && num <= Math.pow(2, 15) - 1)
                System.out.println("* short");

            if(num >= -Math.pow(2, 31)  && num <= Math.pow(2, 31) - 1)
                System.out.println("* int");

            if(num >= -Math.pow(2, 63)  && num <= Math.pow(2, 63) - 1)
                System.out.println("* long");
               
            }
            catch(Exception e){
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
            
        }
    }
}
