package day17_customClass;

public class TestCydeoDeveloper {

    public static void main(String[] args) {

        CydeoDeveloper student1=new CydeoDeveloper();

        student1.setInfo("Alena","Elhajassaad","SC","Greer","Group 6");

        System.out.println(student1);

        student1.recordFlipgrid();
        student1.attendingLiveSession();
        student1.takingQuiz();
        student1.attendingMentorMeeting();
        student1.doingGroupStudy();

        System.out.println("----------------------");

        CydeoDeveloper student2=new CydeoDeveloper();
        student2.setInfo("Marika","Tsotsonava", "NY", "Sunnyside","Group 6");

        student2.recordFlipgrid();
        student2.attendingLiveSession();






    }

}
