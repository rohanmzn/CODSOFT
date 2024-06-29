package NumberGame;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    static int resultNum;
    static int tries, winCount = 0, lossCount = 0;

    static void game(int userNum, Scanner sc) {
        if (userNum == resultNum) {
            System.out.println("You have correctly guessed the number: " + userNum);
            winCount++;
            winLoss();
        } else if (tries == 1) {
            System.out.println("\nThe correct number was " + resultNum);
            lossCount++;
            winLoss();
        } else {
            int num;
            tries--;

            if (Math.abs(userNum - resultNum) <= 5) {
                System.out.println("***Your guess is CLOSE to the answer***");
            } else if (resultNum + 25 < userNum) {
                System.out.println("***Your guess is incorrect (TOO HIGH)***");
            } else if (resultNum - 25 > userNum) {
                System.out.println("***Your guess is incorrect (TOO LOW)***");
            } else {
                System.out.println("***Your guess is incorrect***");
            }
            
            do {
                System.out.println("Tries left: " + tries);
                System.out.println();
                System.out.print("Guess another number within 1-100: ");
                num = sc.nextInt();
            } while (num < 1 || num > 100);
            
            game(num, sc);
        }
    }

    static void winLoss() {
        System.out.println("*************");
        System.out.println("Win    :   " + winCount);
        System.out.println("Loss   :   " + lossCount);
        System.out.println("*************\n");
    }
    
    static void playGame(Scanner sc) {
        int num;
        do {
            System.out.print("Enter a number from 1-100: ");
            num = sc.nextInt();
        } while (num < 1 || num > 100);

        Random random = new Random();
        resultNum = random.nextInt(100) + 1;

        game(num, sc);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char playAgain;
        do {
            tries = 10;
            playGame(sc);
            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = sc.next().charAt(0);
            System.out.println();

        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("******Thanks for playing!******");
        sc.close();
    }
}
