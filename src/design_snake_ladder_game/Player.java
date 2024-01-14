package design_snake_ladder_game;

public class Player {  // represent a player in a game
    private String name;  // player's name
    private int position; // player's current position

    public Player(String name){
        this.name = name;
        this.position = 0;
    }
    public String getName(){
        return name;
    }
    public int getPosition(){
        return position;
    }
    public void move(int steps){   // moves the player on the board by a specified number of steps
        position += steps;
    }
}
