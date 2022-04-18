package src;

public class Task8 {
    public void task8() {
    int[] array = new int[] {1,2,4,5,6};
    int value = 6;
    for (int i = 0; i < array.length-1; i++) {
        if (array[i] + array[i+1] == value) {
            System.out.println("The 1st integer: " + array[i]);
            System.out.println("The 2nd integer: " + array[i+1]);
        }
    }
    }
}
