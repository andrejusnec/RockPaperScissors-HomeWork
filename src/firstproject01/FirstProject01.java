package firstproject01;

import java.util.Scanner;

public class FirstProject01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rock Paper Scissors Game");
        int playerChoise;
        double pcChoise;
        int pcWin = 0;
        int playerWin = 0;
        int tie = 0;
        int playerRock = 0;
        int playerScissors = 0;
        int playerPaper = 0;
        int pcRock = 0;
        int pcScissors = 0;
        int pcPaper = 0;
        int total = 0;
        do {
            System.out.println("1.Rock");
            System.out.println("2.Scissors");
            System.out.println("3.Paper");
            System.out.println("0.End");
            playerChoise = sc.nextInt();
            pcChoise = Math.random();
            switch (playerChoise) {
                case 1: {
                    playerRock += 1;
                    total += 1;
                    System.out.println("Player Choise: Rock");
                    if (pcChoise < 0.33f) {
                        System.out.println("PC Choise: Rock");
                        System.out.println("Tie");
                        tie += 1;
                        pcRock += 1;
                    } else if ((0.33f < pcChoise) && (pcChoise < 0.66f)) {
                        System.out.println("PC Choise: Scissors");
                        System.out.println("PC Loose, You Win");
                        playerWin += 1;
                        pcScissors += 1;
                    } else {
                        System.out.println("PC Choise: Paper");
                        System.out.println("You Loose, PC win");
                        pcWin += 1;
                        pcPaper += 1;
                    }
                    break;
                }
                case 2: {
                    System.out.println("Player Choise: Scissors");
                    playerScissors += 1;
                    total += 1;
                    if (pcChoise < 0.33f) {
                        System.out.println("PC Choise: Rock");
                        System.out.println("You Loose, PC win");
                        pcWin += 1;
                        pcRock += 1;
                    } else if ((0.33f < pcChoise) && (pcChoise < 0.66f)) {
                        System.out.println("PC Choise: Scissors");
                        System.out.println("Tie");
                        tie += 1;
                        pcScissors += 1;
                    } else {
                        System.out.println("PC Choise: Paper");
                        System.out.println("PC Loose, You win");
                        playerWin += 1;
                        pcPaper += 1;
                    }
                    break;
                }
                case 3: {
                    System.out.println("Player Choise: Paper");
                    playerPaper += 1;
                    total += 1;
                    if (pcChoise < 0.33f) {
                        System.out.println("PC Choise: Rock");
                        System.out.println("PC loose, You win");
                        playerWin += 1;
                        pcRock += 1;
                    } else if ((0.33f < pcChoise) && (pcChoise < 0.66f)) {
                        System.out.println("PC Choise: Scissors");
                        System.out.println("You Loose, PC win");
                        pcWin += 1;
                        pcScissors += 1;
                    } else {
                        System.out.println("PC Choise: Paper");
                        System.out.println("Tie");
                        tie += 1;
                        pcPaper += 1;
                    }
                    break;
                }
                case 0: {
                    System.out.println("The Game has been aborted");
                    if (total > 0) {
                        System.out.println("*********Game Stats**********");
                        System.out.println("Games played: " + total);
                        System.out.println("Player Win's: " + playerWin);
                        System.out.println("PC Win's: " + pcWin);
                        System.out.println("Tie's: " + tie);
                        System.out.println("*********Player Stats**********");
                        System.out.println("Player choosed Rock: " + playerRock + " times. " + (playerRock * 100 / total) + "%");
                        System.out.println("Player choosed Scissors: " + playerScissors + " times. " + (playerScissors * 100 / total) + "%");
                        System.out.println("Player choosed Paper: " + playerPaper + " times. " + (playerPaper * 100 / total) + "%");
                        System.out.println("*********PC Stats**********");
                        System.out.println("PC choosed Rock: " + pcRock + " times. " + (pcRock * 100 / total) + "%");
                        System.out.println("PC choosed Scissors: " + pcScissors + " times. " + (pcScissors * 100 / total) + "%");
                        System.out.println("PC choosed Paper: " + pcPaper + " times. " + (pcPaper * 100 / total) + "%");
                    }
                    break;
                }
                default: {
                    System.out.println("You have entered wrong number. Please try again");
                    break;
                }

            }

        } while (playerChoise
                != 0);

    }

}
