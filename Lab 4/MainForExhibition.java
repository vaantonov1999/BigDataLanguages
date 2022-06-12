public class MainForExhibition {
    public static void main(String[] args) {

        Exhibition exhibition = new Exhibition("Искусство в нас ");

        exhibition.addPicture("Винсент Ван Гог");
        exhibition.picture.get(0).addAttribute("Звездная ночь", 12);
        exhibition.picture.get(0).addAttribute("Подсолнухи", 13);
        exhibition.picture.get(0).addAttribute("Ирисы", 14);
        exhibition.picture.get(0).addAttribute("10");


        exhibition.addPicture("Сальвадор Дали");
        exhibition.picture.get(1).addAttribute("Постоянство памяти", 15);
        exhibition.picture.get(1).addAttribute("Жираф в огне", 16);
        exhibition.picture.get(1).addAttribute("Метаморфозы Нарцисса", 17);
        exhibition.picture.get(1).addAttribute("15");


        System.out.println(exhibition);


    }
}
