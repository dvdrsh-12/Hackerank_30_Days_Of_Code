
// Day:2 - Operators.

import java.util.*;

class Result {

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double total_cost = 0.0;

        double tip = (tip_percent / 100.0) * meal_cost;
        double tax = (tax_percent / 100.0) * meal_cost;

        total_cost = meal_cost + tip + tax;
        int totalcost = (int) Math.round(total_cost);

        System.out.println(totalcost);
        
    }
}

public class Solution3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double meal_cost = sc.nextDouble();
        int tip_percent = sc.nextInt();
        int tax_percent = sc.nextInt();

        Result.solve(meal_cost, tip_percent, tax_percent);

        sc.close();

    }
}
