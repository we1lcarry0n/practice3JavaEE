public class GameMaster implements Player {

    private final int diceAmount;
    public GameMaster(){
        this(6);
    }

    public GameMaster(int diceAmount){
        this.diceAmount = diceAmount;
    }

    public void rollTheDice(){
        System.out.println("Randomroll : " + diceAmount + " dice");
    }
}
