package src;

import java.util.Scanner;

public class Task2 {
    public void task2() {
        Scanner scanner = new Scanner(System.in);
        int n;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        do {
            System.out.println("Please input an integer.");
            n = scanner.nextInt();
            if (n != 0) {
                if (n > max) {
                    max = n;
                }
                if (n < min) {
                    min = n;
                }
            }
        }
        while (n != 0) ;


        System.out.println("Max is " + max);
        System.out.println("Min is " + min);
        System.out.println("The sum of max and min is: " + (max + min));
        System.out.println("The average of max and min is " + (max+min)/2.0);
        }

        public void davidsSolution() {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Please input the amount of numbers to expect.");
            int num_of_inputs = scanner.nextInt();

            int[] numbers = new int[num_of_inputs];

            int counter = 0;
            int input;

            do {
                System.out.println("Input a number to add. Or input zero to calculate.");
                input = scanner.nextInt();

                //Add int to array
                numbers[counter++] = input;
            } while (input != 0 && counter < num_of_inputs);

            int largest = numbers[3];
            int smallest = numbers[0];
            int sum;

            for (int num : numbers) {
                if(num > largest) {
                    largest = num;
                }
                if(num < smallest) {
                    smallest = num;
                }
            }

            sum = largest + smallest;
            double arithmetic_mean = sum/2;

            System.out.println(sum + " is the sum of both the smallest and the largest value.");
            System.out.println(arithmetic_mean + " is the arithmetic mean.");

    }
}