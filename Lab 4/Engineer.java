public class Engineer implements Employee{
    private String name;
    private String position;
    private String organization;
    private String department;

    public Engineer() {
    }

    public Engineer(String name, String position, String organization, String department) {
        this.name = name;
        this.position = position;
        this.organization = organization;
        this.department = department;
    }

    @Override
    public String introduce() {
        return "Форма служебного письма\nЗдравствуйте, \nменя зовут " + name + ",\nЯ являюсь " + position +" в " + organization + " / " + department + " депортамент";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", organization='" + organization + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}