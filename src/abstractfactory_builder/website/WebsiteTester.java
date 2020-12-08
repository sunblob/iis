package abstractfactory_builder.website;

import abstractfactory_builder.Tester;

import java.util.List;

public class WebsiteTester implements Tester {

    private String firstName;
    private String lastName;
    private int yearsOfExperience;
    private List<String> skills;

    private WebsiteTester() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "WebsiteTester{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", skills=" + skills +
                '}';
    }

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
