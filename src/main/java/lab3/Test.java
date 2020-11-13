package lab3;

public class Test {
    public static void main(String[] args) {

        Deanery deanery = new Deanery(); //Создали список студентов и групп
        System.out.println("=================================================");
        deanery.addRandomMark();          //Добавили рандомные оценки от 2 до 5
        System.out.println("=================================================");
        deanery.studentsSetGroupRandomly(); //Рандомно распределили в группs
        System.out.println("=================================================");
        deanery.avrgGrAndStMark(); //Вывод средних оценок по студентам и группам отдельно
        System.out.println("=================================================");
        System.out.println(deanery.getStudents().toString());
        deanery.transferStudent(deanery.getStudents().get(0),
                deanery.getStudents().get(0).getGroup(),
                deanery.getGroups().get(1));   //Перевод студента из текущей группы во 2ую.
        deanery.dismissalForBadMarks(3.6); //Отчислить всех, у кого средняя оценка меньше указанной



        System.out.println(deanery.getStudents().toString());

    }
}
