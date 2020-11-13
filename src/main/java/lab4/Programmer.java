package lab4;

public class Programmer extends Engineer {
    public Programmer(int id,
                      String name,
                      int workTime,
                      int base,
                      ProjectClass project,
                      double part) {
        super(id, name, workTime, base, project, part);
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", workTime=" + workTime +
                ", payment=" + payment +
                '}';
    }
}
