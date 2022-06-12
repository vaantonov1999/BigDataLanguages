public class MainForPublic_Building {
    public static void main(String[] args) {

        Public_Building public_building = new Public_Building("Планетарий", "Москва, ул.Садовая-Кудринская, д. 5, стр. 1", "planetarium-moscow.ru", "Общественное здание");
        Theatre theatre = new Theatre("Современник", "Москва, Чистопрудный бульвар, 19, стр. 1", "sovremennik.ru", "Общественное здание");

        System.out.println(public_building.enter());
        System.out.println();
        System.out.println(theatre.enter());
    }
}