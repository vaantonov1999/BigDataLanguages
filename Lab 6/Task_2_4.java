import java.util.ArrayList;
import java.util.TreeSet;

public class Task_2_4<p1> {
    public static void main(String[] args) {
        ArrayList<Obj> sour = new ArrayList<>();
        Obj p1 = new Obj("Объект 1", 1);
        Obj p2 = new Obj("Объект 2", 7);
        Obj p3 = new Obj("Объект 3", 2);
        Obj p4 = new Obj("Объект 4", 8);
        Obj p5 = new Obj("Объект 5", 5);
        sour.add(p1);
        sour.add(p2);
        sour.add(p3);
        sour.add(p4);
        sour.add(p5);

        TreeSet<Obj> Total = new TreeSet<>(sour);
        for(Obj o: Total)
            System.out.println(o);
    }
    }


