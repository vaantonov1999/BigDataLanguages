import java.util.Random;
public class MainShop {

    public volatile static boolean flag;
    public volatile static int stock;
    public volatile static Random random;

    public static void main(String[] args) {
        random = new Random();
        stock = 0; // переменная склада
        flag = false;

        new Thread(supplier).start(); //поставщик
        new Thread(customer).start(); //покупатель

    }

    static Runnable supplier = new Runnable() {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(5000);//Приостановит программу
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int col = random.nextInt(1, 25);
                stock += col;
                System.out.print("Новое предложение: ");
                System.out.println(col);
                    System.out.print("Склад: ");
                System.out.println(stock);
                System.out.println("*****************");
                flag = true;
            }
        }
    };

    static Runnable customer = new Runnable() {
        @Override
        public void run() {
            int order = random.nextInt(25, 50);
            while (true) {
                while (!flag) {
                    // беск цикл
                }
                if (order <= stock) {
                    stock -= order;
                    System.out.print("Купил: ");
                    System.out.println(order);
                    System.out.print("Склад: ");
                    System.out.println(stock);
                    System.out.println("*************");
                    order = random.nextInt(25, 50);
                } else {
                    System.out.print("Заказ: ");
                    System.out.println(order);
                    System.out.print("Склад: ");
                    System.out.println(stock);
                    System.out.println("Недостаточно товаров!");
                    System.out.println("*************");
                }
                flag = false;
            }
        }
    };

}