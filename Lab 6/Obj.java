
public class Obj implements Comparable<Obj>{
    private String name;
    private int code;

    public Obj() {
    }

    public Obj( String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }
    public void setCode(String surname) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Objects{" +
                ", Наименование:'" + name + '\'' +
                ", Шифр:'" + code + '\'' +
                '}';
    }

    @Override
    public int compareTo(Obj o) {
         return this.getCode() - o.getCode();
    }
}
