package day31_classObject.states;

public class States {

    private String name;
    private String abbreviation;
    private String politicalParty;
    private String governor;
    private String senator;
    private double population;
    private int stateTax;

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, double population, int stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(name==null|| name.isEmpty()|| name.isBlank()){
            System.err.println("Invalid name: "+name);
            System.exit(1);
        }

        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {

        if(abbreviation==null|| abbreviation.isEmpty()|| abbreviation.isBlank()){
            System.err.println("Invalid name: "+abbreviation);
            System.exit(1);
        }

        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {

        if(politicalParty==null|| politicalParty.isEmpty()|| politicalParty.isBlank()){
            System.err.println("Invalid name: "+politicalParty);
            System.exit(1);
        }

        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {

        if(governor==null|| governor.isEmpty()|| governor.isBlank()){
            System.err.println("Invalid name: "+name);
            System.exit(1);
        }

        this.governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {

        if(senator==null|| senator.isEmpty()|| senator.isBlank()){
            System.err.println("Invalid name: "+senator);
            System.exit(1);
        }

        this.senator = senator;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {

        if(population<=0){
            System.err.println("Invalid population: "+population);
            System.exit(1);
        }

        this.population = population;
    }

    public int getStateTax() {
        return stateTax;
    }

    public void setStateTax(int stateTax) {

        if(stateTax<=0){
            System.err.println("Invalid state tax: "+stateTax);
            System.exit(1);
        }

        this.stateTax = stateTax;
    }

    public String toString() {
        return getClass().getSimpleName()+  "{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
/*
Create a class named States:
            variables:
                name, abbreviation, politicalParty, Governor, senator, population, stateTax

            Encapsulate all the fields

            Add a constructor that can set all the fields

                        Conditions:
                            1. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            2. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            3. taxRate can not be negative
                            4. Population can not be zero or negative

            Methods:
                toString()

 */