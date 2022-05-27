import java.util.*;
public class Main_For_One_Dim_Array {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Введите количество элементов: ");
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("error");
            number = -1;
        }

        ArrayList<Integer> input_data = new ArrayList<>(number);
        System.out.print("Введите элементы: ");
        for (int i = 0; i < number; i++){
            if (scanner.hasNextInt()) {
                 input_data.add(scanner.nextInt());
            } else {
                System.out.println("error");
            }
        }
        One_Dim_Array array = new One_Dim_Array(input_data);

        ArrayList<Integer> input_data_second = new ArrayList<>(number);
        System.out.print("Введите второй массив: ");
        for (int i = 0; i < number; i++){
            if (scanner.hasNextInt()) {
                input_data_second.add(scanner.nextInt());
            } else {
                System.out.println("error");
            }
        }
        One_Dim_Array second_array = new One_Dim_Array(input_data_second);
        System.out.println(array + " " + second_array);

        System.out.println("Сумма: " + array.sum(second_array));
        System.out.println("Разность: " + array.diff(second_array));
        System.out.println("Произведение: " + array.multi(second_array));
    }
}
