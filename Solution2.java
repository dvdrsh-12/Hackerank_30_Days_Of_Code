
// Day:1 - Data Types.

import java.util.*;

public class Solution2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        int var1 = sc.nextInt();
        double var2 = sc.nextDouble();
        sc.nextLine(); // to consume the newline character
        String var3 = sc.nextLine();

        int sumi = 0;
        double sumd = 0.0;
        String sums = "";

        sumi = i + var1;
        sumd = d + var2;
        sums = s + var3;

        System.out.println(sumi);
        System.out.println(sumd);
        System.out.println(sums);

        sc.close();

    }
}
