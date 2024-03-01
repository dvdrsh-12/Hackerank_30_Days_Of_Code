
// Day:12 - Inheritance.

import java.util.*;

class Person {

    protected String firstName;
    protected String lastName;
    protected int idNumber;

    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }

}

class Student extends Person {

    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    char calculate(int numScores) {

        double total = 0.0;
        double averageScore = 0.0;
        char grade = 'N';

        for (int i = 0; i < numScores; i++) {
            total += testScores[i];
            averageScore = total / numScores;
        }

        if (averageScore >= 90 && averageScore <= 100) {
            grade = 'O';
        } else if (averageScore >= 80) {
            grade = 'E';
        } else if (averageScore >= 70) {
            grade = 'A';
        } else if (averageScore >= 55) {
            grade = 'P';
        } else if (averageScore >= 40) {
            grade = 'D';
        } else if (averageScore < 40) {
            grade = 'T';
        }

        return grade;

    }
}

public class Solution13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];

        if (firstName.length() >= 1 && firstName.length() <= 10 && lastName.length() >= 1 && lastName.length() <= 10
                && id >= 1000000 && id <= 9999999) {

            for (int i = 0; i < numScores; i++) {
                testScores[i] = scan.nextInt();
            }

            Student s = new Student(firstName, lastName, id, testScores);
            s.printPerson();
            System.out.println("Grade: " + s.calculate(numScores));

        } else {
            System.out.println("Enter firstname, lastname in length, 1 <= length <= 10");
        }

        scan.close();

    }
}
