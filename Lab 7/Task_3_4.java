import java.util.Scanner;
import java.util.StringTokenizer;
public class Task_3_4 {
    public static void main(String[] arg) {
        String Text = "Я нет мы что здесь?" +
                "Я тут." + " Всем пока вот как?";
            Scanner sc = new Scanner(System.in);
            int len;

            System.out.print("Введите длину слов: ");
            len = sc.nextInt();

            // делим текст на предложения и разделители
            StringTokenizer stringTokenizer = new StringTokenizer(Text,"\n:.!?",true);
            String last = "";
            String current = "";
            String[] dic = new String[0];
            String[] dicUnique = new String[0];

            while (stringTokenizer.hasMoreTokens())
            {
                // сохраняем очередное предложение во временной переменной
                last = current;
                // получаем очередное "предложение"
                current = stringTokenizer.nextToken().trim();


                // если полученное предложение является токеном "?"
                if (current.equals("?")==true)
                {
                    // добавляем предыдущее предложение в массив предложений
                    String[] dic2 = new String[dic.length + 1];
                    System.arraycopy(dic, 0, dic2, 0, dic.length);
                    dic2[dic.length] = last+current;
                    dic = new String[dic2.length];
                    System.arraycopy(dic2, 0, dic, 0, dic2.length);

                }
            }
            // вывод результатов отбора вопросительных предложегний
            if (dic.length>0)
            {
                System.out.println("\nСписок вопросительных предложений:");
                for (int i = 0; i < dic.length; i++)
                {
                    System.out.println(dic[i]);
                }

                // разбиение вопросительных предложений на слова и выборка уникальных слов указанной длины

                for (int i = 0; i < dic.length; i++)
                {
                    StringTokenizer stringTokenizer2 = new StringTokenizer(dic[i]," \n\t,.:;!?“”-\"");
                    while (stringTokenizer2.hasMoreTokens())
                    {
                        // получаем очередное слово
                        String tok = stringTokenizer2.nextToken().trim();
                        if (tok.length()==len)
                        {
                            // ищем слово среди уже существующих в массиве слов
                            boolean b = false;
                            for (int j = 0; j < dicUnique.length; j++)
                            {
                                String string = dicUnique[j];
                                // если слово найдено
                                if (string.equalsIgnoreCase(tok)==true)
                                {
                                    b = true;
                                    break;
                                }
                            }
                            // если слово не было найдено в списке слов нужной длины
                            if (b==false)
                            {
                                // добавляем слово в массив слов нужной длины
                                String[] dic2 = new String[dicUnique.length + 1];
                                System.arraycopy(dicUnique, 0, dic2, 0, dicUnique.length);
                                dic2[dicUnique.length] = tok;
                                dicUnique = new String[dic2.length];
                                System.arraycopy(dic2, 0, dicUnique, 0, dic2.length);

                            }
                        }
                    }
                }
                if (dicUnique.length>0)
                {
                    System.out.printf("\nСписок уникальных слов указанной длины (%d):\n",len);
                    for (int i = 0; i < dicUnique.length; i++)
                        System.out.println(dicUnique[i]);
                }
                else System.out.printf("\nВ вопросительных предложениях не найдено ни одного слово указанной длины (%d)!\n", len);
            }
            else System.out.printf("\nНе найдено ни одного вопросительного предложения!\n", len);
        }
    }