package abstractfactory_builder.website;

import abstractfactory_builder.Developer;

import java.util.List;

public class WebsiteDeveloper implements Developer {

    private String firstName;
    private String lastName;
    private int yearsOfExperience;
    private List<String> skills;

    private WebsiteDeveloper() {}

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
        return "WebsiteDeveloper{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", skills=" + skills +
                '}';
    }

    @Override
    public void writeCode() {
        System.out.println("Writing code for a website studio...");
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

        public WebsiteDeveloper build() {
            WebsiteDeveloper developer = new WebsiteDeveloper();
            developer.firstName = this.firstName;
            developer.lastName = this.lastName;
            developer.yearsOfExperience = this.yearsOfExperience;
            developer.skills = this.skills;

            return developer;
        }
    }
}
