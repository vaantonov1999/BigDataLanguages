public class Public_Building implements Building{
    private String name;
    private String address;
    private String website;
    private String type_of_building;

    public Public_Building() {
    }

    public Public_Building(String name, String address, String website, String type_of_building) {
        this.name = name;
        this.address = address;
        this.website = website;
        this.type_of_building = type_of_building;
    }

    @Override
    public String enter() {
        return "Описание здания\nНазвание: " + name + ";\nАдрес: " + address +";\nWeb-сайт: " + website + ";\nТип здания: " + type_of_building;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getType_of_building() {
        return type_of_building;
    }

    public void setType_of_building(String type_of_building) {
        this.type_of_building = type_of_building;
    }

    @Override
    public String toString() {
        return "Public_Building{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", website='" + website + '\'' +
                ", type_of_building='" + type_of_building + '\'' +
                '}';
    }
}