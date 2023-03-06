package day31_Constructor.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PQ, BA, SM;
    public ArrayList<Tester> testersList = new ArrayList<>();
    public ArrayList<Developer> devopsList = new ArrayList<>();
    public int daysOfSprint;


    public ScrumTeam(String PQ, String BA, String SM, int daysOfSprint) {
        this.PQ = PQ;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(Tester tester) {

        testersList.add(tester);
    }

    public void addTesters(Tester[] testers) {

        testersList.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer) {
        devopsList.add(developer);
    }

    public void addDevelopers(Developer[] developers) {

        devopsList.addAll(Arrays.asList(developers));
    }
public void removeTester(int employeeID){
        testersList.removeIf(P -> P.employeeID == employeeID);
}

public void removeDeveloper(int employeeID){
        devopsList.removeIf(p -> p.employeeID == employeeID);
}

    public String toString() {
        return "ScrumTeam{" +
                "PQ='" + PQ + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testersList.size() +
                ", total number of developers=" + devopsList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
