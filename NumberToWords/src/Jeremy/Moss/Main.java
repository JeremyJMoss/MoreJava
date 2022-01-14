package Jeremy.Moss;

public class Main {

    public static void main(String[] args) {
        numberToWords(00001);
    }

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }
        else if (number == 0){
            System.out.println("Zero");
        }
        int times = 0;
        int reversedNumber = reverse(number);
        if (getDigitCount(reversedNumber) != getDigitCount(number)){
            times = getDigitCount(number) - getDigitCount(reversedNumber);
        }
        number = reversedNumber;
        while (number > 0){
            int numberToConvert = number % 10;
            switch (numberToConvert){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            number /= 10;
        }
        for (int i = 0; i < times; i++){
            System.out.println("Zero");
        }
    }

    public static int reverse(int number){
        boolean negative = false;
        if (number < 0){
            number -= number * 2;
            negative = true;
        }
        int reverse = 0;
        while (number > 0){
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        if (negative){
            return reverse - reverse * 2;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        }
        else if (number == 0){
            return 1;
        }
        int count = 0;
        while(number > 0){
            number /= 10;
            count++;
        }
        return count;
    }
}
