package design_snake_ladder_game;

public class SnakeAndLadderGame {  // manages the overall game

    private Board board;
    private Player[] players;
    private Dice dice;
    private int currentPlayerIndex;

    public SnakeAndLadderGame(String[] playerNames){
        board = new Board();
        players = new Player[playerNames.length];
        for(int i=0;i<playerNames.length;i++){
            players[i] = new Player(playerNames[i]);
        }
        dice = new Dice();
        currentPlayerIndex = 0;
    }

    public void playTurn(){          // Simulates a turn for the current player
        Player currentPlayer = players[currentPlayerIndex];     // get the current player
        int diceRoll = dice.roll();   // roll the dice to get a random number between 1 and 6
        System.out.println(currentPlayer.getName() + " rolled a "+diceRoll);

        int newPosition = currentPlayer.getPosition() + diceRoll;  // calculate the new position by adding the dice roll to the current position
        if(newPosition > board.getSize()){
            System.out.println(currentPlayer.getName()+" stays at "+currentPlayer.getPosition());
        } else {
            if(board.isSnake(newPosition)){
                newPosition = board.getSnakeTail(newPosition);
                System.out.println("Oops! Snake at position"+newPosition);
            } else if(board.isLadder(newPosition)){
                newPosition = board.getLadderTop(newPosition);
                System.out.println("Yay! Ladder at position"+newPosition);
            }
            currentPlayer.move(newPosition-currentPlayer.getPosition());
            System.out.println(currentPlayer.getName()+" moves to "+newPosition);
        }
        if(currentPlayer.getPosition() == board.getSize()){
            System.out.println("Congratulation "+currentPlayer.getName()+ " Wins !!");
            System.exit(0);
        }
        currentPlayerIndex = (currentPlayerIndex+1) % players.length;
    }

    public void playGame(){   // continues the game until a player wins
        while (true){
            playTurn();
        }
    }
}
