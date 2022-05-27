import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        System.out.print("Введите диапозон n: ");
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * n );
                b[i][j] = (int) (Math.random() * n );
            }
        }

        System.out.println("Матрица А: ");
        for (int i = 0; i < n; i++) {//вывод матрицы
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");//переход на новую строчку
        }

        System.out.println("Матрица B: ");
        for (int i = 0; i < n; i++) {//вывод матрицы
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.print("\n");//переход на новую строчку
        }
        int [][] c = new int[n][n];
        MatrixHandler.print_add(MatrixHandler.add(a, b));
        MatrixHandler.print_substract(MatrixHandler.substract(a, b));
        MatrixHandler.print_multiply(MatrixHandler.multiply(a, b));
        MatrixHandler.Norm1(a);
        MatrixHandler.Norm2(a);
        // теперь проверим выбрасвыние исключений
        try {
            MatrixHandler.add(c, b);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Wrong arguments put into add method");
        }

        try {
            MatrixHandler.multiply(a, b);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Wrong arguments put into multiply method");
        }
    }
}

