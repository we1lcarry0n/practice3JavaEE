public class ExpieriencesGameMaster extends GameMaster {

    private Dice d20;
    public ExpieriencesGameMaster(Dice d20){
        super();
        this.d20 = d20;
    }

    public ExpieriencesGameMaster(int diceAmount, Dice d20){
        super(diceAmount);
        this.d20 = d20;
    }

    public void rollTheDice(){
        super.rollTheDice();
        System.out.println("Rolling the super dice d20!");
        d20.superroll();
    }
}
