import java.util.*;

public class Main {

    public static void fizzBuzz(int n) {

        for(int i = 1 ; i <= n ; i++  ){

            int multipliesOfThree = i % 3;
            int multipliesOfFive = i % 5;

            if ( multipliesOfThree == 0 && multipliesOfFive == 0){
                System.out.println("FizzBuzz");
                continue;
            }if ( multipliesOfThree == 0){
                System.out.println("Fizz");
                continue;
            }if ( multipliesOfFive == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer for playing the FizzBuzz func: ");
        int n = input.nextInt();
        fizzBuzz(n);
    }
}
