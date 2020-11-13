package lab4;

public class TeamLeader extends Programmer implements Heading {
    private int forOneSubject = 1000;  // +к зарплате за каждого подчиненого
    private int countOfSubject;

    public int getCountOfSubject() {
        return countOfSubject;
    }

    public void setCountOfSubject(int countOfSubject) {
        this.countOfSubject = countOfSubject;
    }

    public TeamLeader(int id,
                      String name,
                      int workTime,
                      int base,
                      ProjectClass project,
                      double part,
                      int countOfSubject) {
        super(id, name, workTime, base, project, part);
        this.payment = payment(workTime, base) + paymentForSubjects(countOfSubject) +
        paymentForProject(project.getBudget(),part);
    }




    public int paymentForSubjects(int countOfSubject) {
        return forOneSubject*countOfSubject;
    }

    public int getForOneSubject() {
        return forOneSubject;
    }

    public void setForOneSubject(int forOneSubject) {
        this.forOneSubject = forOneSubject;
    }

    @Override
    public String toString() {
        return "TeamLeader{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", workTime=" + workTime +
                ", payment=" + payment +
                '}';
    }
}