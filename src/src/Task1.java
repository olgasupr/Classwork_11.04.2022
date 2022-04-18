package src;

import java.util.Scanner;

public class Task1 {
    public void task1() {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;

        do {
            System.out.println("Please input a number. Please note that '0' terminates the program.");
            n = scanner.nextInt();
            sum += n;
        } while (n != 0);

        System.out.println(sum);
    }

}
