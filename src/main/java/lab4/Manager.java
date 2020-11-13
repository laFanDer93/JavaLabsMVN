package lab4;

public class Manager extends Employee implements Project {
    private double part;

    public Manager(int id, String name, int workTime, ProjectClass project, double part) {
        super(id, name, workTime);
        this.payment = paymentForProject(project.getBudget(),part);
    }

    @Override
    public int paymentForProject(int budget, double part) {
        return (int)(budget*part);
    }

    public double getPart() {
        return part;
    }

    public void setPart(double part) {
        this.part = part;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", workTime=" + workTime +
                ", payment=" + payment +
                '}';
    }
}