public class KataTask{


public static boolean even(int number){

    if(number % 2 == 0){
    return true;
    }
    else{
    return false;
     }
    }
  


public static boolean primeNumber(int number){ 
 if(number % number == 0){
    return true;
    }
    else{
    return false;
        }
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

