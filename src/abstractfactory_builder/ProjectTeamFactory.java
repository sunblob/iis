package abstractfactory_builder;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    TeamLead getTeamLead();
}
