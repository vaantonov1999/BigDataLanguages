public class Robot {
    public volatile static boolean flag = true;

    public static void main(String[] args){
        System.out.println("Start");
        new Robot().doStart();
    }
    void doStart() {
        new Thread(left).start();// запуск потока
        new Thread(right).start();
    }

    Runnable left = new Runnable() {
        @Override
        public void run() { // выполнение задачи

            while (true) {
                if (flag) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("LEFT");
                    flag = false;
                }
                Thread.yield(); // уступить
            }
        }
    };

     Runnable right = new Runnable() {
        @Override
        public void run() {
            while (true){
                if (!flag) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("RIGHT");
                    flag = true;
                }
                Thread.yield();
            }
        }
    };

}