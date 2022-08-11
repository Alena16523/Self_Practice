package day26_statics;

public class Iphone {

    public static String brand;
    public static String OS;
    public static boolean isSmartPhone;
    public static String madeIn;
    public static String designedIN;

    public String model;
    public String size;
    public String color;
    public int price;

    public Iphone(String model, String size, String color, int price) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    static{
        brand="Apple"; OS="IOS"; isSmartPhone=true; madeIn="China"; designedIN="California";
    }

    public static void printOperatingSystem(){
        System.out.println(OS);
    }





}
