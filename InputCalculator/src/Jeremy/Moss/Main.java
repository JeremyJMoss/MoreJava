package Jeremy.Moss;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0L;
        int counter = 0;
        boolean first = true;
        while (true){
            boolean hasNextInt = scanner.hasNextInt();
            if (!hasNextInt){
                if (first){
                    System.out.println("SUM = 0 AVG = 0");
                    break;
                }
                avg = Math.round((double) sum/counter);
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
            first = false;
            int number = Integer.parseInt(scanner.nextLine());
            counter++;
            sum += number;
        }
    }
}
