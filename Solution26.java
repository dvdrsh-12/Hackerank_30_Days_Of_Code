
// Day:25 - Running Time and Complexity.

import java.util.*;

public class Solution26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] numbers = new int[T];

        if (T >= 1 && T <= 30) {

            for (int i = 0; i < T; i++) {
                numbers[i] = sc.nextInt();
            }

            for (int i = 0; i < T; i++) {

                boolean flag = false;
                int n = numbers[i];

                if (n == 1) {
                    System.out.println("Not prime");
                } else {
                    for (int j = 2; j <= Math.sqrt(n); j++) {
                        if (n % j == 0) {
                            flag = true;
                            break;
                        }
                    }

                    if (flag) {
                        System.out.println("Not prime");
                    } else {
                        System.out.println("Prime");
                    }

                }

            }

        } else {
            System.out.print("Enter T ,1 <= T <= 30");
        }

        sc.close();

    }
}
