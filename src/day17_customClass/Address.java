package day17_customClass;

public class Address {

   public int buildingNumber;
   public String street;
   public String city;
   public String state;
   public int zipcode;

   public void setInfo(int buildingNumber, String street, String city, String state, int zipcode) {
      this.buildingNumber = buildingNumber;
      this.street = street;
      this.city = city;
      this.state = state;
      this.zipcode = zipcode;
   }

   public String toString() {
      return "EX: \n"+buildingNumber+" "+street+"\n"+city+" "+state+", "+zipcode;
   }
}
