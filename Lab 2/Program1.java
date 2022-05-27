import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        int n = 0;
        System.out.print("Введите количество строк: ");
        Scanner scanner1 = new Scanner(System.in);
        n = scanner1.nextInt();
        String[] strings = new String[n];
        Scanner scanner2 = new Scanner(System.in);

        for(int i = 0; i < strings.length; i++){
            System.out.print("Введите строку №" + (i+1) );
            strings[i] = scanner2.nextLine();
        }

        float length = 0f;
        for(String item : strings){
            length += (float) item.length();
        }

        length /= strings.length;

        System.out.println("Средняя длина строки = (" + length + ")");
        for(int i = 0; i < n; i++){
            if (strings[i].length() > length){
                System.out.println("Строка больше чем средняя длина: ");
                System.out.println(strings[i] + " ee длина = " + strings[i].length());
            }
        }

    }


}