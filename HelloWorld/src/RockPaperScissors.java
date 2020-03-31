import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Does player one choose rock, paper or scissors? ");
        String playerOne = input.next();
        System.out.print("Does played two choose rock, paper or scissors? ");
        String playerTwo = input.next();
/*
        if ( (playerOne.equals("rock") && playerTwo.equals("scissors")) || (playerOne.equals("scissors") && playerTwo.equals("paper"))
        || (playerOne.equals("paper") && playerTwo.equals("rock"))) {
            System.out.println("Player 1 wins!");
        } else if ( (playerOne.equals("rock") && playerTwo.equals("paper")) || (playerOne.equals("scissors") && playerTwo.equals("rock"))
                || (playerOne.equals("paper") && playerTwo.equals("scissors"))) {
            System.out.println("Player 2 wins!");
        } else ( (playerOne.equals("rock") && playerTwo.equals("rock")) || (playerOne.equals("scissors") && playerTwo.equals("scissors"))
                || (playerOne.equals("paper") && playerTwo.equals("paper"))) {
            System.out.println("Player 2 wins!");
        }
    }
}
*/
    }
}