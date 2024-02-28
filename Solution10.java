
// Day:9 - Recursion 3.

import java.util.*;

public class Solution10 {

    public static int factorial(int n) {

        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n >= 2 && n <= 12) {

            int result = factorial(n);
            System.out.println(result);

        } else {

            System.out.println("Enter n ,2 <= n <= 12");
            System.exit(0);

        }

        sc.close();

    }
}
