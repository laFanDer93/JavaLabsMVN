package lab4;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestJava {


    public static void main(String[] args) throws IOException {
        List<Cleaner> cleaners = new ArrayList<>();
        List<Driver> drivers = new ArrayList<>();
        List<Engineer> engineers = new ArrayList<>();
        List<Programmer> programmers = new ArrayList<>();
        List<Tester> testers = new ArrayList<>();
        List<Manager> managers = new ArrayList<>();
        List<ProjectManager> projectManagers = new ArrayList<>();
        List<Employee> employees = new ArrayList<>();
        ProjectClass skyScanner = new ProjectClass("SkyScanner", 400000);

        Gson gson = new Gson();
        BufferedReader br = new BufferedReader(new FileReader("\\JavaLabsMvn\\src\\main\\resources\\TeamForLab4"));
        JSONgetObjectFromTeam object = gson.fromJson(br, JSONgetObjectFromTeam.class);
            for (Team member : object.getTeam()) {
                switch (member.getPosition()) {
                    case "cleaner":
                        cleaners.add(new Cleaner(member.getId(), member.getName(), member.getWorkTime(), member.getBase()));
                        break;
                    case "driver":
                        drivers.add(new Driver(member.getId(), member.getName(), member.getWorkTime(), member.getBase()));
                        break;
                    case "engineer":
                        engineers.add(new Engineer(member.getId(), member.getName(), member.getWorkTime(), member.getBase(), skyScanner, member.getPart()));
                        break;
                    case "programmer":
                        programmers.add(new Programmer(member.getId(), member.getName(), member.getWorkTime(), member.getBase(), skyScanner, member.getPart()));
                        break;
                    case "tester":
                        testers.add(new Tester(member.getId(), member.getName(), member.getWorkTime(), member.getBase(), skyScanner, member.getPart()));
                        break;
                    case "team_leader":
                        TeamLeader teamLeader = new TeamLeader(member.getId(), member.getName(), member.getWorkTime(), member.getBase(), skyScanner, member.getPart(), (engineers.size()+ testers.size()+ programmers.size()));
                        skyScanner.setTeamLeader(teamLeader);
                        break;
                    case "manager":
                        managers.add(new Manager(member.getId(), member.getName(), member.getWorkTime(), skyScanner, member.getPart()));
                        break;
                    case "project_manager":
                        projectManagers.add(new ProjectManager(member.getId(), member.getName(), member.getWorkTime(), skyScanner, member.getPart(), managers.size()));
                        break;
                    case "senior_manager":
                        SeniorManager seniorManager = new SeniorManager(member.getId(), member.getName(), member.getWorkTime(), skyScanner, member.getPart(), (managers.size() + projectManagers.size()));
                        skyScanner.setSeniorManager(seniorManager);
                        break;
                }
            }

        //вывод
        System.out.println("Project: \"" + skyScanner.getName() + "\". Budget: "+ skyScanner.getBudget()  );
        System.out.printf("%-5s%-20s%-10s%-15s\n","id","name","workTime","payment" );
        System.out.println("Cleaners");
        for(Cleaner m: cleaners) {
            System.out.printf("%-5s%-20s%-10s%-15s\n",m.getId(),m.getName(),m.getWorkTime(),m.getPayment());
        }
        System.out.println("Drivers");
        for(Driver m: drivers){
            System.out.printf("%-5s%-20s%-10s%-15s\n",m.getId(),m.getName(),m.getWorkTime(),m.getPayment());
        }
        System.out.println("Managers");
        for(Manager m: managers){
            System.out.printf("%-5s%-20s%-10s%-15s\n",m.getId(),m.getName(),m.getWorkTime(),m.getPayment());
        }
        System.out.println("ProjectManagers");
        for(ProjectManager m: projectManagers){
            System.out.printf("%-5s%-20s%-10s%-15s\n",m.getId(),m.getName(),m.getWorkTime(),m.getPayment());
        }
        System.out.println("Engineers");
        for(Engineer m: engineers){
            System.out.printf("%-5s%-20s%-10s%-15s\n",m.getId(),m.getName(),m.getWorkTime(),m.getPayment());
        }
        System.out.println("Programmers");
        for(Programmer m:programmers){
            System.out.printf("%-5s%-20s%-10s%-15s\n",m.getId(),m.getName(),m.getWorkTime(),m.getPayment());
        }
        System.out.println("Testers");
        for(Tester m: testers){
            System.out.printf("%-5s%-20s%-10s%-15s\n",m.getId(),m.getName(),m.getWorkTime(),m.getPayment());
        }
        System.out.println("TeamLeader");
        System.out.printf("%-5s%-20s%-10s%-15s\n",skyScanner.getTeamLeader().getId(),skyScanner.getTeamLeader().getName(),skyScanner.getTeamLeader().getWorkTime(),skyScanner.getTeamLeader().getPayment());
        System.out.println("SeniorManager");
        System.out.printf("%-5s%-20s%-10s%-15s\n",skyScanner.getSeniorManager().getId(),skyScanner.getSeniorManager().getName(),skyScanner.getSeniorManager().getWorkTime(),skyScanner.getSeniorManager().getPayment());



    }

}