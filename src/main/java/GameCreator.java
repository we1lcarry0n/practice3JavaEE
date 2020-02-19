public class GameCreator implements Dice{

    private static int RESULT = 20;

    public GameCreator(){}

    public void superroll() {
        System.out.println("I am the creator! I always roll "+ RESULT);
    }

}
