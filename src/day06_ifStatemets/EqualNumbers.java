package day06_ifStatemets;

public class EqualNumbers {

    public static void main(String[] args) {

        int n1 = 6,
                n2 = 6,
                n3 = 9;

        if(n1==n2 && n1==n3){
            System.out.println("all equal");
        }

        if(n1==n2){
            System.out.println("n1&n2 are equal");
        }

        if(n1==n3){
            System.out.println("n1&n3 are equal");
        }

        if(n2==n3){
            System.out.println("n2&n3 are equal");
        }

        if(n3==n1){
            System.out.println("n3&n1 are equal");
        }

        if(n1!=n2 && n1!=n3){
            System.out.println("none of them are equal");
        }

    }


}
