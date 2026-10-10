package main.java.week1.class_problems;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};

        int win = 0, loss = 0, draw = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Round " + i + " - Enter Rock/Paper/Scissors: ");
            String player = sc.nextLine();

            String computer = moves[r.nextInt(3)];

            System.out.println("Computer: " + computer);

            if (player.equalsIgnoreCase(computer)) {
                System.out.println("Draw");
                draw++;
            }
            else if ((player.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
                    (player.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
                    (player.equalsIgnoreCase("Scissors") && computer.equals("Paper"))) {
                System.out.println("Player Wins");
                win++;
            }
            else {
                System.out.println("Computer Wins");
                loss++;
            }

            System.out.println();
        }

        double percent = (win * 100.0) / 5;

        System.out.println("Final Result");
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + loss);
        System.out.println("Draws: " + draw);
        System.out.println("Win Percentage: " + percent + "%");

        sc.close();
    }
}
