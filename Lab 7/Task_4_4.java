import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;
class Task_4_4 {
                public static void main(String[] args) {
                    String text = "пая пааая нет на пальме, но есть на другой и кричит пая.";
                    String[] wordArray = text.split("[\\s,.:!?]+");
                    Pattern pattern = Pattern.compile("^[п].*[я]$");
                    String maxString = "";
                    String newStr = "";
                    for (String word : wordArray) {
                        if (word.length() > maxString.length()) {
                            maxString = word;
                            Matcher matcher = pattern.matcher(maxString);
                            if (matcher.find()  ) {
                                newStr = text.replaceAll(maxString, "");

                            }
                        }
                    }
                    System.out.println(newStr);
                }
}

