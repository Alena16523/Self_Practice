package day31_classObject.employeeTask;


public class Employee {

    private String name;
    private int age;
    private char gender;
    private String id;
    private String jobTitle;
    private int salary;
    private String companyName;


    public Employee(String name, int age, char gender, String id, String jobTitle, int salary, String companyName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
        setCompanyName(companyName);
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

        if(age<=0){
            System.err.println("Invalid age: "+age);
            System.exit(1);
        }

        if(age<18){
            System.err.println("Invalid age: "+age);
            System.exit(1);
        }

        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if(!(gender=='F'|| gender=='M')){
            System.err.println("Invalid gender: "+gender);
            System.exit(1);
        }

        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {

        if(salary<0){
            System.err.println("Invalid salary: "+salary);
            System.exit(1);
        }

        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void work(){
        System.out.println(name+" is working");
    }

    public String toString() {
        return  getClass().getSimpleName()+  "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
