public class MainForEngineer {
    public static void main(String[] args) {

        Engineer engineer = new Engineer("Иванов Иван Иванович", "инженер-технолог", "NCR", "Конструкторский");
        Head head = new Head("Сергеей Сергей Сергеевич", "главный инженер", "NCR", "Конструкторский");

        System.out.println(engineer.introduce());
        System.out.println();
        System.out.println(head.introduce());
    }
}