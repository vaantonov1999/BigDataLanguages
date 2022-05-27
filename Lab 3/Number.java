import java.util.Objects;

public class Number {

    private final int number;

    public Number(){
        this.number = 0;
    }

    public Number(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void print(){
        System.out.println(this);
    }

    public Object sum(Object obj){
        if (obj.getClass().equals(this.getClass())){
            Number number = new Number(((Number) obj).number + this.number);
        } else {
            System.out.println("ошибка, несоответствие классов");
        }
        return number;
    }

    public Object diff(Object obj){
        if (obj.getClass().equals(this.getClass())){
            Number number = new Number(this.number - ((Number) obj).number);
        } else {
            System.out.println("ошибка, несоответствие классов");
        }
        return number;
    }
    public Object multi(Object obj){
        if (obj.getClass().equals(this.getClass())){
            Number number = new Number(((Number) obj).number * this.number);
        } else {
            System.out.println("ошибка, несоответствие классов");
        }
        return number;
    }
    public Object div(Object obj){
        if (obj.getClass().equals(this.getClass())){
            Number number = new Number(this.number/((Number) obj).number);
        } else {
            System.out.println("ошибка, несоответствие классов");
        }
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Number number1 = (Number) o;
        return number == number1.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Number{" +
                "number=" + number +
                '}';
    }
}