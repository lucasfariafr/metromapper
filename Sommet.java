import java.util.*;

public class Sommet {
    public int numSommet;
    Map<Integer,Integer> posXY;
    public String nomSommet;

    public static List<Sommet> sommets;

    public Sommet(int numSommet, Map<Integer, Integer> posXY, String nomSommet) {
        this.numSommet = numSommet;
        this.posXY = posXY;
        this.nomSommet = nomSommet;
    }

    @Override
    public String toString() {
        return nomSommet;
    }
}
