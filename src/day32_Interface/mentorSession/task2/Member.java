package day32_Interface.mentorSession.task2;

public class Member {

    private String name;
    private int age;
    private int phoneNumber;
    private String address;
    private int salary;

    public Member(String name, int age, int phoneNumber, String address, int salary) {
        setName(name);
        setAge(age);
        setPhoneNumber(phoneNumber);
        setAddress(address);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void printSalary(){
        System.out.println("Salary of "+name+" is "+salary);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
