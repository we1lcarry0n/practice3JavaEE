public class Speedcuber implements RubicsCube {

    private String cubeModel;
    private RubicsCube rubicsCube;

    public Speedcuber(){}

    public void solve(){
        System.out.println("Solving "+ cubeModel + "in 20 sec!");

    }

    public void setCube(String cube) {
        this.cubeModel = cube;
    }
    public String getCube() {
        return cubeModel;
    }

    public void setRubicsCube(RubicsCube cube){
        this.rubicsCube = cube;
    }
}
