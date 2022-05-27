import java.util.Scanner;

public class Program1 {

        public static void main(String[] args) {
            int n;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите кол-во строк" + ": ");
            n = scanner.nextInt();
            scanner.nextLine();
            String[] string = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.print(" Номер строки " + (i+1) + ": ");
                string[i] = scanner.nextLine(); }

            System.out.println (" Вывод без переход на новую строку " + ": ");
            for (int i = 0; i < n; i++) {
                System.out.print (string[i]);
            }
            System.out.println();

            System.out.println (" Вывод переход на новую строку " + ": ");
            for (int i = 0; i < n; i++) {
                System.out.println (string[i]);
            }
        }
}






