package day25_customClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MyOffer {
    public static void main(String[] args) {

        Offer offer1 = new Offer("SC", "apple", "JD", 100000, true, true, true, true);
        Offer offer2 = new Offer("NY", "apple", "JD", 50000, true, true, true, true);
        Offer offer3 = new Offer("Oregon", "apple", "JD", 100000, true, false, true, true);
        Offer offer4 = new Offer("SC", "apple", "JD", 120000, true, true, true, true);
        Offer offer5 = new Offer("alabama", "apple", "JD", 120000, false, true, true, true);
        Offer offer6 = new Offer("florida", "apple", "JD", 100000, true, true, true, false);
        Offer offer7 = new Offer("NC", "apple", "JD", 80000, true, true, false, true);

        Offer [] myOffers= {offer1, offer2, offer3, offer4, offer5, offer6, offer7};

        ArrayList<Offer> fullTimeOffers=new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(each->!each.isFullTime);

        ArrayList<Offer> localOffers=new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(each->!each.location.equals("SC"));

        ArrayList<Offer> offersWithBenefits=new ArrayList<>(Arrays.asList(myOffers));
        offersWithBenefits.removeIf(each->!each.hasPTO && !each.hasBenefit);

        ArrayList<Offer> devOffers=new ArrayList<>(Arrays.asList(myOffers));
        devOffers.removeIf(each->!each.jobTitle.equals("JD"));

        ArrayList<Offer> with100K=new ArrayList<>(Arrays.asList(myOffers));
        with100K.removeIf(each->each.salary<100000);




    }
}
/* 2. Create a class named MyOffers:

            2.1 Create 7 objects of Offer
            2.2 Create an array of Offers named myOffers and store all 7 objects of offers
            2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
                    2.3.1 Write a program that can remove the offer objects that are not full-time
            2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
                    2.4.1 Write a program that can remove all the offers that are not from local
            2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
                    2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
            2.6 Create an ArrayList of Offer named devOffers and add all the offer objects.
                    2.6.1 Write a program that can remove all the offers that does not contain developer in the jobTitle

            2.7 Create an ArrayList of Offer named offers With100K and add all the offer objects.
                    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary
*/
