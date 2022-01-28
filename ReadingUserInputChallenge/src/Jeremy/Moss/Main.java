package Jeremy.Moss;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;
        while (counter <= 10){
            System.out.println("Enter number #" + counter + ": ");
            try {
                int number = Integer.parseInt(scanner.nextLine());
                sum += number;
                counter++;
            }
            catch (Exception e){
                System.out.println("Please enter an integer");
            }
        }
        scanner.close();
        System.out.println("The sum of all numbers entered is : " + sum);
    }
}
