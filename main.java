package HW_2;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        Student student = new Student("Иван", "Ложкин", "ПКС251", 2.1);
        Aspirant aspirant = new Aspirant("Евгений", "Паровозов", "ПИ222", 4, "Крыша");
        Student[] students = {student, aspirant};

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getScholarship());
        }

        // Задание 2

        Veterinar veterinar = new Veterinar();
        WIVOTNOE[] WIVOTNIE = new WIVOTNOE[3];
        WIVOTNIE[0] = new CO6AKA("Шарик", "Собачий корм", "Дом");
        WIVOTNIE[1] = new KOT("Барсик", "Рыба", "Улица");
        WIVOTNIE[2] = new MISH("Вильзевул", "Семечки", "Подвал");

        for (WIVOTNOE WIVOTNOE : WIVOTNIE) {
            Veterinar.treatWIVOTNOE(WIVOTNOE);
        }

    }
}
