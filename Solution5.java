
// Day:3 - Class vs. Instance.

import java.util.*;

public class Solution5 {

    private int age;

    public Solution5(int initialAge) {

        if (initialAge >= 0) {
            this.age = initialAge;
        } else {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }

    }

    public void amIOld() {

        if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }

    }

    public void yearPasses() {

        age++;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        if (T >= 1 && T <= 4) {

            for (int i = 0; i < T; i++) {

                int age = sc.nextInt();

                if (age >= -5 && age <= 30) {

                    Solution5 p = new Solution5(age);
                    p.amIOld();

                    for (int j = 0; j < 3; j++) {
                        p.yearPasses();
                    }

                    p.amIOld();
                    System.out.println();

                } else {
                    System.out.println("Enter age ,-5 <= age <= 30");
                }
            }

        } else {
            System.out.println("Enter T ,1 <= T <= 4");
        }

        sc.close();

    }
}
