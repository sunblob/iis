package abstractfactory_builder.website;

import abstractfactory_builder.Tester;

import java.util.List;

public class WebsiteTester implements Tester {

    private String firstName;
    private String lastName;
    private int yearsOfExperience;
    private List<String> skills;

    private WebsiteTester() {}

    @Override
    public void writeTest() {
        System.out.println("Writing tests for a website studio...");
    }

    public static class Builder {

        private String firstName;
        private String lastName;
        private int yearsOfExperience;
        private List<String> skills;

        private Builder() {
        }

        public static Builder create() {
            return new Builder();
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setYearsOfExperience(int yearsOfExperience) {
            this.yearsOfExperience = yearsOfExperience;
            return this;
        }

        public Builder setSKills(List<String> skills) {
            this.skills = skills;
            return this;
        }

        public WebsiteTester build() {
            WebsiteTester tester = new WebsiteTester();
            tester.firstName = this.firstName;
            tester.lastName = this.lastName;
            tester.yearsOfExperience = this.yearsOfExperience;
            tester.skills = this.skills;

            return tester;
        }
    }
}
