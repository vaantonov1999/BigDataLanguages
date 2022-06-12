import java.util.Arrays;

public class MatrixHandler {

    public static int[][] add (int[][] a, int[][]b) throws IllegalArgumentException{
        if (a.length == b.length && a[0].length == b[0].length){
            int[][] c = new int[a.length][a[0].length];
            for (int i = 0; i < a.length; i++){
                for (int j = 0; j < a[0].length; j++){
                    c[i][j] = a[i][j] + b[i][j];
                }
            }

            return c;

        }

        else throw new IllegalArgumentException ("Размеры матрицы должны быть одинаковыми");
    }


    public static int[][] substract (int[][] a, int[][]b) throws IllegalArgumentException{

        if (a.length == b.length && a[0].length == b[0].length){
            int[][] c = new int[a.length][a[0].length];
            for (int i = 0; i < a.length; i++){
                for (int j = 0; j < a[0].length; j++){
                    c[i][j] = a[i][j] - b[i][j];
                }
            }

            return c;
        }

        else throw new IllegalArgumentException ("Размеры матрицы должны быть одинаковыми");
    }



    public static int[][] multiply (int[][] a, int[][]b) throws IllegalArgumentException{
        int l1 = a.length;//m
        int l2 = b[0].length;//n
        int l3 = b.length;//o
        if (a.length == b[0].length){
            int[][] c = new int[a.length][b[0].length];
            for (int i = 0; i < l1; i++) {
                for (int j = 0; j < l2; j++) {
                for (int k = 0; k < l3; k++) {
                c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            return c;
        }
        else throw new IllegalArgumentException ("Количество столбцов матрицы A должно совпадать с количеством строк матрицы B.");
    }

    public static int[] sumRows(int[][]a)
    {
        int []array = new int[a.length];
        for(int i = 0;i<a.length;i++)
        {
            for(int j = 0;j<a[0].length;j++)
            {
                array[i]+=Math.abs(a[i][j]);
            }
        }
        System.out.println(Arrays.toString(array));
        return array;

    }

    public static int[] sumCols(int [][]a)
    {
        int[]array = new int[a[0].length];
        for(int j = 0;j<a[0].length;j++)
        {
            for(int i =0;i<a.length;i++)
            {
                array[j]+=Math.abs(a[i][j]);
            }
        }
        System.out.println(Arrays.toString(array));
        return array;

    }

    public static int maxRows(int []a)
    {
        int max = 0;
        for(int val:a) {
            if(val > max)max = val;
        }
        return max;
    }

    public static int maxCols(int []a)
    {
        int min = a[0];
        for(int val:a) {
            if(val > min) min=val;
        }
        return min;
    }



    //вывод матрицы на экран
    public static void print_add(int [][] c){
        System.out.println("Сложение: ");
        for (int i = 0; i < c.length; i++){
            for (int j = 0; j < c[0].length; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void print_substract(int [][] c){
        System.out.println("Вычитание: ");
        for (int i = 0; i < c.length; i++){
            for (int j = 0; j < c[0].length; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    public static void print_multiply(int [][] c){
        System.out.println("Умнажение: ");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.format(c[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    public static void Norm1(int [][] a){
        System.out.println("Norm1 ="+maxRows(sumRows(a)));
    }
    public static void Norm2(int [][] a){
        System.out.println("Norm2 ="+maxCols(sumCols(a)));;
    }






}