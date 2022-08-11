package day25_customClass;

public class Pizza {

    public String size;
    public int numberOfCheeseToppings;
    public int numberOfPepperoniToppings;

    public Pizza(String size, int numberOfCheeseToppings, int numberOfPepperoniToppings) {
        this.size = size;
        this.numberOfCheeseToppings = numberOfCheeseToppings;
        this.numberOfPepperoniToppings = numberOfPepperoniToppings;
    }

    public static int calcCost(String size, int numberOfCheeseToppings, int numberOfPepperoniToppings){
        int totalCost=0;

        if(size.equals("small")){
            totalCost=10+(numberOfCheeseToppings*2)+(numberOfPepperoniToppings*2);
        }else if(size.equals("medium")){
            totalCost=12+(numberOfCheeseToppings*2)+(numberOfPepperoniToppings*2);
        }else{
            totalCost=14+(numberOfCheeseToppings*2)+(numberOfPepperoniToppings*2);
        }

        return totalCost;
    }


    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseToppings=" + numberOfCheeseToppings +
                ", numberOfPepperoniToppings=" + numberOfPepperoniToppings +
                ", total cost =" + calcCost(size, numberOfCheeseToppings, numberOfPepperoniToppings) +
                '}';
    }
}
