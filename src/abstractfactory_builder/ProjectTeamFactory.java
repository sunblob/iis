package abstractfactory_builder;

public interface ProjectTeamFactory {
    Developer createDeveloper();
    Tester createTester();
    TeamLead createTeamLead();
}
