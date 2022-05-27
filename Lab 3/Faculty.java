import java.util.ArrayList;
import java.util.HashMap;
public class Faculty {
        private HashMap<Integer, Integer> client_doctor;
        private HashMap<Integer, Assignment> client_assign;
        private HashMap<Assignment, Integer> assign_teachers;
        private ArrayList<Teachers> teachersArray;
        private ArrayList<Abiturient> abiturientArray;

        public Faculty() {
            this.client_doctor = new HashMap<>();
            this.client_assign = new HashMap<>();
            this.assign_teachers = new HashMap<>();
            this.teachersArray = new ArrayList<>();
            this.abiturientArray = new ArrayList<>();
        }

        public void addAbiturient(Abiturient abiturient){
            this.abiturientArray.add(abiturient);
        }

        public void addTeachers(Teachers teachers){
            this.teachersArray.add(teachers);
        }
        public void setTS(int ab_id, int ts_id){
            this.client_doctor.put(ab_id, ts_id);
        }

        public void setAssignment(int ab_id, Assignment assignment){
           this.client_assign.put(ab_id, assignment);
        }


        public void completeAssignment(int ab_id, int ts_id){
            this.assign_teachers.put(this.client_assign.get(ab_id), ts_id);
           this.client_assign.get(ab_id).complete();
        }



        @Override
        public String toString() {
            return  "\n"+"Экзамен{" + "\n" +
                    "---Прикрипление=" + client_doctor + ",\n" +
                    "---Проверяющие " + teachersArray + ",\n" +
                    "---Абитуриенты " + abiturientArray + ",\n"+
                    "---Результаты  " + client_assign + ",\n"
                    ;
        }
    }



