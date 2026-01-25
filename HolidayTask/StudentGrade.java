import java.util.Scanner;
import java.util.Arrays;


public class StudentGrade{
    public static void main (String...args){


    Scanner input = new Scanner(System.in);

    System.out.print("How many student do you have : ");
    int studentNumber = input.nextInt();

    System.out.print("How many subject do they offer  : ");
    int subjectNumber = input.nextInt();
    
    int[][] scores = new int[studentNumber][subjectNumber];
    int [] subjectTotal = new int[studentNumber];
    double [] average = new double[studentNumber];

    
for(int count = 0; count < studentNumber; count++){
     int  TotalScores = 0;
     int number = count + 1;
     
  for(int index = 0; index < subjectNumber; index++){
    
    int subject = index + 1;
    System.out.println("Entering score for student " + number);
     System.out.print("Enter score for subject " + subject + " : ");
    
     int subjectScore = input.nextInt();
        if (subjectScore < 0 || subjectScore > 100) {
        System.out.println("Invalid input, Score must be between 1 and 100.");
        subjectScore = input.nextInt();
       
    }
     scores[count][index] = subjectScore;
        
     TotalScores += scores[count][index];
     
    }
     subjectTotal[count] = TotalScores;
     average[count] = (double) TotalScores / subjectNumber;
}

   System.out.print(Arrays.deepToString(scores));
   System.out.println( Arrays.toString(subjectTotal) + "total");
   System.out.println( Arrays.toString(average));
   
   int swap = 0;
   int [] sortedTotal = new int[studentNumber];



  for(int index = 0; index < subjectTotal.length; index++){
    sortedTotal[index] = subjectTotal[index];
        
    }


   
   for(int count = 0; count < sortedTotal.length; count++){
        for(int index = count + 1; index < sortedTotal.length; index++){
            if(sortedTotal[index] > sortedTotal[count]){
            swap = sortedTotal[count];
            sortedTotal[count] = sortedTotal[index];
            sortedTotal[index] = swap;
        }
    }
}

System.out.println(Arrays.toString(sortedTotal) + "Sorted Total");

    int [] position = new int[studentNumber];
    
  for(int count = 0; count < sortedTotal.length; count++){
        for(int index = 0; index < subjectTotal.length; index++){
            if(sortedTotal[count] == subjectTotal[index] ){
            position[index] = count+1;
            

       }
    }
}
System.out.println(Arrays.toString(subjectTotal) + "total array ");
System.out.println(Arrays.toString(position) + "position array ");


System.out.println("================================================================================================");
System.out.printf("%-12s", "STUDENT");

for (int count = 1; count <= subjectNumber; count++) {
    System.out.printf("%6s", "SUB" + count);
}

System.out.printf("%8s %10s %10s%n", "TOTAL", "AVERAGE", "POSITION");
System.out.println("================================================================================================");



for (int index = 0; index < studentNumber; index++) {
    int number = index + 1;

    System.out.printf("%-12s", "Student " + number);

    for (int count = 0; count < subjectNumber; count++) {
        System.out.printf("%6d", scores[index][count]);
    }

System.out.printf("%8d %10.1f %10d%n", subjectTotal[index],average[index],position[index]);
       
       
        
        
   
}



System.out.println("");
System.out.println("================================================================================================ ");

System.out.println("================================================================================================ ");

    
        


//    int highestScore = 0;
//    int lowestScore = 0;
//
//   for (int count = 0; count < studentNumber; count++) {
//       for (int index = 0; index < subjectNumber; index++) {
//            if(studentNumber[count] > subjectNumber[index]){
//
//



    }
}






