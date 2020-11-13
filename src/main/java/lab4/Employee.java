package lab4;

//Класс-родитель всех сотрудников.

public class Employee {
    protected int id; //ИД сотрудника
    protected String name; //ФИО сотрудника
    protected int workTime; //отработанное время
    protected int payment; //зарплата сотрудника

    public Employee(int id, String name, int workTime) {
        this.id = id;
        this.name = name;
        this.workTime = workTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }
}
