import java.util.Scanner;
public class Program2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите пароль: ");
            String password1 = scanner.next();
            String password2 = "hallo";
            if (password1.equals(password2))
                System.out.println("Пароль верный");
            else System.out.println("Пароль не верный");

        }
    }


