
// Day:21 - Generics.

import java.util.*;

class Printer<T> {

    void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}

public class Solution22 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];

        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];

        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }

        Printer<Integer> intPrinter = new Printer<>();
        Printer<String> stringPrinter = new Printer<>();
        intPrinter.printArray(intArray);
        stringPrinter.printArray(stringArray);

        if (Printer.class.getDeclaredMethods().length > 1) {
            System.out.println("The Printer class should only have 1 method named printArray.");
        }

        scanner.close();

    }
}
