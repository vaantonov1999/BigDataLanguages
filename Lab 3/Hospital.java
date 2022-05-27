import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
    private HashMap<Integer, Integer> client_doctor;
    private HashMap<Integer, Assignment> client_assign;
    private HashMap<Assignment, Integer> assign_staff;
    private ArrayList<Staff> staffArray;
    private ArrayList<Patient1> patientArray;

    public Hospital() {
        this.client_doctor = new HashMap<>();
        this.client_assign = new HashMap<>();
        this.assign_staff = new HashMap<>();
        this.staffArray = new ArrayList<>();
        this.patientArray = new ArrayList<>();
    }

    public void addPatient1(Patient1 patient1){
        this.patientArray.add(patient1);
    }

    public void addStaff(Staff staff){
        this.staffArray.add(staff);
    }

    public void setDoctor(int pat_id, int doc_id){
        this.client_doctor.put(pat_id, doc_id);
    }

    public void setAssignment(int pat_id, Assignment assignment){
        this.client_assign.put(pat_id, assignment);
    }

    public void completeAssignment(int pat_id, int staff_id){
        this.assign_staff.put(this.client_assign.get(pat_id), staff_id);
        this.client_assign.get(pat_id).complete();
    }

    public void dismissPatient1(Patient1 patient1, String reason){
        int pat_id = patient1.getId();
        patient1.dismiss(reason);
        this.client_doctor.remove(pat_id);
    }

    @Override
            public String toString() {
        return "Больница{" + "\n" +
                "---Доктора=" + client_doctor + ",\n" +
                "---Назначения=" + client_assign + ",\n" +
                "---Назначения персоналу=" + assign_staff + ",\n" +
                "---Персонал=" + staffArray + ",\n" +
                "---Пациенты=" + patientArray +
                '}';
    }
}