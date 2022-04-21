// Approach 1 : Reverse string

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();
        String rev = "";
        for(int i = 0; i < A.length(); i++) 
            rev = A.substring(i, i+1) + rev;
        
        if(A.equals(rev))
            System.out.println("Yes");
        
        else System.out.println("No");
        
    }
}



// Approach 2 : Direct check

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();
        boolean flag = true;
        int start = 0, end = A.length() - 1;
        while (start < end) {
            if (A.charAt(start++) != A.charAt(end--))
                flag = false;
        }
        
        if (flag)
            System.out.println("Yes");
        else System.out.println("No");
    }
}
