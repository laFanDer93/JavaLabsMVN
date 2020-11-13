package lab4;

public class Cleaner extends Personal {

    public Cleaner(int id, String name, int workTime, int base) {
        super(id, name, workTime, base);
    }

    @Override
    public String toString() {
        return "Cleaner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", workTime=" + workTime +
                ", payment=" + payment +
                '}';
    }
}
