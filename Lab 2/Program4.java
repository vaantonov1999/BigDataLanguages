import java.util.*;
public class Program4 {
    public static void main(String[] args) {
        System.out.print("Введите диапозон n: ");
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int min = n;
        int max = -n;
        int[][] matrix = new int[n][n]; //создание массива a размером 10*10

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * (max - min)) + min; //генерируем число от -n до n.
            }
        }

        for (int i = 0; i < n; i++) {//вывод матрицы
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");//переход на новую строчку
        }
        int sum = 0; // сумма элементов между первыми двумя положительными числами в строке
        int positive_cnt = 0; // счетчик положительных чисел локальный для каждой строки
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] >= 0) {
                    positive_cnt++;
                }
            }

            //если количество положительных чисел в строке больше или равно двум,
            //то это удовлетворяет нашему условию для нахождения суммы между ними
            if (positive_cnt >= 2) {
                positive_cnt = 0; //обнуляем счетчик положительных чисел

                //снова проходим по строке циклом

                for (int j = 0; j < n - 1; j++) {
                    //находим положительное число и увеличиваем значения счетчика
                    if (matrix[i][j] >= 0) {
                        positive_cnt++;
                    }
                    //если значение счетчика равно 1 и последующий элемент строки меньше 0,
                    //то прибавляем следующий элемент строки к сумме, пока значение счетчика не станет равным 2
                    if (positive_cnt == 1 && matrix[i][j + 1] < 0) {
                        sum += matrix[i][j + 1];
                    }
                }
            }
        }
        System.out.println(sum);
    }
}

