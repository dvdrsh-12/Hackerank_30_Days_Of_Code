
// Day:14 - Scope.

import java.util.*;

class Difference {

    private int[] elements;
    public int maximumDifference = Integer.MIN_VALUE;
    int diff = 0;

    Difference(int[] elements) {
        this.elements = elements;
    }

    void computeDifference() {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length - i; j++) {

                diff = Math.abs(elements[i] - elements[j]);

                if (maximumDifference < diff) {
                    maximumDifference = diff;
                }

            }
        }
    }
}

public class Solution15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n >= 1 && n <= 10) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Difference difference = new Difference(a);

            difference.computeDifference();

            System.out.print(difference.maximumDifference);
        } else {
            System.out.print("Enter n ,1 <= n <= 10");
        }

        sc.close();

    }
}
