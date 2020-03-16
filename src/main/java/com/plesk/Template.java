package com.plesk;

public class Tennis {

    public String calculateScore(int player1, int player2) {

        //if ()

        if ((player1 == 0) && (player2 == 0)) {
            return "love";
        }

        if ((player1 == 1) && (player2 == 0)) {
            return "player1: fifteen";
        }


        if ((player1 == 2) && (player2 == 0)) {
            return "player1: thirty";
        }

        if ((player1 == 3) && (player2 == 0)) {
            return "player1: forty";
        }

        if (((player1 >= 3) && (player2 >= 3)) && ((player1 == player2))) {
            return "deuce";
        }

        if (((player1 >= 3) && (player2 >= 3)) && ((player1 % player2 == 1))) {
            return "player1: advantage";
        }

//        if (((player1 >= 3) && (player2 >= 3)) && ((player2 % player1 == 1))) {
//            return "player2: advantage";
//        }

        return "error";
    }

}
