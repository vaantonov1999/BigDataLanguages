import java.util.*;
public class Task_2_3 {
    public static void main(String[] args){
        Collection<People> peoples = Arrays.asList(
                new People("Ivan", 16),
                new People("Petr", 42),
                new People("Maria", 23)
        );
        System.out.println(peoples.stream().sorted(Comparator.comparingInt(People::getAge)).toList());
    }
}
// toList представляют стрим в виде списка
// Метод sorted позволяет сортировать значения либо в натуральном порядке, либо задавая Comparator
// comparingInt функцию, которая извлекает ключ сортировки int