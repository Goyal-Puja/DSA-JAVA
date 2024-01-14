package design_snake_ladder_game;

public class Board{                        // Board class contains the information about
    private static final int SIZE = 100;   // the size of the board
    private int[] snakes;
    private int[] ladders;

    public Board(){
        snakes = new int[]{16, 47,49,56,62,64,87,93,95,98}; // position of snakes
        ladders = new int[]{1, 4, 9, 21, 28,36,51,71,80}; // position of ladders
    }

    public int getSize(){
        return SIZE;
    }

    public boolean isSnake(int position){  // check if there is a snake at given position
        for(int snake : snakes){
            if(position == snake){
                return true;
            }
        }
        return false;
    }

    public boolean isLadder(int position){ // check if there is a ladder in a given position
        for(int ladder : ladders){
            if(position == ladder){
                return true;
            }
        }
        return false;
    }

    public int getSnakeTail(int position){ // gets the tails position if there is a snake
        for(int snake : snakes){
            if(position == snake){
                return position-10;
            }
        }
        return position;
    }

    public int getLadderTop(int position){ // gets the top position if there is a ladder
        for(int ladder : ladders){
            if(position == ladder){
                return position+10;
            }
        }
        return position;
    }
}
