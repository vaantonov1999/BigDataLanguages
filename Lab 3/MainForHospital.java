public class MainForHospital {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();

        Patient1 pat1 = new Patient1("Сергей Иванов Игоревич", 1);
        Patient1 pat2 = new Patient1("Григорий Кайдмен Петрович", 2);
        Patient1 pat3 = new Patient1("Владимир Костромин Олегович", 3);


        Staff doc1 = new Staff(1, "Семёнов Михаил Александрович", "Доктор");
        Staff doc2 = new Staff(2, "Воронова Мария Юрьевна", "Доктор");
        Staff nurse = new Staff(3, "Самойлова Ирина Виталевна", "Медсестра");

        hospital.addPatient1(pat1);
        hospital.addPatient1(pat2);
        hospital.addPatient1(pat3);


        hospital.addStaff(doc1);
        hospital.addStaff(doc2);
        hospital.addStaff(nurse);

        hospital.setDoctor(pat1.getId(), doc1.getId());
        hospital.setDoctor(pat2.getId(), doc2.getId());


        System.out.println();
        System.out.println("Доктор и пациент: ");
        System.out.println(hospital);

        Assignment a1 = new Assignment();
        a1.addDrug("Нурофен");
        a1.addDrug("Ибуклин");
        a1.addDrug("Ситоцыл");
        a1.addDrug("Колдакт");
        a1.addProcedure("Ингаляция");
        hospital.setAssignment(pat1.getId(), a1);

        Assignment a2 = new Assignment();
        a2.addSurgery("Заменя швов");
        a2.addDrug("Пантенол");
        hospital.setAssignment(pat2.getId(), a2);

        Assignment a3 = new Assignment();
        a3.addProcedure("Массаж спины");
        a3.addProcedure("Плавательный бассейн");
        a3.addDrug("Витамин Д");
        hospital.setAssignment(pat3.getId(), a3);

        System.out.println();
        System.out.println("Пациенты с назначениями: ");
        System.out.println(hospital);

        hospital.completeAssignment(pat1.getId(), doc2.getId());
        hospital.completeAssignment(pat2.getId(), nurse.getId());
        hospital.completeAssignment(pat3.getId(), nurse.getId());

        System.out.println();
        System.out.println("Пациенты с выполненными назначениями: ");
        System.out.println(hospital);

        hospital.dismissPatient1(pat1, "Окончание лечения");
        hospital.dismissPatient1(pat2, "Окончание лечения");
        hospital.dismissPatient1(pat3, "Переведен на лечение в другое отделение");


        System.out.println();
        System.out.println("Пациенты выписаны: ");
        System.out.println(hospital);

    }
}