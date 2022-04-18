package src;
import java.util.Arrays;

public class Task9 {
    public void task9() {
        int[] array = new int[] {49, 1, 3, 200, 2, 4, 70, 5, 20};
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
        int currentSequence = 1;
        int maxSequence = 1;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == array[i+1] - 1) {
                currentSequence++;
                maxSequence = Math.max(maxSequence, currentSequence);
            } else {
                currentSequence = 1;
            }
        }
        System.out.println(maxSequence);
    }
}
