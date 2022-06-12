public class Theatre extends Public_Building{

    public Theatre() {
    }

    public Theatre(String name, String address, String website, String type_of_building) {
        super(name, address, website, type_of_building);
    }

    @Override
    public String enter() {
        return super.enter() + "\nГосударственный драматический театр";
    }
}