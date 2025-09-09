//package rockpaperscissors;

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

        int wins = 0;
        int losses = 0;
        int ties = 0;
        String results = "";

        while (startGame) {

        

            System.out.println("Play : Rock/Paper/Scissors");
            String myPlay = myObj.nextLine().toLowerCase();

            String comPlay = ply[random.nextInt(ply.length)];
            
            Thread.sleep(1000);
            
            if (!myPlay.equalsIgnoreCase("Rock") && !myPlay.equalsIgnoreCase("Paper") && !myPlay.equalsIgnoreCase("Scissors")) {
                System.err.println("Invalid input. Please enter Rock, Paper, or Scissors.");
                continue;
            }else{
                System.out.println("Computer Plays :" + comPlay);
            }
            
            Thread.sleep(500);

            /*
            if(myPlay == "rock"){
                if (comPlay.equalsIgnoreCase("Rock")) {
                        results = "It's a tie";
                        System.out.println(results);
                    } else if (comPlay.equalsIgnoreCase("Paper")) {
                        results = "You Lost!";
                        System.out.println(results);
                    } else {
                        results = "You WON!!"; 
                        System.out.println(results);
                    }

            }else if(myPlay == "paper"){
                if (comPlay.equalsIgnoreCase("Paper")) {
                        results = "It's a tie";
                        System.out.println(results);
                    } else if (comPlay.equalsIgnoreCase("Scissors")) {
                        results = "You Lost!";
                        System.out.println(results);
                    } else {
                        results = "You WON!!"; 
                        System.out.println(results);
                    }
            }
            else if(myPlay== "scissors"){
                if (comPlay.equalsIgnoreCase("Scissors")) {
                        results = "It's a tie";
                        System.out.println(results);
                    } else if (comPlay.equalsIgnoreCase("Rock")) {
                        results = "You Lost!";
                        System.out.println(results);
                    } else {
                        results = "You WON!!"; 
                        System.out.println(results);
                    }
            } */

            
            switch (myPlay) {
                case "rock":
                    if (comPlay.equalsIgnoreCase("Rock")) {
                        results = "It's a tie";
                        System.out.println(results + new String(Character.toChars(0x1F91D)));
                    } else if (comPlay.equalsIgnoreCase("Paper")) {
                        results = "You Lost!";
                        System.out.println(results + new String(Character.toChars(0x1F641)));
                    } else {
                        results = "You WON!!"; 
                        System.out.println(results + new String(Character.toChars(0x1F60A)));
                    }
                    break;

                case "paper":
                    if (comPlay.equalsIgnoreCase("Paper")) {
                        results = "It's a tie";
                        System.out.println(results + new String(Character.toChars(0x1F91D)));
                    } else if (comPlay.equalsIgnoreCase("Scissors")) {
                        results = "You Lost!";
                        System.out.println(results + new String(Character.toChars(0x1F641)));
                    } else {
                        results = "You WON!!"; 
                        System.out.println(results + new String(Character.toChars(0x1F60A)));
                    }
                    break;

                case "scissors":
                    if (comPlay.equalsIgnoreCase("Scissors")) {
                        results = "It's a tie";
                        System.out.println(results + new String(Character.toChars(0x1F91D)));
                    } else if (comPlay.equalsIgnoreCase("Rock")) {
                        results = "You Lost!";
                        System.out.println(results + new String(Character.toChars(0x1F641)));
                    } else {
                        results = "You WON!!"; 
                        System.out.println(results + new String(Character.toChars(0x1F60A)));
                    }
                    break;       
                
            }
            

            if(results == "You WON!!"){
                wins += 1;
            }else if(results == "You Lost!"){
                losses += 1;
            }else if(results == "It's a tie"){
                ties += 1;
            }
            
            System.out.println("SCORE: Wins: " + wins + ", Losses: " + losses + ", Ties: " + ties);

            

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
