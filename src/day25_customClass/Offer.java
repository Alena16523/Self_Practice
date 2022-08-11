package day25_customClass;

public class Offer {

    public String location;
    public String companyName;
    public String jobTitle;
    public int salary;
    public boolean hasBenefit, isFullTime;
    public boolean hasPTO, isWFH;

    public Offer(String location, String companyName, String jobTitle, int salary, boolean hasBenefit, boolean isFullTime, boolean hasPTO, boolean isWFH) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.isFullTime = isFullTime;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
    }

    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasBenefit=" + hasBenefit +
                ", isFullTime=" + isFullTime +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                '}';
    }
}
/*
Create a custom class named Offer
            Attributes:
                    location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime

                Add a constructor that can set all the fields

            Actions:
                toString(): returns the full info of the Offer Object


 */