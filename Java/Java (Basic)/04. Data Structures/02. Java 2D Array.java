import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        
        int arr[][] = new int[6][6];
        
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 6; col++) {
                arr[row][col] = scan.nextInt();
            }
        }
        
        scan.close();
        
        int sum = 0;
        int max = Integer.MIN_VALUE;
        
        for(int row = 0; row < 4; row++) {
            for(int col = 0; col < 4; col++) {
                
                sum = arr[row][col] + arr[row][col+1] + arr[row][col+2]
                                    + arr[row+1][col+1] +
                          arr[row+2][col] + arr[row+2][col+1] + arr[row+2][col+2];
                          
                if(sum > max) 
                    max = sum;
            }
        }
        
        System.out.println(max);      
        
    }
}
