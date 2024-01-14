package design_snake_ladder_game;

public class Main {
    public static void main(String[] args){
        String[] playerNames = {"Player1","Player2"};
        SnakeAndLadderGame game = new SnakeAndLadderGame(playerNames);
        game.playGame();

    }
}
