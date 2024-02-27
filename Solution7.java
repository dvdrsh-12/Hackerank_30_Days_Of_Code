
// Day:0 - Let's Review.

import java.util.*;

public class Solution7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine(); // to consume the newline character
        String[] arr = new String[T];

        if (T >= 1 && T <= 10) {

            for (int i = 0; i < T; i++) {
                arr[i] = sc.nextLine();
                if (arr.length > 10000 && arr.length < 2) {
                    System.out.println("Enter string of length ,2 <= length <= 10000");
                    System.exit(0);
                }
            }

            for (int i = 0; i < T; i++) {
                String arr1 = "";

                for (int j = 0; j < arr[i].length(); j += 2) {
                    arr1 += arr[i].charAt(j);
                }

                arr1 += " ";

                for (int j = 1; j < arr[i].length(); j += 2) {
                    arr1 += arr[i].charAt(j);
                }

                System.out.println(arr1.trim());
            }
        } else {
            System.out.println("Enter T ,1 <= T <= 10");
        }

        sc.close();

    }
}
