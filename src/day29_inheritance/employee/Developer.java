package day29_inheritance.employee;

public class Developer extends Employee {

    private String programmingLanguage;


    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {

        boolean isValid= programmingLanguage.equals("Java") || programmingLanguage.equals("JacaScript")|| programmingLanguage.equals("Python") ||
                programmingLanguage.equals("Ruby")|| programmingLanguage.equals("C#")||programmingLanguage.equals("C++")||
                programmingLanguage.equals("Swift");

        if(!isValid){
            System.out.println("Invalid programming language: "+programmingLanguage);
            System.exit(1);
        }

        this.programmingLanguage = programmingLanguage;
    }


    public void isCoding(){
        System.out.println(getName()+" is coding");
    }


    public String toString() {
        return "Developer{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
