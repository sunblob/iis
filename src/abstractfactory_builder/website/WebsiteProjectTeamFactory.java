package abstractfactory_builder.website;

import abstractfactory_builder.Developer;
import abstractfactory_builder.ProjectTeamFactory;
import abstractfactory_builder.TeamLead;
import abstractfactory_builder.Tester;

import java.util.Arrays;

public class WebsiteProjectTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return WebsiteDeveloper.Builder.create()
                .setFirstName("Артем")
                .setLastName("Кеков")
                .setSKills(Arrays.asList("css", "html", "react")).setYearsOfExperience(3).build();
    }

    @Override
    public Tester getTester() {
        return WebsiteTester.Builder.create()
                .setFirstName("Дима")
                .setLastName("Митрохин")
                .setSKills(Arrays.asList("jest", "mocha"))
                .setYearsOfExperience(2).build();
    }

    @Override
    public TeamLead getTeamLead() {
        return WebsiteTeamLead.Builder.create().setFirstName("Егор").setLastName("Крутов").setYearsOfExperience(10).build();
    }
}
