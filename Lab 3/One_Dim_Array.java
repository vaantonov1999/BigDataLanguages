import java.util.ArrayList;
import java.util.Objects;

public class One_Dim_Array extends Array{

    private ArrayList<Integer> data;

    public One_Dim_Array(){
    }

    public One_Dim_Array(int n){
        this.data = new ArrayList<>(n);
    }

    public One_Dim_Array(ArrayList<Integer> data){
        this.data = data;
    }

    @Override
    public void print() {
        System.out.println("Массив: " + this);
    }

    @Override
    public One_Dim_Array sum(Object obj) {
        One_Dim_Array array = new One_Dim_Array(this.data.size());
        if (obj.getClass().equals(this.getClass())){
            if (this.data.size() != ((One_Dim_Array) obj).data.size()){
                System.out.println("ошибка, несоответствие размеров");
            } else {
                for (int i = 0; i < this.data.size(); i++) {
                    array.data.add(this.data.get(i) + ((One_Dim_Array) obj).data.get(i));
                }
            }
        } else {
            System.out.println("ошибка, несоответствие классов");
        }
        return array;
    }

    @Override
    public One_Dim_Array multi(Object obj) {
        One_Dim_Array array = new One_Dim_Array(this.data.size());
        if (obj.getClass().equals(this.getClass())){
            if (this.data.size() != ((One_Dim_Array) obj).data.size()){
                System.out.println("ошибка, несоответствие размеров");
            } else {
                for (int i = 0; i < this.data.size(); i++) {
                    array.data.add(this.data.get(i)*((One_Dim_Array) obj).data.get(i));
                }
            }
        } else {
            System.out.println("ошибка, несоответствие классов");
        }
        return array;
    }

    @Override
    public One_Dim_Array diff(Object obj) {
        One_Dim_Array array = new One_Dim_Array(this.data.size());
        if (obj.getClass().equals(this.getClass())){
            if (this.data.size() != ((One_Dim_Array) obj).data.size()){
                System.out.println("ошибка, несоответствие размеров");
            } else {
                for (int i = 0; i < this.data.size(); i++) {
                    array.data.add(this.data.get(i) - ((One_Dim_Array) obj).data.get(i));
                }
            }
        } else {
            System.out.println("ошибка, несоответствие классов");
        }
        return array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        One_Dim_Array that = (One_Dim_Array) o;
        return Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        return "One_Dim_Array{" +
                "data=" + data +
                '}';
    }
}