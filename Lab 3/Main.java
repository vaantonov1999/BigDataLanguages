public class Main {

    public static void main(String[] args) {

        Faculty faculty = new Faculty();

        Abiturient ab1 = new Abiturient(1, "Сергей Иванов Игоревич", "Зарегестрирован" );
        Abiturient ab2 = new Abiturient(2,"Григорий Кайдмен Петрович","Зарегестрирован");
        Abiturient ab3 = new Abiturient(3, "Владимир Костромин Олегович", "Зарегестрирован");


        Teachers ts1 = new Teachers(1, "Семёнов Михаил Александрович", "Преподователь");
        Teachers ts2 = new Teachers(2, "Воронова Мария Юрьевна", "Преподователь");
        Teachers ts3 = new Teachers(3, "Воронова Мария Юрьевна", "Преподователь");

        faculty.addAbiturient(ab1);
        faculty.addAbiturient(ab2);
        faculty.addAbiturient(ab3);


        faculty.addTeachers(ts1);
        faculty.addTeachers(ts2);
        faculty.addTeachers(ts3);

        faculty.setTS(ab1.getId(), ts1.getId());
        faculty.setTS(ab2.getId(), ts2.getId());
        faculty.setTS(ab3.getId(), ts3.getId());


        Assignment a1 = new Assignment();
        a1.addEvaluation("Экзамен 1 - 4");
        a1.addEvaluation("Экзамен 2 - 4");
        a1.addEvaluation("Экзамен 3 - 4");
        a1.addSR("4");
        a1.addResult("Зачислен");
        faculty.setAssignment(ab1.getId(), a1);


        Assignment a2 = new Assignment();
        a2.addEvaluation("Экзамен 1 - 3");
        a2.addEvaluation("Экзамен 2 - 4");
        a2.addEvaluation("Экзамен 3 - 3");
        a2.addSR("3,3");
        a2.addResult("Незачислен");
        faculty.setAssignment(ab2.getId(), a2);

        Assignment a3 = new Assignment();
        a3.addEvaluation("Экзамен 1 - 5");
        a3.addEvaluation("Экзамен 2 - 5");
        a3.addEvaluation("Экзамен 3 - 5");
        a3.addSR("5");
        a3.addResult("Зачислен");
        faculty.setAssignment(ab3.getId(), a3);

        System.out.println();
        System.out.println(faculty);


        faculty.completeAssignment(ab1.getId(), ts1.getId());
        faculty.completeAssignment(ab2.getId(), ts2.getId());
        faculty.completeAssignment(ab3.getId(), ts3.getId());



    }

}