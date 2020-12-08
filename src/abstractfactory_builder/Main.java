package abstractfactory_builder;

import abstractfactory_builder.website.WebsiteProjectTeamFactory;

public class Main {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteProjectTeamFactory();
        Developer developer = projectTeamFactory.createDeveloper();
        Tester tester = projectTeamFactory.createTester();
        TeamLead teamLead = projectTeamFactory.createTeamLead();

        System.out.println("Creating website system");
        developer.writeCode();
        tester.writeTest();
        teamLead.manageTeam();
    }
}
