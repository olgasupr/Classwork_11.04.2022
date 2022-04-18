package src;

public class Task5 {
    public void task5() {
        int[] array = {6, 5, 4, 5, 10, 5, 8, 3, 10, 6, 6, 6, 4, 3, 2, 8, 1, 3, 4, 7};
        int[] counts = new int[10+1];

        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            counts[number]++;
        }

        for (int i = 1; i < counts.length; i++) {
            System.out.println(i + " - " + counts[i]);
        }
    }
}