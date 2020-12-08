package abstractfactory_builder.website;

import abstractfactory_builder.TeamLead;

public class WebsiteTeamLead implements TeamLead {

    private String firstName;
    private String lastName;
    private int yearsOfExperience;

    private WebsiteTeamLead() {}

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

    @Override
    public String toString() {
        return "WebsiteTeamLead{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }

    @Override
    public void manageTeam() {
        System.out.println("Managing team for a website studio...");
    }

    public static class Builder {

        private String firstName;
        private String lastName;
        private int yearsOfExperience;

        private Builder() {}

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

        public WebsiteTeamLead build() {
            WebsiteTeamLead teamLead = new WebsiteTeamLead();
            teamLead.firstName = this.firstName;
            teamLead.lastName = this.lastName;
            teamLead.yearsOfExperience = this.yearsOfExperience;

            return teamLead;
        }

    }
}
