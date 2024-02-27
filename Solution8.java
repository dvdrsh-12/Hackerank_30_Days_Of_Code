
// Day:1 - Dictionaries and Maps.

import java.util.*;

public class Solution8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> phone_book = new HashMap<>();
        int n = sc.nextInt();

        if (n >= 1 && n <= 100000) {

            for (int i = 0; i < n; i++) {

                String name = sc.next();
                int phone = sc.nextInt();

                phone_book.put(name, phone);

            }

            while (sc.hasNext()) {

                String search = sc.next();

                if (phone_book.containsKey(search)) {
                    System.out.println(search + "=" + phone_book.get(search));
                } else {
                    System.out.println("Not found");
                }

            }

        } else {
            System.out.println("Enter n ,1 <= n <= 100000");
        }

        sc.close();

    }
}
