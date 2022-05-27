import java.util.*;
public class Main_For_Simple_Fraction {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numerator, denominator;
        System.out.print("Введите числитель: ");
        if (scanner.hasNextInt()) {
            numerator = scanner.nextInt();
        } else {
            System.out.println("error");
            numerator = -1;
        }
        System.out.print("Введите знаменатель: ");
        if (scanner.hasNextInt()) {
            denominator = scanner.nextInt();
        } else {
            System.out.println("error");
            denominator = -1;
        }
        Simple_Fraction first_fraction = new Simple_Fraction(numerator, denominator);

        System.out.print("Введите числитель: ");
        if (scanner.hasNextInt()) {
            numerator = scanner.nextInt();
        } else {
            System.out.println("error");
            numerator = -1;
        }
        System.out.print("Введите знаменатель: ");
        if (scanner.hasNextInt()) {
            denominator = scanner.nextInt();
        } else {
            System.out.println("error");
            denominator = -1;
        }
        Simple_Fraction second_fraction = new Simple_Fraction(numerator, denominator);

        first_fraction.print();
        second_fraction.print();
        System.out.println("Сложение:");
        ((Simple_Fraction) first_fraction.sum(second_fraction)).print();
        System.out.println("Вычетание:");
        ((Simple_Fraction) first_fraction.diff(second_fraction)).print();
        System.out.println("Умножение:");
        ((Simple_Fraction) first_fraction.multi(second_fraction)).print();
        System.out.println("Деление:");
        ((Simple_Fraction) first_fraction.div(second_fraction)).print();


    }
}

