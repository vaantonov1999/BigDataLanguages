import java.util.Objects;

public class Teachers {
        private int id;
        private String name;
        private String position;

        public Teachers() {
        }

        public Teachers(int id, String name, String position) {
            this.id = id;
            this.name = name;
            this.position = position;

        }

        public int getId() {return id;}
        public void setId(int id) {this.id = id;}


        public String getName() {return name;}
        public void setName(String name) {this.name = name;}


        public String getPosition() {return position;}
        public void setPosition(String position) {this.position = position;}

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Teachers teachers = (Teachers) o;
            return id == teachers.id && Objects.equals(name, teachers.name) && Objects.equals(position, teachers.position);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, position);
        }

        @Override
        public String toString() {
            return "\n"+ "Проверяющий: " + ' '+
                    "id=" + id + '\''+' '+
                    ", Имя='" + name + '\'' + ' '+
                    ", Должность='" + position + '\'' +' '
                    ;
        }
    }

