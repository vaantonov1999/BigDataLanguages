import java.util.Objects;
public class Patient1 {
    private String name;
    private int id;
    private boolean inHospital;
    private String reason;

    public Patient1() {
    }

    public Patient1(String name, int id ) {
        this.name = name;
        this.id = id;
        this.inHospital = true;
        this.reason = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isInHospital() {
        return inHospital;
    }

    public void setInHospital(boolean inHospital) {
        this.inHospital = inHospital;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void dismiss(String reason){
        this.inHospital = false;
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient1 patient1 = (Patient1) o;
        return id == patient1.id && inHospital == patient1.inHospital && Objects.equals(name, patient1.name) && Objects.equals(reason, patient1.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, inHospital, reason);
    }

    @Override
    public String toString() {
        return "Пациент{" +
                "Имя='" + name + '\'' +
                ", id=" + id +
                ", В Больнице=" + inHospital +
                ", причина='" + reason + '\'' +
                '}';
    }
}