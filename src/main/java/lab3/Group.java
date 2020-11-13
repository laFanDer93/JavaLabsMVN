package lab3;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private String title;// - название группы
    private Student head;//- ссылка на старосту (из членов группы)
    private List<Student> student = new ArrayList<>();//- массив из ссылок на студентов


    public void addStudent(Student student) {
        this.student.add(student);
        student.setGroup(this);
    }


    public List<Student> getStudent() {
        return student;
    }

    Group(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public Student getHead() {
        return head;
    }

    public void setHead(Student student) {
        this.head = student;
    }

    public Student getStudent(String fio) {
        for (Student s : this.student) {
            if (s.getFio() == fio) {
                return s;
            }
        }
        return null;
    }

    public Student getStudent(int id) {
        for (Student s : this.student) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public double averageGroupMark() {
        double res = 0;
        for (Student s : student) {
            res += s.averageMark();
        }
        return res / student.size();
    }

    public void removeStudent(Student student) {
        this.student.remove(this.student.indexOf(student));
        student.setGroup(null);
    }

    @Override
    public String toString() {
        return "Group{" +
                "title='" + title + '\'' +
                ", head=" + head.getFio() +

                '}';
    }
}