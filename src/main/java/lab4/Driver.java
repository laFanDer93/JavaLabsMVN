package lab4;

public class Driver extends Personal {

    public Driver(int id, String name, int workTime, int base) {
        super(id, name, workTime, base);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", workTime=" + workTime +
                ", payment=" + payment +
                '}';
    }
}
