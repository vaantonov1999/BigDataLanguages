import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Task_1_4 {

    public static String replaceByLen(String sourceStr, int wordToReplaceLen, String newStr) {
        return Arrays.stream(sourceStr.split(" ")) //Стрим из массива
                .map(str -> str.length() == wordToReplaceLen ? newStr : str)
                .collect(Collectors.joining(" "));
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("STR: ");
        String str = scanner.nextLine();
        System.out.println("Введите n");
        int n = scanner.nextInt();
        System.out.println("Заменить на ");
        String newWord;
        scanner.nextLine();
        newWord = scanner.nextLine();
        System.out.println(replaceByLen(str, n, newWord));

    }
}

