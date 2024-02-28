
// Day:7 - Arrays.

import java.util.*;

public class Solution8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[1000];

        if (N >= 1 && N <= 1000) {

            for (int i = 0; i < N; i++) {

                int temp = sc.nextInt();

                if (temp >= 1 && temp <= 10000) {
                    arr[i] = temp;
                } else {
                    System.out.println("Enter element ,1 <= element <= 10000");
                }
            }

            for (int i = N - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }

        } else {
            System.out.println("Enter N ,1 <= N <= 1000");
        }

        sc.close();

    }
}
