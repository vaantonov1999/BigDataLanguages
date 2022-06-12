import java.util.*;

public class Task_2_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String str = scanner.nextLine();

        HashMap<Character, Integer> hm = new HashMap<>();// символ-число
        for (int i = 0; i < str.length(); i++) {
            if (hm.get(str.charAt(i)) != null) { // получаем значение char
                int temp = hm.get(str.charAt(i));
                hm.put(str.charAt(i), ++temp); // С помощью метода put() добавяем в хеш-отображение пару
            } else {
                hm.put(str.charAt(i), 1);
            }

        }
        Map<Character, Integer> result = new LinkedHashMap<>(); // хранить данные в порядке добавления
        hm.entrySet().stream()
                //Возвращает компаратор, который сравнивает Map.Entry в естественном порядке по значению.
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                // резульатат
                .forEachOrdered(x -> result.put(x.getKey(), x.getValue()));

        System.out.println(result);

    }
}