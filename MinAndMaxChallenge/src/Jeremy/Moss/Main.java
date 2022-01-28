package Jeremy.Moss;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNumber = 0;
        int maxNumber = 0;
        boolean first = true;
        while (true) {
            System.out.println("Enter Number:");
            boolean isInt = scanner.hasNextInt();
            if (!isInt) {
                System.out.println("Min number is: " + minNumber + "\nMax Number is: " + maxNumber);
                break;
            }
            int number = Integer.parseInt(scanner.nextLine());
            if (first){
                maxNumber = number;
                minNumber = number;
                first = false;
            }
            if (number > maxNumber) {
                maxNumber = number;
            }
            if (number < minNumber) {
                minNumber = number;
            }
        }
        scanner.close();
    }
}
