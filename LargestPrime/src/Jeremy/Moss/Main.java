package Jeremy.Moss;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
    }

    public static int getLargestPrime(int number){
        if (number < 2){
            return -1;
        }
        int largestPrimeFactor = 2;
        for (int i = 1; i <= number; i++){
            boolean isPrimeFactor = false;
            if (number % i == 0){
                for (int j = 2; j < i; j++){
                    isPrimeFactor = true;
                    if (i % j == 0){
                        isPrimeFactor = false;
                        break;
                    }
                }
                if (isPrimeFactor){
                    largestPrimeFactor = i;
                }
            }

        }
        return largestPrimeFactor;
    }
}
