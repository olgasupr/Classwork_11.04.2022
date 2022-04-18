package src;

import java.util.Scanner;

public class Task3 {
    public void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input an integer.");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {
                System.out.println(i);
            }
        }
    }

    public void davidsSolution() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number.");
        int input = scanner.nextInt();

        for (int i = 1; i <= input; i++) {
            if (input % i ==0) {
                System.out.println(i);
            }
        }

    }
}
