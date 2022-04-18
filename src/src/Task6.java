package src;
import java.util.Arrays;

public class Task6 {
    public void task6() {
        int[] array = new int[] {6, 5, 4, 5, 10, 5, 8, 3, 10, 6, 6, 6, 4, 3, 2, 8, 1, 3, 4, 7};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int prevDup = array[0]-1;

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == array[i+1]) {
                if (array[i] != prevDup) {
                    System.out.println(array[i] + " appears more than once.");
                    prevDup = array[i];
                }
            }
        }

    }
}

