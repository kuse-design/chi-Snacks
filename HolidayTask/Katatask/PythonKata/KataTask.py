    
    def even(number):
        if number % 2 == 0:
            return True
        else:
            return False

    
    def primeNumber(number):
        if number % number == 0:
            return True
        else:
            return False

    
    def divide(firstNumber, secondNumber):
        if secondNumber == 0:
            return 0
        else:
            result = firstNumber / secondNumber
            return result

    
    def square(number):
        result = number * number
        return result

    
    def squareBoolean(number):
        result = number * number
        if result % number == number:
            return True
        else:
            return False

    
    def subtract(firstNumber, secondNumber):
        result = abs(firstNumber - secondNumber)
        return result

