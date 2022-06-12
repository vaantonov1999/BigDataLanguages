import java.util.ArrayList;

public class VectorR3 {

    private double x1;
    private double x2;
    private double y1;
    private double y2;
    private double z1;
    private double z2;

    private double x;
    private double y;
    private double z;

    public VectorR3(){
    }

    public VectorR3(double x1, double x2, double y1, double y2, double z1, double z2) {

            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
            this.z1 = z1;
            this.z2 = z2;

            this.x = x2 - x1;
            this.y = y2 - x1;
            this.z = z2 - z1;

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }



    @Override
    public String toString() {
        return "VectorR3: " +
                "x1 = " + x1 +
                ", x2 = " + x2 +
                ", y1 = " + y1 +
                ", y2 = " + y2 +
                ", z1 = " + z1 +
                ", z2 = " + z2+
                '.';
    }
}