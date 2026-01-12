public class ArrayKata {

    // 1. Maximum in array
    public static int maximumIn(int[] numbers) {
        int max = numbers[0];
        for (int count = 1; count < numbers.length; count++) {
            if (numbers[count] > max){
            max = numbers[count];
        }
    }
        return max;

    }

    // 2. Minimum in array

    public static int minimumIn(int[] numbers) {
        int min = numbers[0];
        for (int count = 1; count < numbers.length; i++) {
            if (numbers[count] < min){
                 min = numbers[count];
    }
        }
        return min;
    }

    // 3. Sum of all elements

    public static int sumOf(int[] numbers) {
        int sum = 0;
        for (int count = 0; count < numbers.length; count++){
         sum += numbers[count];
    }
        return sum;
    }

    // 4. Sum of even numbers

    public static int sumOfEvenNumbersIn(int[] numbers) {
        int sum = 0;
        for (int count = 0; count < numbers.length; count++) {
            if (numbers[count] % 2 == 0){
                 sum += numbers[count];
        }
        }
        return sum;
    }

    // 5. Sum of odd numbers
    
    public static int sumOfOddNumbers(int[] numbers) {
        int sum = 0;
        for (int count = 0; count < number.length; count++) {
            if (numbers[count] % 2 == 1){
                 sum += numbers[count];
        }
        }
        return sum;
    }

    // 6. Maximum and minimum in array

    public static int[] maximumAndMinimum(int[] numbers) {
        int max = numbers[0],
        int min = numbers[0];
        for (int count = 1; count < numbers.length; count++) {
            if (numbera[count] > max){
            max = numbers[count];
            }
            if (numbers[count] < min){
             min = arr[count];
        }
        }
        return new int[]{min, max};
    }

   

    
