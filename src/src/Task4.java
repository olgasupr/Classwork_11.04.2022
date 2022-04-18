package src;

import java.util.Scanner;

public class Task4 {
    public void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number greater than 1.");
        int n = scanner.nextInt();

        if (n <=1) {
            System.out.println("Please enter a number greater than 1.");
            n = scanner.nextInt();
        }

        if (isPrime(n)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    public boolean isPrime(int n) {
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void davidsSolution() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number.");
        double input = scanner.nextInt();
        if (input <= 1) {
            System.out.println("I am interrupting work.");
            return;
        }

        for (int i = 2; i < Math.sqrt(input); i++) {
            if(input%i == 0) {
                System.out.println("NO");
            }
        }
        System.out.println("YES3.54");
    }
}