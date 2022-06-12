import java.util.*;
public class MainVectorR3 {
    public static void isCoplanar(VectorR3 v1, VectorR3 v2, VectorR3 v3) {
        double m = v1.getX() * v2.getY() * v3.getZ() + v1.getY() * v2.getZ() * v3.getX()
                + v1.getZ() * v2.getX() * v3.getY() - v1.getZ() * v2.getY() * v3.getX()
                - v1.getX() * v2.getZ() * v3.getY() - v1.getY() * v2.getX() * v3.getZ();
        if (m == 0) {
            System.out.println("Вектора компланарны");
        } else {
            System.out.println("Вектора не компланарны");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        System.out.print("Введите количество векторов: ");
         try {
             number = scanner.nextInt();
         }

     catch (Exception e){
            System.out.println("Ошибка количество векторов");

        }
        VectorR3[] vector_array = new VectorR3[number];
        Random random = new Random();
        double x1, x2, y1, y2, z1, z2;
        System.out.println("Введите координаты векторов: ");
        for (int i = 0; i < number; i++) {
            x1 = random.nextDouble();
            x2 = random.nextFloat();
            y1 = random.nextFloat();
            y2 = random.nextFloat();
            z1 = random.nextFloat();
            z2 = random.nextFloat();
            vector_array[i] = new VectorR3(x1, x2, y1, y2, z1, z2);
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Вектор " + i + ": " + vector_array[i].toString());
        }

        for (int i = 0; i < number - 2; i++) {
            for (int j = i + 1; j < number - 1; j++) {
                for (int k = j + 1; k < number; k++) {
                    System.out.print("Вектора " + i + ", " + j + ", " + k + ": ");
                    isCoplanar(vector_array[i], vector_array[j], vector_array[k]);
                }
            }
        }

    }
}