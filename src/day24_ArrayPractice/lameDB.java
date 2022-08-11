package day24_ArrayPractice;

public class lameDB {
    public static void main(String[] args) {

        String db="1etsy#2wooden#3spoon";
        String op="edit";
        String id="2";
        String data="aaa";

        System.out.println(lameDb(db,op,id,data));

    }
    public static String lameDb(String db, String op, String id, String data) {
        String[] dbItems = db.split("#");
        String temp = "";
        int j = 0;
        switch(op){
            case "delete":
                for (int i = 0; i < dbItems.length; i++) {
                    if (dbItems[i].contains(id)){
                        temp += dbItems[i].replace(dbItems[i],"");
                        continue;
                    }
                    temp += dbItems[i]+"#";
                }
                break;
            case "edit":
                for (int i = 0; i < dbItems.length; i++) {
                    if (dbItems[i].contains(id)){
                        temp += dbItems[i].replace(dbItems[i].substring(1),data)+"#";
                        continue;
                    }
                    temp += dbItems[i]+"#";
                }
                break;
            case "add":
                if (dbItems.length < Integer.valueOf(id)){
                    temp = db+"#"+id+data;
                }else{
                    for (int i = 0; i < dbItems.length; i++) {
                        j++;
                        if (dbItems[i].contains(id)){
                            temp+= j+data+"#";
                            j++;
                            dbItems[i] = j+dbItems[i].substring(1);
                            temp+=dbItems[i]+"#";
                            continue;
                        }
                        temp += j+dbItems[i].substring(1)+"#";
                    }
                }
                break;
        }
        if (temp.charAt(temp.length()-1) == '#'){
            temp = temp.substring(0,temp.length()-1);
        }
        return temp;
    }
}
