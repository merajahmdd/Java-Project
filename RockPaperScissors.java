import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors{
    public static void main(String[] args) {
        System.out.println("Welcome and Enjoy the Game");

        
        Scanner s = new Scanner(System.in);
        while(true){


            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            
            String playerMove;

            while(true){
                System.out.println("Please Enter Your Move(r, p, s): ");
                playerMove = s.nextLine();
                if(playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")){
                    break;
                }
                System.out.println(playerMove + " is Not a Valid Move.");
            }

            System.out.println("Computer's Move: " + computerMove);
            if(playerMove.equals(computerMove)){
                System.out.println("It's a Tie");
            }
            else if(playerMove.equals("r")){
                if(computerMove.equals("p")){
                    System.out.println("You Loose!");
                }
                else if(computerMove.equals("s")){
                    System.out.println("You Win!");
                }
            }

            else if(playerMove.equals("s")){
                if(computerMove.equals("r")){
                    System.out.println("You Loose!");
                }
                else if(computerMove.equals("p")){
                    System.out.println("You Win!");
                }
            }

            else if(playerMove.equals("p")){
                if(computerMove.equals("s")){
                    System.out.println("You Loose!");
                }
                else if(computerMove.equals("r")){
                    System.out.println("You Win!");
                }

            }

            System.out.println("Play Again..?(Y/N)");
            String playAgain = s.nextLine();

            if(playAgain.equals("N")){
                System.out.println("Thank You for Playing.");
                break;
            }

            
        }

        s.close();

    }
}