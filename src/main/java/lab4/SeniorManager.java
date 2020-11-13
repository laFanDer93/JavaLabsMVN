package lab4;

public class SeniorManager extends ProjectManager {
    public SeniorManager(int id, String name, int workTime, ProjectClass project, double part, int countOfSubject) {
        super(id, name, workTime, project, part, countOfSubject);
    }

    @Override
    public String toString() {
        return "SeniorManager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", workTime=" + workTime +
                ", payment=" + payment +
                '}';
    }
}
