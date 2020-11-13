package lab4;

public class Engineer extends Employee implements Project, WorkTime {
    private int base;
    private double part;

    public Engineer(int id, String name, int workTime, int base, ProjectClass project,double part) {
        super(id, name, workTime);
        this.base = base;
        this.part = part;
        this.payment = payment(workTime, base) + paymentForProject(project.getBudget(),part);
    }


    @Override
    public int paymentForProject(int budget, double part) {
        return (int) (budget * part);
    }

    @Override
    public int payment(int workTime, int base) {
        return workTime * base;
    }

    public int getBase() {
        return base;
    }

    public double getPart() {
        return part;
    }

    public void setPart(double part) {
        this.part = part;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", workTime=" + workTime +
                ", payment=" + payment +
                '}';
    }
}


