import java.util.Objects;

public class Simple_Fraction extends Number{

    private int numerator;
    private int denominator;

    public Simple_Fraction(){
    }

    public Simple_Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public Object sum(Object obj) {
        Simple_Fraction simple_fraction;
        if (obj.getClass().equals(this.getClass())) {
            simple_fraction = new Simple_Fraction(((Simple_Fraction) obj).numerator * this.denominator
                    + this.numerator * ((Simple_Fraction) obj).denominator,
                    ((Simple_Fraction) obj).denominator * this.denominator);
        } else {
            System.out.println("ошибка, несоответствие классов");
            simple_fraction = new Simple_Fraction();
        }
        return simple_fraction;
    }

    @Override
    public Object diff(Object obj) {
        Simple_Fraction simple_fraction;
        if (obj.getClass().equals(this.getClass())) {
            simple_fraction = new Simple_Fraction(this.numerator * ((Simple_Fraction) obj).denominator
                    - ((Simple_Fraction) obj).numerator * this.denominator,
                    ((Simple_Fraction) obj).denominator * this.denominator);
        } else {
            System.out.println("ошибка, несоответствие классов");
            simple_fraction = new Simple_Fraction();
        }
        return simple_fraction;
    }

    @Override
    public Object multi(Object obj) {
        Simple_Fraction simple_fraction;
        if (obj.getClass().equals(this.getClass())) {
            simple_fraction = new Simple_Fraction(this.numerator * ((Simple_Fraction) obj).numerator,
                    ((Simple_Fraction) obj).denominator * this.denominator);
        } else {
            System.out.println("ошибка, несоответствие классов");
            simple_fraction = new Simple_Fraction();
        }
        return simple_fraction;
    }

    @Override
    public Object div(Object obj) {
        Simple_Fraction simple_fraction;
        if (obj.getClass().equals(this.getClass())) {
            simple_fraction = new Simple_Fraction(this.numerator * ((Simple_Fraction) obj).denominator,
                    ((Simple_Fraction) obj).numerator * this.denominator);
        } else {
            System.out.println("ошибка, несоответствие классов");
            simple_fraction = new Simple_Fraction();
        }
        return simple_fraction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Simple_Fraction that = (Simple_Fraction) o;
        return numerator == that.numerator && denominator == that.denominator;
    }

    @Override
    public String toString() {
        return "Дробь{" +
                "числитель=" + numerator +
                ", знаменатель=" + denominator +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numerator, denominator);
    }
}