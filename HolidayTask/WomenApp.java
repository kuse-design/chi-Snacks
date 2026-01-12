import java.util.Scanner;
public class WomenApp{
    public static void main(String...args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter last period day number : ");
        int lastPeriodDay = input.nextInt();     
        System.out.print("Enter cycle days : ");
        int cycleDays = input.nextInt();
        System.out.print("Enter period Days : ");
        int periodDays = input.nextInt();




        int ovulationDay = cycleDays - 14;

        int fertileDays = ovulationDay - 5;
        int fertileDaysEnd = ovulationDay + 1;

        int TheNextPeriodDay  = lastPeriodDay + cycleDays;
        int periodEndDay = TheNextPeriodDay + periodDays;

System.out.print("=====================================================================================================");
System.out.println("Next period start on day : " + TheNextPeriodDay);
System.out.println("******************************************************************************************************");
System.out.println("Period Day : " + periodEndDay);
System.out.println("******************************************************************************************************");
System.out.println("Ovulation day : " + (lastPeriodDay + ovulationDay));
System.out.println("******************************************************************************************************");
System.out.println("Fertile period : " + (lastPeriodDay + fertileDays) + "to" + (lastPeriodDay + fertileDaysEnd));
System.out.println("******************************************************************************************************");
System.out.println("SAFE DAYs:");
System.out.println("Before: "  + lastPeriodDay  + " to "+ (lastPeriodDay + fertileDays - 1));
System.out.println("After: "  + (lastPeriodDay + fertileDaysEnd + 1) + " to "  + (TheNextPeriodDay - 1));
System.out.println("=====================================================================================================");


              
              
                
        
            
               
              
}
}
