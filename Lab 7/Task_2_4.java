import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Task_2_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String str = scanner.nextLine();
        // HashSet это одно множество объектов
        HashSet<Character> vowels =
                new HashSet<>(
                        Arrays.asList('а', 'о', 'э', 'е', 'и', 'ы', 'у', 'ё', 'ю', 'я'));//  метод принимает массив в качестве параметра и возвращает список
        HashSet<Character> consonants =
                new HashSet<>(
                        Arrays.asList('б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'));

        int numberOfVowels = 0;
        int numberOfConsonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));// Преобразует символ в нижний регистр
            if (vowels.contains(ch)) { //Проверка наличие объекта
                numberOfVowels++;
            } else if (consonants.contains(ch)) {
                numberOfConsonants++;
            }
        }

        if (numberOfVowels > numberOfConsonants) {
            System.out.println("Гласных больше, чем согласных.");
        } else {
            System.out.println("Согласных больше, чем гласных.");
        }
    }

}