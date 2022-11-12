import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Chose your game mode Easy/Medium/Hard: ");
        String gameMode = s.nextLine();

        if (gameMode.equals("Easy")) {
            System.out.println("Range of number is 10");
            System.out.print("Enter your guess: ");
            System.out.println("You have ");
            int playerGuess = s.nextInt();
            int randomNum = (int)((Math.random() * 10) + 1);
            if(playerGuess != randomNum) {
                // if the player guessed too low
                if(playerGuess < randomNum) {
                    System.out.println("You were off by " + (randomNum - playerGuess));
                } // end inner if statement
                // if the player didn't guess too low (meaning, incorrect and too high!)
                else {
                    System.out.println("You were off by " + (playerGuess - randomNum));
                } // end inner else statement
            } // end outer if statement
            // if the player didn't guess incorrectly (meaning, correct guess)
            else {
                System.out.println("Correct!!!");
            } // end outer else statement

        } else if (gameMode.equals("Medium")) {
            System.out.println("Range of number is 50");
            System.out.print("Enter your guess: ");
            int randomNum = (int)((Math.random() * 50) + 1);
            int playerGuess = s.nextInt();
            if(playerGuess != randomNum) {
                // if the player guessed too low
                if(playerGuess < randomNum) {
                    System.out.println("You were off by " + (randomNum - playerGuess));
                } // end inner if statement
                // if the player didn't guess too low (meaning, incorrect and too high!)
                else {
                    System.out.println("You were off by " + (playerGuess - randomNum));
                } // end inner else statement
            } // end outer if statement
            // if the player didn't guess incorrectly (meaning, correct guess)
            else {
                System.out.println("Correct!!!");
            } // end outer else statement

        } else if (gameMode.equals("Hard")) {
            System.out.println("Range of number is 100");
            System.out.print("Enter your guess: ");
            int randomNum = (int)((Math.random() * 100) + 1);
            int playerGuess = s.nextInt();
            if(playerGuess != randomNum) {
                // if the player guessed too low
                if(playerGuess < randomNum) {
                    System.out.println("You were off by " + (randomNum - playerGuess));
                } // end inner if statement
                // if the player didn't guess too low (meaning, incorrect and too high!)
                else {
                    System.out.println("You were off by " + (playerGuess - randomNum));
                } // end inner else statement
            } // end outer if statement
            // if the player didn't guess incorrectly (meaning, correct guess)
            else {
                System.out.println("Correct!!!");
            } // end outer else statement

        } else {
            System.out.println("Chose game mode again");
        }
    } // end main method
} // end class