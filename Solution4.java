
// Day:3 - Intro to Conditional Statements.

import java.util.*;

public class Solution4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n >= 1 && n <= 100) {

            if (n % 2 != 0) {
                System.out.println("Weird");
            } else {

                if (n >= 2 && n <= 5) {
                    System.out.println("Not Weird");
                } else if (n >= 6 && n <= 20) {
                    System.out.println("Weird");
                } else if (n > 20) {
                    System.out.println("Not Weird");
                }

            }

        } else {
            System.out.println("Enter n ,1 <= n <= 100");
        }
        
        sc.close();

    }
}
