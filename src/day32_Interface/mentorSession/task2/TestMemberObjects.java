package day32_Interface.mentorSession.task2;

public class TestMemberObjects {
    public static void main(String[] args) {

        Employee employee=new Employee("Alena", 31,35627463, "345 heart lake,SC, 29639", 95000 );

        Manager manager=new Manager("Billy", 45, 4563728, "274 woodlake, CA 57389", 145000);

        System.out.println(employee);
        System.out.println(manager);
        
    }
}
