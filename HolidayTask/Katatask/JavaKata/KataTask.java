public class KataTask{
    public static void main(String...args){
int number = 4;
boolean evenNum = (even(number));
System.out.println(evenNum);
boolean primeNumber = (primeNumber(number));
int number = 5;
System.out.println(primeNumber);


}
    public static boolean even(int number){

    if(number % 2 == 0){
    return true;
    }
    else{
    return false;
            }
        }
    }

  


 public static boolean primeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        for (int count = 2; count * count <= number; count++) {
            if (number % count == 0) {
                return false;
            }
        }
        return true;
    }



public static float divide(int firstNumber, int secondNumber){
    if (secondNumber == 0){
    return 0;
    }
    else{
    float result = firstNumber/secondNumber;
    return result;
                }

    
    }



    public static float square(int number){
    int result = number * number;
     return result;
    }



    public static boolean squareBoolean(int number){
    int result = number * number;
    if(result %  number == number){
    return true;
    }
    else{
    return false;
    }

    }


public static int subtract(int firstNumber, int secondNumber){
    int result = Math.abs(firstNumber - secondNumber);
    return result;

    }

   

}

