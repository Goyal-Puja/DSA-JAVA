package design_snake_ladder_game;

import java.util.Random;

public class Dice {        // simulates a six-sided dice roll
    public int roll(){
        Random random = new Random();
        return random.nextInt(6)+1;  // return the random no between 1 and 6
    }
}
