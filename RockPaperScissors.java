package rockpaperscissors;

import java.util.*;

/**
 *
 * @author kamve
 */
public class RockPaperScissors {

    public static void main(String[] args) throws InterruptedException {
        boolean startGame = true;

        String[] ply = {"Rock", "Paper", "Scissors"};

        Scanner myObj = new Scanner(System.in);
        Random random = new Random();

        while (startGame) {

            System.out.println("Play : Rock/Paper/Scissors");
            String myPlay = myObj.nextLine().toLowerCase();

            String comPlay = ply[random.nextInt(ply.length)];
            System.out.println("Computer Plays :" + comPlay);
            
            Thread.sleep(1000);
            
            if (!myPlay.equalsIgnoreCase("Rock") && !myPlay.equalsIgnoreCase("Paper") && !myPlay.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid input. Please enter Rock, Paper, or Scissors.");
                continue;
            }
            
            Thread.sleep(500);
            
            switch (myPlay) {
                case "rock":
                    if (comPlay.equalsIgnoreCase("Rock")) {
                        System.out.println("It's a tie");
                    } else if (comPlay.equalsIgnoreCase("Paper")) {
                        System.out.println("You Lost!");
                    } else {
                        System.out.println("You WON!!");
                    }
                    break;

                case "paper":
                    if (comPlay.equalsIgnoreCase("Paper")) {
                        System.out.println("It's a tie");
                    } else if (comPlay.equalsIgnoreCase("Scissors")) {
                        System.out.println("You Lost!");
                    } else {
                        System.out.println("You WON!!");
                    }
                    break;

                case "scissors":
                    if (comPlay.equalsIgnoreCase("Scissors")) {
                        System.out.println("It's a tie");
                    } else if (comPlay.equalsIgnoreCase("Rock")) {
                        System.out.println("You Lost!");
                    } else {
                        System.out.println("You WON!!");
                    }
                    break;

            }

            Thread.sleep(1000);
            System.out.println("Do you want to play another round? (yes/no)");
            String response = myObj.nextLine();

            // Check if the user wants to continue
            if (!response.equalsIgnoreCase("yes")) {
                startGame = false;
                System.out.println("Goodbye!");
            }
        }
        myObj.close();
    }
}
