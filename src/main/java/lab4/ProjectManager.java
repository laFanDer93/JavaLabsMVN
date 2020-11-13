package lab4;

public class ProjectManager extends Manager implements Heading {

    private int forOneSubject = 800;

    public ProjectManager(int id,
                          String name,
                          int workTime,
                          ProjectClass project,
                          double part,
                          int countOfSubject) {
        super(id, name, workTime, project, part);
        this.payment = paymentForProject(project.getBudget(),part)+paymentForSubjects(countOfSubject);
    }


    @Override
    public int paymentForSubjects(int countOfSubject) {
        return countOfSubject*forOneSubject;
    }

    public int getForOneSubject() {
        return forOneSubject;
    }

    public void setForOneSubject(int forOneSubject) {
        this.forOneSubject = forOneSubject;
    }

    @Override
    public String toString() {
        return "ProjectManager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", workTime=" + workTime +
                ", payment=" + payment +
                '}';
    }
}