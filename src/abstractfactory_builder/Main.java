package abstractfactory_builder;

import abstractfactory_builder.website.WebsiteProjectTeamFactory;

public class Main {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteProjectTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        TeamLead teamLead = projectTeamFactory.getTeamLead();

        System.out.println("Creating website system");
        developer.writeCode();
        tester.writeTest();
        teamLead.manageTeam();
    }
}
