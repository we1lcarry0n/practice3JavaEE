import java.util.Collection;

public class SuperCuber implements RubicsCube{

    public SuperCuber(){}

    public void solve() {
        for (RubicsCube cube:cubes){
            cube.solve();
        }
    }

    private Collection<RubicsCube> cubes;
    public void setCubes(Collection<RubicsCube>
                         rubicsCubes){
        this.cubes = cubes;
    }
}
