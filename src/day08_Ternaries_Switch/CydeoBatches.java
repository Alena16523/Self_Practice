package day08_Ternaries_Switch;

public class CydeoBatches {

    public static void main(String[] args) {

      String batchType="US morning";
      String result="";
      String time ="Class times are ";

      if(batchType=="US morning" || batchType=="US evening" || batchType=="EU"){
          if(batchType=="US morning"){
              result= time+ "10-5 EST. M, T, TH, F.";
          }else if(batchType=="US evening"){
              result= time+ "7-10 EST. M, T, W, Th, S, S.";
          }else{
              result= time+ "10-5 EST. M, T, W, Th, F.";
          }
      }else{
          result="Invalid Batch";
      }

        System.out.println(result);



    }

}
/*
Create a class named CydeoBatches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

 */