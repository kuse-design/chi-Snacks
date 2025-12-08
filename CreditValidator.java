import java.util.Scanner;

public class CreditValidator {

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, Kindly Enter details to verify: ");

        System.out.print("Credit Card Number: ");
        String cardDigit = input.nextLine();

        System.out.println("======================================================");

        String creditType = cardType(cardDigit);
        System.out.println("Credit Card Type: " + creditType);

        System.out.println("Credit Card Number: " + cardDigit);

        boolean length = cardNumberLength(cardDigit);
        System.out.println("Credit Card Length: " + cardDigit.length());

        String valid = validity(cardDigit);
        System.out.println("Credit Card Validity Status: " + valid);

        System.out.println("======================================================");
    }

    
    public static boolean cardNumberLength(String cardDigit) {
        return cardDigit.length() >= 13 && cardDigit.length() <= 16;
    }

    
    public static String cardType(String cardDigit) {

        if (cardDigit.charAt(0) == '4') {
            return "Visa Card";
        }
        else if (cardDigit.charAt(0) == '5') {
            return "Master Card";
        }
        else if (cardDigit.charAt(0) == '3' && cardDigit.charAt(1) == '7') {
            return "American Express Card";
        }
        else if (cardDigit.charAt(0) == '6') {
            return "Discover Card";
        }
        else {
            return "Unknown Card Type";
        }
    }

    
    public static int doubleSecondDigit(String cardDigit) {
        int sum = 0;

        for (int count = 1; count < cardDigit.length(); count += 2) {
            int digit = cardDigit.charAt(cardDigit.length() - 1 - count) - '0';
            int product = digit * 2;

            if (product > 9) {
                sum += (product / 10) + (product % 10);
            } else {
                sum += product;
            }
        }
        return sum;
    }

    
    public static int addOddDigitNumber(String cardDigit) {
        int add = 0;

        for (int count = 0; count < cardDigit.length(); count += 2) {
            int digit = cardDigit.charAt(cardDigit.length() - 1 - count) - '0';
            add += digit;
        }
        return add;
    }

    
    public static int addOddEvenNumber(String cardDigit) {
        int even = doubleSecondDigit(cardDigit);
        int odd = addOddDigitNumber(cardDigit);
        return even + odd;
    }

    
    public static String validity(String cardDigit) {
        int result = addOddEvenNumber(cardDigit);

        if (result % 10 == 0) {
            return "Valid";
        } else {
            return "Invalid";
        }
    }
}

