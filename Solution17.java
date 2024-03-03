
// Day:16 - Exceptions-String to Integer.

import java.util.*;

public class Solution17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        try {
            int num = Integer.parseInt(S);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }

        sc.close();
        
    }
}
