package day08_Ternaries_Switch;

public class BrowserName {

    public static void main(String[] args) {

        String browserName="safari";
        String result = "Selected browser is ";
        String result2="";

        switch(browserName){
            case "chrome":
                result2=result+ browserName;
                break;
            case "firefox":
                result2=result+ browserName;
                break;
            case "opera":
                result2=result + browserName;
                break;
            case "safari":
                result2=result+ browserName;
                break;
            case "edge":
                result2=result+browserName;
                break;
            default:
                result2="Invalid Browser";
        }

        System.out.println(result2);





    }

}
