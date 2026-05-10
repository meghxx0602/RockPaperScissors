import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorGame {
    public static void main(String[] args) {
        System.out.println("Enter your choice 1,2,or 3:\n1.ROCK\n2.PAPER\n3.SCISSORS");

        // Scanner Class Object
        Scanner sc = new Scanner(System.in);
        int user_choice;
        try {
            user_choice = sc.nextInt();
            }
        catch (Exception e)
            {
                System.out.println("Invalid input!\nPlease enter only 1, 2, or 3.");
                return;
            }

            // Random Class Object, for computer to choose any number at random.
            Random rando = new Random();
            int comp_choice = rando.nextInt(3) + 1;

            System.out.println("Your choice is: " + user_choice);
            System.out.println("Computer's choice is: " + comp_choice);

            // If - Else Ladder
            if (user_choice == comp_choice)
            {
                System.out.println("It's a draw!!");
            }
            else if ((user_choice == 1 && comp_choice == 3) ||
                    (user_choice == 2 && comp_choice == 1) ||
                    (user_choice == 3 && comp_choice == 2))
            {
                System.out.println("You win!!!\nCongratulations.");
            }
            else
            {
                System.out.println("Computer wins!\nBetter luck next time.");
            }
    }
}