public class BinaryNumber{
    public static void main(String...args){

        String result = " ";
        int number = 20;
        int baseNumber = 2;
        int finalBase = 5;

        int convertNumber = Integer.parseInt(convertNumber(number, baseNumber));
        System.out.println(convertNumber);
}


public static String convertNumber(int number, int baseNumber){
      String result = "";

      while (number > 0) {
          result = (number % baseNumber) + result;
          number = number / baseNumber;
            }

      return result;
    }
}


    












 






