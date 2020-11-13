package lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Deanery {
    private List<Student> students = new ArrayList<>();
    private List<Group> groups = new ArrayList<>();
    private File fileStudents = new File("\\JavaLabsMvn\\src\\main\\resources\\students");
    private File fileGroups = new File("\\JavaLabsMvn\\src\\main\\resources\\groups");
    private Scanner scannerStudents;
    private Scanner scannerGroups;

    public List<Student> getStudents() {
        return students;
    }

    public List<Group> getGroups() {
        return groups;
    }

    {
        try {
            scannerStudents = new Scanner(fileStudents);
            int id = 0;
            while (scannerStudents.hasNextLine()) {
                students.add(new Student(id, scannerStudents.nextLine()));
                id++;

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            scannerGroups = new Scanner(fileGroups);
            while (scannerGroups.hasNextLine()) {
                groups.add(new Group(scannerGroups.nextLine()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public void addRandomMark() {
        for (Student s : students) {
            for (int i = 0; i < 10; i++) {
                s.addMarks(new Random().nextInt(3) + 3);
            }
        }
    }

    public void avrgGrAndStMark() {
        System.out.println("-----------------Студенты-----------------------");
        for (Student s : students) {
            System.out.println("id " + s.getId() +
                    "." + s.getFio() +
                    "|| Средняя Оценка: " + s.averageMark()
                    + "|| " + s.getGroup().getTitle());
        }
        System.out.println("-----------------ГРУППЫ-----------------------");
        for (Group g : groups) {
            System.out.println(g.getTitle() + " Средняя Оценка: " + g.averageGroupMark());
        }
    }

    public void transferStudent(Student student, Group current, Group future) {
        current.removeStudent(student);
        future.addStudent(student);
    }

    public void setHeadGroup(Group group) {
        group.setHead(group.getStudent().get(new Random().nextInt(group.getStudent().size())));
        System.out.println("выбрали старосту: " + group.getHead());
    }

    public void dismissalForBadMarks(double minAvrgMark) {
        int countOfStudentAfter = students.size();
        int countOfStudentBefore = students.size();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).averageMark() < minAvrgMark) {
                System.out.println("Student: id " + students.get(i).getId() + ". " +
                        students.get(i).getFio() + " was remove from average marks " + students.get(i).averageMark());
                students.get(i).getGroup().removeStudent(students.get(i));
                getStudents().remove(students.get(i));
                countOfStudentAfter++;
            }
        }
        System.out.println(countOfStudentAfter + " --> " + countOfStudentBefore + " deleted -->  " + (countOfStudentAfter-countOfStudentBefore));
    }

    public void studentsSetGroupRandomly() {
        for (int i = 0; i < students.size(); i++) {
            groups.get(new Random().nextInt(5)).addStudent(students.get(i));
        }

        for (Group g : groups) {
            setHeadGroup(g);
        }
    }
}
