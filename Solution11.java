
// Day:10 - Binary Numbers.

import java.util.*;

public class Solution11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = "";
        int d, count = 0, temp = 0;

        if (n >= 1 && n <= 1000000) {

            while (n > 0) {

                d = n % 2;
                n = n / 2;
                str += d;

            }

            StringBuilder reversed = new StringBuilder(str).reverse();

            for (int i = 0; i < reversed.length(); i++) {

                if (reversed.charAt(i) == '1') {

                    count++;
                    temp = Math.max(temp, count);

                } else {
                    count = 0;
                }
            }

            System.out.println(temp);

        } else {
            System.out.println("Enter n ,1 <= n <= 1000000");
        }

        sc.close();

    }
}
