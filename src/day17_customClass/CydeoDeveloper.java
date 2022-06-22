package day17_customClass;

public class CydeoDeveloper {

    public String firstName;
    public String lastName;
    public String state;
    public String city;
    public String group;

    public void setInfo(String firstName, String lastName, String state, String city, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.state = state;
        this.city = city;
        this.group = group;
    }

    public String toString() {
        return "CydeoDeveloper{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

    public void recordFlipgrid(){
        System.out.println(firstName+" "+lastName+" from "+group+" is recording his/her Flipgrid answer.");
    }

    public void attendingLiveSession(){
        System.out.println(firstName+" "+lastName+" from "+group+" is attending Live Session.");
    }

    public void takingQuiz(){
        System.out.println(firstName+" "+lastName+" from "+group+" is taking quiz.");
    }

    public void attendingMentorMeeting(){
        System.out.println(firstName+" "+lastName+" from "+group+" is attending mentor meeting.");
    }

    public void doingGroupStudy(){
        System.out.println(firstName+" "+lastName+" from "+group+" is attending group study.");
    }



}
