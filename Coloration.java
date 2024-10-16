import java.util.*;

public class Coloration {
    public Sommet sommet;
    public List<Integer> numeroLigne;
    public List<Boolean> siTerminus;
    public List<Integer> branchement;

    public Coloration(Sommet sommet, List<Integer> numeroLigne, List<Integer> branchement, List<Boolean> siTerminus) {
        this.sommet = sommet;
        this.numeroLigne = numeroLigne;
        this.branchement = branchement;
        this.siTerminus = siTerminus;
    }

    @Override
    public String toString() {
        return " Station : " +  sommet.toString() + " Ligne : " + numeroLigne;
    }
}
