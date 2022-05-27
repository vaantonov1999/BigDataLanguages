import java.util.Objects;

public class Abiturient {
    private int id;
    private String name;
    private String status;
    // private boolean inHospital;

    //private String Evaluation;

    public Abiturient() {
    }

    public Abiturient(int id , String name, String status )
    {
            this.id = id;
            this.name = name;
            this.status = status;
        }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getStatus() {return status;}
    public void setStatus(String status) {
        this.status = status;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Abiturient abiturient = (Abiturient) o;
        return id == abiturient.id  &&  Objects.equals(name, abiturient.name) &&  Objects.equals(status, abiturient.status) ;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, name, status);
    }

    @Override
    public String toString() {
        return "\n"+"Абитуриент: " +
                ", id=" + id + '\''  + ' '+
                "Имя='" + name + '\'' + ' '+
                "Статус='" + status + '\'' + ' '
                ;

    }


}
