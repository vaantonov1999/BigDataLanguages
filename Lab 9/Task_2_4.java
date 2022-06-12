import java.util.*;
import java.util.stream.Collectors;
public class Task_2_4 {
    public static void main(String[] args) {
        Collection<String> strings = Arrays.asList("A1", "B2", "C3", "D4");
        Map<String, String> map = strings.stream().collect(Collectors.toMap((p) -> p.substring(0, 1), (p) -> p.substring(1, 2)));
        System.out.println("map = " + map); //
    }
}
// Метод collect преобразует stream в коллекцию или другую структуру данных
// toMap - позволяют преобразовать стрим в map, используя указанные функции
// Метод substring () возвращает подстроку строки между двумя индексами, или от одного индекса и до конца строки.
// -> это метод без объявления (без модификаторов доступа, возвращающие значение и имя)