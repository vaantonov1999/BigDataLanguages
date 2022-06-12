import java.util.ArrayList;

public class Task_3_3 {
    public static void main(String[] arg) {
        String str = "Я нет." +
                "Я тут." + " Всем пока.";

        String start = str.substring(0, str.indexOf("."));   //первое предложение
        String end = str.substring(str.indexOf(".")+1); //остальная часть без первого предложения

        String[] word = start.replaceAll(",|:|\\(|\\)", "").split(" "); //разбиваем первое предложение на слова

        ArrayList<String> yesWord = new ArrayList<>();//Хранилище для слов которые есть в тексте
        ArrayList<String> noWord = new ArrayList<>(); // Хранилище для слов которые не встречаются в тексте

        for (String s : word){
            if (end.contains(s)){//если есть слово из первого предложения в остальном тексте
                yesWord.add(s);
            }
            else {
                noWord.add(s);
            }
            System.out.println(noWord);
        }

    }
}