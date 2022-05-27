import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] k = new int[n];
        System.out.print("Введите целые числа через пробел " + "и нажмите <Enter>: ");
        for (int i = 0; i < n; i++) {
            k[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++)
            if ((k[i] % 5 == 0) && (k[i] % 7 == 0))  // // делятся на 5 и на 7
                System.out.println("Число, которое делится на 5 и 7: " + k[i]);

    }
}
