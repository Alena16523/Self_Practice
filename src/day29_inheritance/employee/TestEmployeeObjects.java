package day29_inheritance.employee;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        Tester tester1=new Tester();
        tester1.setName("Alena");
        tester1.setGender('F');
        tester1.testing();

        System.out.println("-------------------------");

        Teacher teacher1=new Teacher();
        teacher1.setName("Mark");
        teacher1.setAge(30);
        teacher1.isTeaching();

        System.out.println("-------------------------");

        Driver driver1=new Driver();
        driver1.setAge(40);
        driver1.setName("Alisa");
        driver1.isDriving();



    }
}
