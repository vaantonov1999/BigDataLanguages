import java.util.*;
public class Task_4_3 {
public static void main(String[] args){
        String text = """
                Равным образом сложившаяся структура организации обеспечивает широкому кругу специалистов участие\s
                в формировании новых предложений. Практический опыт показывает, что реализация намеченного плана развития обеспечивает широкому\s
                кругу специалистов участие в формировании системы обучения кадров, соответствующей насущным потребностям?""";


        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String alpha = "аеёиоуэюя";
                int buf_1, buf_2;
                if (o1.length() > o2.length()){
                    return -1;
                } else if (o1.length() < o2.length()){
                    return 1;
                } else{
                    buf_1 = buf_2 = 0;
                    for (char sym : o1.toCharArray()){
                        if (alpha.indexOf(sym) != -1){
                            buf_1++;
                        }
                    }
                    for (char sym : o2.toCharArray()){
                        if (alpha.indexOf(sym) != -1){
                            buf_2++;
                        }
                    }
                    if (buf_1 > buf_2){
                        return 1;
                    } else return -1;
                }
            }
        };

        String[] words = text.toLowerCase(Locale.ROOT).replaceAll("[,.\n]","").split("\\s");
        List<String> words_list = new ArrayList<String>(Arrays.asList(words));
        words_list.sort(comparator);
        for (String word : words_list){
            System.out.println(word);
        }
    }
}