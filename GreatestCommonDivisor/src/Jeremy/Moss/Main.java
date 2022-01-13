package Jeremy.Moss;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(65, 78));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int largestNumber;
        if (first > second) {
            largestNumber = first;
        } else if (first == second) {
            return first;
        }
        else {
            largestNumber = second;
        }
        for (int i = largestNumber; i >= 0; i--) {
            if (first % i == 0 && second % i == 0) {
                return i;
            }
        }
        return -1;
    }
}
