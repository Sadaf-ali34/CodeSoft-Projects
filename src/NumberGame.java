import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class NumberGame {
    public static void main(String[] args) {
        int lowerLimit =0;
        int upperLimit = 100;
        int maxTries = 5;

        Random randomNumber = new Random();
        int targetNumber = randomNumber.nextInt(lowerLimit ,upperLimit+1 );
        System.out.println("Guess the Number between" + lowerLimit + " and " + upperLimit);

        Scanner scanner = new Scanner(System.in);
        int guessedNumber;
        int counter = 0;
            do{
            guessedNumber = scanner.nextInt();
            counter++;
            if(guessedNumber > targetNumber){
                System.out.println("Your Guess is Incorrect! try again and guess a lower number");
            } else if(guessedNumber < targetNumber){
                System.out.println("guess higer");
            }
            } while (guessedNumber != targetNumber && counter <= maxTries);
        if (guessedNumber == targetNumber) {
            System.out.println("Your answer is Correct, and it took you " + counter + " tries.");
        } else {
            System.out.println("You have exceeded the maximum number of tries. The correct answer was " + targetNumber);
        }
    }

}





