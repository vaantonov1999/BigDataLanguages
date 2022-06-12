import java.util.Arrays;
import java.util.Random;

public class Task_1_3 {
    public static void main(String[] args) {
        int[] arr = generate(10, 5);
        System.out.println("Исходное множество");
        while (arr.length > 1) {
            System.out.println(Arrays.toString(arr));
            arr = modify(arr);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Конец подсчета");
    }

    public static int[] generate(int count, int maxNumber) {
        int[] arr = new int[count];
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            arr[i] = rand.nextInt(maxNumber + 1);
        }
        return arr;
    }

    public static int[] modify(int[] arr) {
        int newSize = (int) Math.round(arr.length / 2.0);
        int[] arrAfterSum = new int[newSize];
        for (int i = 0; i < arr.length; i++) {
            arrAfterSum[i / 2] += arr[i];
        }

        return arrAfterSum;
    }
}
