public class Head extends Engineer{

    public Head() {
    }

    public Head(String name, String position, String organization, String department) {
        super(name, position, organization, department);
    }

    @Override
    public String introduce() {
            return super.introduce() + "\nЯ возглавляю этот отдел";
    }
}