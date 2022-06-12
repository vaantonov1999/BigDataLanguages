import java.util.ArrayList;

public class Exhibition {
    String title;
    ArrayList<Picture> picture;

    public Exhibition() {
        picture = new ArrayList<>();
    }

    public Exhibition(String title) {
        this.title = title;
        picture = new ArrayList<>();
    }

    public void addPicture(String name){
        picture.add(new Picture(name));
    }

    @Override
    public String toString() {
        return "Художественная выставка \n{" +
                "Название: '" + title + '\'' +
                "\nГаллерея \n" + picture +
                '}';
    }

    class Picture{
        String name;
        ArrayList<Attribute> attributes;

        public Picture() {
            attributes = new ArrayList<>();
        }

        public Picture(String name) {
            this.name = name;
            attributes = new ArrayList<>();
        }

        public void addAttribute(String name, int amount){
            Attribute attribute = new Attribute(name, amount);
            attributes.add(attribute);
        }

        public void addAttribute(String name){
            Attribute attribute = new Attribute(name);
            attributes.add(attribute);
        }

        @Override
        public String toString() {
            return "\n   Художник{" +
                    "'" + name + '\'' +
                    "\n      Какртины=" + attributes +   " }";
        }

        class Attribute{
            String name;
            int amount;

            public Attribute() {
            }

            public Attribute(String name) {
                this.name = name;
                this.amount = -1;
            }

            public Attribute(String name, int amount) {
                this.name = name;
                this.amount = amount;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAmount() {
                return amount;
            }

            public void setAmount(int amount) {
                this.amount = amount;
            }

            @Override
            public String toString() {
                if(amount != -1) {
                    return "{" +
                            "Название:'" + name + '\'' +
                            ", Время показа=" + amount +
                            '}';
                } else {
                    return "Зал № " + name;
                }
            }
        }
    }
}