import java.util.Scanner;

public class MazeRunner {
    public static Maze myMap = new Maze();

    public static void main(String[] args)  {
        intro();

        String move = "";
        int numMoves = 0;

        while (!myMap.didIWin()) {
            move = userMove();
            numMoves++;
            movesMessage(numMoves);
            myMap.printMap();

            if (numMoves >= 100) {
                System.out.println("Sorry, but you didn't escape in time - you lose!");
                break;
            }
        }

        if (myMap.didIWin()) {
            System.out.println("Congratulations, you made it out alive!");
            System.out.println("You did it in " + numMoves + " moves");
        }

    }


    public static void intro() {
        /*
        Method that welcomes the user to Maze Runner and shows them the current state of the Maze
         */
        System.out.println("Welcome to Maze Runner!");
        System.out.println("Here is your current position:");
        myMap.printMap();
    }

    public static String userMove()   {
        /*
        Method that offers the user a way to enter the direction they way to move: (R)ight, (L)eft, (U)p or (D)own.

        returns:    string of user-specified direction to move

         */
        Scanner input = new Scanner(System.in);
        String move = "";
        System.out.print("Where would you like to move? (R, L, U, D) ");
        move = input.next();
        while (!move.equals("R") && !move.equals("L") && !move.equals("U") && !move.equals("D"))    {
            System.out.println("You did not input a valid direction. Please try again.");
            System.out.print("Where would you like to move? (R, L, U, D) ");
            move = input.next();
        }

        if (move.equals("R")) {
            if (myMap.canIMoveRight())   {
                myMap.moveRight();
            }
            else if (myMap.isThereAPit("R")) {
                boolean didTheyJump = navigatePit("R");
                if (!didTheyJump) {
                    System.out.println("You have chosen not to jump. Here is where you are: ");
                    }
            }
            else {
                System.out.println("Sorry, you've hit a wall.");
            }
        }

        else if (move.equals("L")) {
            if (myMap.canIMoveLeft())   {
                myMap.moveLeft();
            }
            else if (myMap.isThereAPit("L")) {
                boolean didTheyJump = navigatePit("L");
                if (!didTheyJump) {
                    System.out.println("You have chosen not to jump. Here is where you are: ");
                    }
            }
            else {
                System.out.println("Sorry, you've hit a wall.");
            }
        }

        else if (move.equals("U")) {
            if (myMap.canIMoveUp())   {
                myMap.moveUp();
            }
            else if (myMap.isThereAPit("U")) {
                boolean didTheyJump = navigatePit("U");
                if (!didTheyJump) {
                    System.out.println("You have chosen not to jump. Here is where you are: ");
                    }
            }
            else {
                System.out.println("Sorry, you've hit a wall.");
            }
        }

        else if (move.equals("D")) {
            if (myMap.canIMoveDown())   {
                myMap.moveDown();
            }
            else if (myMap.isThereAPit("D")) {
                boolean didTheyJump = navigatePit("D");
                if (!didTheyJump) {
                    System.out.println("You have chosen not to jump. Here is where you are: ");
                    }
            }
            else {
                System.out.println("Sorry, you've hit a wall.");
            }
        }

        return move;
    }

    public static void movesMessage(int moves)  {
        /*
        Method that takes an int representing the user's current number of moves and produces messages when the user
        hits certain milestones.

        paramters:  moves (int)     number of moves by the user so far
         */

        if (moves == 100) {
            System.out.println("Oh no! You took too long to escape, and now the maze exit is closed FOREVER >:[");
        } else if (moves == 90) {
            System.out.println("DANGER! You have made 90 moves, you only have 10 moves left to escape!!");
        } else if (moves == 75) {
            System.out.println("Alert! You have made 75 moves, you only have 25 moves left to escape.");
        } else if (moves == 50) {
            System.out.println("Warning: You have made 50 moves, you have 50 remaining before the maze exit closes");
        }

    }

    public static boolean navigatePit(String move) {
        /*
        When a pit is detected, this method asks the used what to do next.

        param:   move   direction of user movement (string)
        return:         if the user effectively jumped over the pit (boolean)
         */
            Scanner input = new Scanner(System.in);
        System.out.print("Watch out! There's a pit ahead, jump it? ");
        String jump = input.next();

        if (jump.toLowerCase().startsWith("y")) {
            myMap.jumpOverPit(move);
            return true;
        }
        else { return false; }

    }
}
