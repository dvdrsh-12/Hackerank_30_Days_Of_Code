
// Day:19 - Interfaces.

import java.util.*;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {

    public int divisorSum(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum;

    }

}

public class Solution20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if (n >= 1 && n <= 1000) {
            AdvancedArithmetic myCalculator = new Calculator();

            int sum = myCalculator.divisorSum(n);
            System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
            System.out.println(sum);

        } else {
            System.out.print("Enter n ,1 <= n <= 1000");
        }

        scan.close();

    }
}
