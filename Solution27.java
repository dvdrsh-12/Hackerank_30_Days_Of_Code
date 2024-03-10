
// Day:26 - Nested Logic.

import java.util.*;

public class Solution27 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int D1 = sc.nextInt();
        int M1 = sc.nextInt();
        int Y1 = sc.nextInt();
        int D2 = sc.nextInt();
        int M2 = sc.nextInt();
        int Y2 = sc.nextInt();
        int fine = 0;

        if (Y1 > Y2) {
            fine = 10000;
        } else if (Y1 == Y2) {

            if (M1 > M2) {
                fine = 500 * (M1 - M2);
            } else if (M1 == M2 && D1 > D2) {
                fine = 15 * (D1 - D2);
            }

        }

        System.out.println(fine);

        sc.close();

    }
}
