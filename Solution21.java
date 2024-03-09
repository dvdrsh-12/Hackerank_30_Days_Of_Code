
// Day:20 - Sorting.

import java.util.*;

public class Solution21 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        int temp, numberOfSwaps = 0;

        if (n >= 2 && n <= 600) {

            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n - 1; j++) {

                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        numberOfSwaps++;
                    }

                }

            }

            System.out.println("Array is sorted in " + numberOfSwaps + " swaps.\nFirst Element: " + arr[0]
                    + "\nLast Element: " + arr[n - 1]);

        } else {
            System.out.print("Enter n ,2 <= n <= 600");
        }

        scan.close();

    }
}
