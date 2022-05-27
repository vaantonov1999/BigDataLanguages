import java.util.Scanner;
public class Program4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Сколько целых чисел вы собираетесь ввести? ");
            int n = scanner.nextInt();
            int[] k = new int[n];
            System.out.print("Введите целые числа через пробел " + "и нажмите <Enter>: ");
            for (int i = 0; i < n; i++) {
                k[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++)
                if ((k[i] % 3 == 0) || (k[i] % 9 == 0)) // делятся на 3 или на 9
                    System.out.println("Число, которое делится на 3 или 9: " + k[i]);

        }
    }


