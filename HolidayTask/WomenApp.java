import java.util.Scanner;
public class WomenApp{
    public static void main(String...args){

        Scanner input = new Scanner(System.in);
        int lastPeriodDay = 0;
        int cycleDays = 0;
        int periodDays = 0;        




        while(true){
            System.out.print("Enter last period day number : ");
            lastPeriodDay = input.nextInt(); 
    
            System.out.print("Enter cycle days : ");
            cycleDays = input.nextInt();

            System.out.print("Enter period Days : ");
            periodDays = input.nextInt();


            if(lastPeriodDay < 1 || cycleDays < 21 || periodDays < 1 || periodDays > cycleDays){
                System.out.println("Invalid");
            }
            else {
                break;
            }
        }

        int ovulationDay = cycleDays - 14;

        int fertileDays = ovulationDay - 5;
        int fertileDaysEnd = ovulationDay + 1;

        int nextPeriodDay  = lastPeriodDay + cycleDays;
        int periodEndDay = nextPeriodDay + periodDays - 1;

System.out.println("=====================================================================================================");
System.out.println("Next period start on day : " + nextPeriodDay);
System.out.println("******************************************************************************************************");
System.out.println("Period Day : " + periodEndDay);
System.out.println("******************************************************************************************************");
System.out.println("Ovulation day : " + (lastPeriodDay + ovulationDay));
System.out.println("******************************************************************************************************");
System.out.println("Fertile period : " + (lastPeriodDay + fertileDays) + " to " + (lastPeriodDay + fertileDaysEnd));
System.out.println("******************************************************************************************************");
System.out.println("SAFE DAYs:");
System.out.println("Before: "  + lastPeriodDay  + " to "+ (lastPeriodDay + fertileDays - 1));
System.out.println("After: "  + (lastPeriodDay + fertileDaysEnd + 1) + " to "  + (nextPeriodDay - 1));
System.out.println("=====================================================================================================");


              
              
                
        
            
               
              
}
}
