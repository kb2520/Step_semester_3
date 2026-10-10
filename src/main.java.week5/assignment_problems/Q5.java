package main.java.week5.assignment_problems;

import java.util.Arrays;

class Player implements Comparable<Player> {

    private String name;
    private int matchesPlayed;
    private double battingAverage;
    private boolean injured;

    // Constructor
    public Player(String name, int matchesPlayed,
                  double battingAverage, boolean injured) {

        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    // Rule 1: Experience only
    static boolean isDraftable(int matchesPlayed) {

        return matchesPlayed >= 10;
    }

    // Rule 2: Matches + fitness
    static boolean isDraftable(int matchesPlayed,
                               boolean injured) {

        return matchesPlayed >= 5 && !injured;
    }

    // Fantasy score
    double getScore() {

        return battingAverage;
    }

    // Get name
    String getName() {

        return name;
    }

    // Used by Arrays.sort()
    public int compareTo(Player other) {

        return Double.compare(
                other.getScore(),
                this.getScore()
        );
    }
}

public class Q5
{

    static String draftAndRank(Player[] players) {

        Player[] draftable =
                new Player[players.length];

        int count = 0;

        // Find draftable players
        for (int i = 0; i < players.length; i++) {

            if (Player.isDraftable(players[i].matchesPlayed)
                    ||
                    Player.isDraftable(
                            players[i].matchesPlayed,
                            players[i].injured
                    )) {

                draftable[count] = players[i];
                count++;
            }
        }

        // Sort only the filled part of the array
        Arrays.sort(draftable, 0, count);

        // Create final result
        String result = "";

        for (int i = 0; i < count; i++) {

            result = result
                    + (i + 1)
                    + ". "
                    + draftable[i].getName();

            if (i < count - 1) {
                result = result + " | ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Player[] players = {

                new Player(
                        "Virat", 15, 48.0, false
                ),

                new Player(
                        "Rahul", 7, 55.0, false
                ),

                new Player(
                        "Sameer", 3, 60.0, false
                ),

                new Player(
                        "Dev", 12, 20.0, true
                )
        };

        System.out.println(
                draftAndRank(players)
        );
    }
}
