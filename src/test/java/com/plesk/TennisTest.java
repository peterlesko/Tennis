package com.plesk;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TennisTest {

    Tennis tennis;

    @BeforeEach
    void init(){
        tennis = new Tennis();
    }

    @Nested
    @DisplayName("Zero to forty score")
    class zeroToForty {

        @Test
        void testTennis_0_0_Love() {
            String expected = "love";
            int player1 = 0;
            int player2 = 0;

            String actual = tennis.calculateScore(player1, player2);

            assertEquals(expected, actual);
        }

        @Test
        void testTennis_1_0_fifteen() {
            String expected = "player1: fifteen";
            int player1 = 1;
            int player2 = 0;

            String actual = tennis.calculateScore(player1, player2);

            assertEquals(expected, actual);
        }

        @Test
        void testTennis_2_0_thirty() {
            String expected = "player1: thirty";
            int player1 = 2;
            int player2 = 0;

            String actual = tennis.calculateScore(player1, player2);

            assertEquals(expected, actual);
        }

        @Test
        void testTennis_3_0_forty() {
            String expected = "player1: forty";
            int player1 = 3;
            int player2 = 0;

            String actual = tennis.calculateScore(player1, player2);

            assertEquals(expected, actual);
        }
    }


    @Nested
    @DisplayName("Deuce score")
    class DeuceScore {

        @Test
        void testTennis_3_3_deuce () {
            String expected = "deuce";
            int player1 = 3;
            int player2 = 3;

            String actual = tennis.calculateScore(player1, player2);

            assertEquals(expected, actual, "Deuce");
        }

        @Test
        void testTennis_5_5_deuce () {
            String expected = "deuce";
            int player1 = 5;
            int player2 = 5;

            String actual = tennis.calculateScore(player1, player2);

            assertEquals(expected, actual, "Deuce");
        }
    }


    @Nested
    @DisplayName("Advantage score")
    class AdvantageScore {

        @Test
        void testTennis_3_4_deuce () {
            String expected = "player1: advantage";
            int player1 = 4;
            int player2 = 3;

            String actual = tennis.calculateScore(player1, player2);

            assertEquals(expected, actual, "advantage");
        }
    }


    @Nested
    @DisplayName("Win score")
    class Win {

//        @Test
//        void testTennis_3_4_deuce () {
//            String expected = "deuce";
//            int player1 = 3;
//            int player2 = 4;
//
//            String actual = tennis.calculateScore(player1, player2);
//
//            assertEquals(expected, actual, "advantage");
//        }
    }

}


/*

You task is to implement a tennis scoring program.
Summary of tennis scoring:

1. A game is won by the first player to have won at
   least four points in total and at least two points
   more than the opponent.

2. The running score of each game is described in a
   manner peculiar to tennis: scores from zero to three
   points are described as "love", "fifteen", "thirty",
   and "forty" respectively.

3. If at least three points have been scored by each
   player, and the scores are equal, the score is "deuce".

4. If at least three points have been scored by each
   side and a player has one more point than his opponent,
   the score of the game is "advantage" for the player
   in the lead.

 */
