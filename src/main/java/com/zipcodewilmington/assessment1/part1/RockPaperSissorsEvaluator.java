package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissors"; // changed to "scissors" for consistency

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {

        String winningMove = "";

        switch(handSign) {
            case "rock" :
                winningMove = "paper";
                break;
            case "paper" :
                winningMove = "scissors";
                break;
            case "scissors" :
                winningMove = "rock";
                break;
            default:
                winningMove = "The hand sign you entered is not correct";
        }

        return winningMove;
    }


    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {

        String losingMove = "";

        switch(handSign) {
            case "rock" :
                losingMove = "scissors";
                break;
            case "paper" :
                losingMove = "rock";
                break;
            case "scissor" :
                losingMove = "paper";
                break;
            default:
                losingMove = "The hand sign you entered is not correct";
        }

        return losingMove;
    }


    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {

        String winner = "";

        if ( (handSignOfPlayer1.equals("paper") && handSignOfPlayer2.equals("rock"))
                || (handSignOfPlayer1.equals("rock") && handSignOfPlayer2.equals("paper")) ) {
            winner = "paper";
        } else if ( (handSignOfPlayer1.equals("paper") && handSignOfPlayer2.equals("scissors"))
                || (handSignOfPlayer1.equals("scissors") && handSignOfPlayer2.equals("paper")) ) {
            winner = "scissors";
        } else if ( (handSignOfPlayer1.equals("rock") && handSignOfPlayer2.equals("scissors"))
                || (handSignOfPlayer1.equals("scissors") && handSignOfPlayer2.equals("rock")) ) {
            winner = "rock";
        }

        return winner;
    }
}
