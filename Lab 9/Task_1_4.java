import java.util.*;
import java.util.stream.Collectors;
public class Task_1_4 {
    public static void main(String[] args)  {
        Collection<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> parts = numbers.stream().collect(Collectors.partitioningBy((p) -> p % 2 == 0));
        System.out.println("parts = " + parts);
    }
}
// Метод collect преобразует stream в коллекцию или другую структуру данных
// partitioningBy - разделяет коллекцию на две части по соотвествию условию и возвращает их как Map<Boolean, List>
// -> это метод без объявления (без модификаторов доступа, возвращающие значение и имя)