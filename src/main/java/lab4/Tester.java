package lab4;

public class Tester extends Engineer {
    public Tester(int id,
                  String name,
                  int workTime,
                  int base,
                  ProjectClass project,
                  double part) {
        super(id, name, workTime, base, project, part);
    }

    @Override
    public String toString() {
        return "Tester{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", workTime=" + workTime +
                ", payment=" + payment +
                '}';
    }
}
