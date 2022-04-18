package src;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task10 {
    public void task10() {
        int[] array = new int[]{6, 5, 4, 5, 10, 5, 8, 3, 10, 6, 6, 6, 4, 3, 2, 8, 1, 3, 4, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input an integer.");
        int n = scanner.nextInt();

        int[] newArray = new int[array.length];
        newArray[0] = array[0];

        for (int i = 1; i < array.length - 1; i++) {
            newArray[i] = array[i] * n;
        }
        newArray[newArray.length - 1] = array[array.length - 1];

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

    }
}
