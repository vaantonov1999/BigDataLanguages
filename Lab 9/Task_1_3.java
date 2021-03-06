import java.util.*;

public class Task_1_3 {
    public static void main(String[] args){
        Collection<Integer> collection = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        int sum = collection.stream().filter(x -> x % 2 != 0).reduce(Integer::sum).orElse(0);
        System.out.println("Сумма нечетных чисел: " + sum);
    }
}
//Метод reduce позволяет выполнять агрегатные функции на всей коллекцией
//(такие как сумма, нахождение минимального или максимального значение и т.п.),
// он возвращает одно значение для стрима, функция получает два
// аргумента - значение полученное на прошлых шагах и текущее значение

// -> это метод без объявления (без модификаторов доступа, возвращающие значение и имя)

//orElse() — возвращает объект по дефолту.

//метод filter (фильтр) — промежуточный оператор,
// x приравнивается к одному элементу коллекции для перебора (как при for each)
// и после -> мы указываем как фильтруется наша коллекция и так как это промежуточный оператор,
// отфильтрованная коллекция идёт дальше в метод