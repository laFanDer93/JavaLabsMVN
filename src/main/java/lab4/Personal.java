package lab4;

public abstract class Personal extends Employee implements WorkTime {
    private int base;
    public Personal(int id, String name, int workTime, int base) {
        super(id, name, workTime);
        this.base = base;
        this.payment = payment(workTime, base);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public int payment(int workTime, int base) {
        return workTime * base;
    }
}
