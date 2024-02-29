
// Day:11 - 2D Arrays.

import java.util.*;

public class Solution12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {

                int temp = sc.nextInt();

                if (temp >= -9 && temp <= 9) {
                    arr[i][j] = temp;
                }

            }
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {

                if (i + 2 < 6 && j + 2 < 6) {

                    int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
                            + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                    if (sum > max) {
                        max = sum;
                    }

                }
                
            }
        }

        System.out.println(max);

        sc.close();

    }
}
