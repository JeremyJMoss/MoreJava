package Jeremy.Moss;

public class Main {

    public static void main(String[] args) {
        printPerfectNumbers(1000);
    }

    public static boolean isPerfectNumber(int number){
        if (number < 1){
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++){
            if (number % i == 0){
                sum += i;
            }
        }
        if (sum == number){
            return true;
        }
        return false;
    }

    public static void printPerfectNumbers(int range){
        if (range < 0){
            System.out.println("Invalid Value");
        }
        for (int i=0; i <= range; i++){
            if (isPerfectNumber(i)){
                System.out.println(i);
            }
        }
    }
}
