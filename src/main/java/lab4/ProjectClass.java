package lab4;

public class ProjectClass {

    private String name;
    private int budget;
    private TeamLeader teamLeader;
    private SeniorManager seniorManager;

    public ProjectClass(String name, int budget) {
        this.name = name;
        this.budget = budget;
    }

    public SeniorManager getSeniorManager() {
        return seniorManager;
    }

    public void setSeniorManager(SeniorManager seniorManager) {
        this.seniorManager = seniorManager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public TeamLeader getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(TeamLeader teamLeader) {
        this.teamLeader = teamLeader;
    }
}