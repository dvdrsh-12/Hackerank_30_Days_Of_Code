
// Day:28 - RegEx, Patterns, and Intro to Databases.

import java.util.*;

public class Solution29 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<String> emails = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String firstName = sc.next();
            String emailId = sc.next();

            if (emailId.endsWith("@gmail.com")) {
                emails.add(firstName);
            }

        }

        Collections.sort(emails);

        for (String user : emails) {
            System.out.println(user);
        }

        sc.close();
        
    }
}
