package lab3;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private int id;// - идентификационный номер
    private String fio;// - фамилия и инициалы
    Group group;// - ссылка на группу (объект Group)
    List<Integer> marks;// - контейнер оценок (ArrayList).

    Student(int id, String fio) {
        this.id = id;
        this.fio = fio;
        this.marks = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        if (this.getGroup() == null && group.getStudent(this.id)==null) {
            this.group = group;
             group.addStudent(this);
        } else {
            this.group = group;
        }
    }


    public void addMarks(int mark) {
        marks.add(mark);
    }

    public double averageMark() {
        double markSum = 0;
        for (int i : marks) {
            markSum += i;
        }
        return (double) markSum / marks.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
//                ", group=" + group.getTitle() +
                ", marks=" + marks +
                '}';
    }
}
