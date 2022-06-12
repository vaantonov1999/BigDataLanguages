import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class Poem {
    public static void main(String[] args) {
        File inp_file = new File("C:\\Users\\maste\\IdeaProjects\\Lab5\\src\\The_original.txt");
        Path out_file_path = Paths.get("C:\\Users\\maste\\IdeaProjects\\Lab5\\src\\Task1.txt");
        File out_file = new File("C:\\Users\\maste\\IdeaProjects\\Lab5\\src\\Task1.txt");
        String vowels = "аоэеиыуёюя";

        if(out_file.delete()) {
            try {
                out_file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Scanner scanner = null;
        try {
            scanner = new Scanner(inp_file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();

            line = line.replaceAll("\\pP", "");
            String[] words = line.split(" ");
            String out = "";
            for(String word : words){
                String first_letter = word.length() > 1 ? word.substring(0, 1) : word;
                first_letter = first_letter.toLowerCase(Locale.ROOT);
                if (vowels.contains(first_letter)) {
                    out = out.concat(word).concat(" ");
                };
            }

            try {
                Files.write(out_file_path, Collections.singleton(out), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}