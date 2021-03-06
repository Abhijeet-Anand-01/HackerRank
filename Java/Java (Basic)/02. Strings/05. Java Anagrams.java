// Approach 1 : Easy => O(n^2)

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length())
            return false;
            
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        int counter = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            for (int i=0; i<a.length(); i++) {
                if (a.charAt(i) == c) 
                    counter++;
                
                if (b.charAt(i) == c) 
                    counter--;
            }
            if (counter != 0) 
                return false;
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}



// Approach 2 : Better => O(n)

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length())
            return false;
            
        a = a.toUpperCase();
        b = b.toUpperCase();
        
        int[] alphabets = new int[26];
        for (int i = 0; i < a.length(); i++) {
            alphabets[(int)a.charAt(i) % 65] += 1;
            alphabets[(int)b.charAt(i) % 65] -= 1;
        }
        for (int elem : alphabets) {
            if (elem != 0)
                return false;
        }
        
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

