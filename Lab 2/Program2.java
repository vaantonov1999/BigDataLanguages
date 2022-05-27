import java.util.*;
public class Program2 {
    public static void main(String[] args) {
        int n; //количество строк
        String[] words;
        String text;
        System.out.print("Введите количество слов ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            System.out.println("Введите слова через пробел");
            n = Integer.parseInt(scan.nextLine());
            text = scan.nextLine();
            words = text.split(" ", n);
            String wordMinCharVar = words[0];
            int sizeMinCharVar = new HashSet<String>(Arrays.asList(words[0].split(""))).size();

            for (String word : words) {
                Set<String> set = new HashSet<String> (Arrays.asList (word.split ("")));
                if (set.size () < sizeMinCharVar) {
                    wordMinCharVar = word;
                    sizeMinCharVar = set.size ();
                }
            }
            System.out.println ("Слово, в котором число различных символов минимально: " + wordMinCharVar);
        }
    }
}
