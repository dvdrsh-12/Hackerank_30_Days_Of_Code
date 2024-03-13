
// Day:29 - Bitwise AND.

import java.util.*;

class Result {

    public static int bitwiseAnd(int N, int K) {

        int max = 0;

        for (int i = 1; i < N; i++) {
            for (int j = i + 1; j <= N; j++) {
                int res = i & j;
                if (res < K && max < res) {
                    max = res;
                }
            }
        }

        return max;

    }

}

public class Solution30 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        if (T >= 1 && T <= 1000) {

            for (int t = 0; t < T; t++) {

                int N = sc.nextInt();
                int K = sc.nextInt();

                int ans = Result.bitwiseAnd(N, K);

                System.out.println(ans);

            }

        } else {
            System.out.print("Enter T ,1 <= T <= 1000");
        }

        sc.close();

    }
}
