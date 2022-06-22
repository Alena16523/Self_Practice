package day07_ifStatements;

public class CappucinoBuyer {

    public static void main(String[] args) {

        String size ="tall",
                size2= "grande",
                size3="venti";

        String result = "";

        if(size=="tall" || size=="grande" || size=="venti"){
            if(size=="tall"){
                result="price is $3.09 \n90 calories";
            }else if(size=="grande"){
                result="price is $3.99 \n120 calories";
            }else{
                result= "price is $4.29 \n150 calories";
            }
        }else{
            result="invalid size";
        }

        System.out.println(result);






    }

}
