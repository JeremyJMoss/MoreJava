package Jeremy.Moss;

public class Main {

    public static void main(String[] args) {
        printSquareStar(100);
    }

    public static void printSquareStar(int number){
        if (number < 5){
            System.out.println("Invalid Value");
        }
        else {
            for (int row = 1; row <= number; row++){
                String stars = "";
                for (int col = 1; col <= number; col++){
                    if (row == 1 || row == number){
                        stars += "*";
                    }
                    else if (col == 1 || col == number){
                        stars += "*";
                    }
                    else if (row == col){
                        stars += "*";
                    }
                    else if (col == number - row + 1){
                        stars += "*";
                    }
                    else{
                        stars += " ";
                    }
                }
                System.out.println(stars);
            }
        }
    }
}
