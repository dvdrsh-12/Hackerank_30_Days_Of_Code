
// Day:18 - Queues and Stacks.

import java.util.*;

public class Solution19 {

    char[] s = new char[100];
    int top = -1, front = -1, rear = -1;
    char item;

    void pushCharacter(char c) {
        s[++top] = c;
    }

    void enqueueCharacter(char c) {

        if (rear == -1) {
            front = 0;
            rear = 0;
            s[rear] = c;
        } else {
            s[++rear] = c;
        }

    }

    char popCharacter() {
        item = s[top--];
        return item;
    }

    char dequeueCharacter() {

        if (front == rear) {
            item = s[front];
            front = -1;
            rear = -1;
        } else {
            item = s[front++];
        }

        return item;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        char[] s = input.toCharArray();

        Solution19 p = new Solution19();

        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        boolean isPalindrome = true;

        for (int i = 0; i < s.length / 2; i++) {

            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }

        }

        System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));

        scan.close();

    }
}
