public class Arete {
    public Sommet numSommet1;
    public Sommet numSommet2;
    public double tempsEnSeconde;

    public Arete(Sommet numSommet1, Sommet numSommet2, double tempsEnSeconde) {
        this.numSommet1 = numSommet1;
        this.numSommet2 = numSommet2;
        this.tempsEnSeconde = tempsEnSeconde;
    }

    @Override
    public String toString() {
        return " " + numSommet1.toString() + " " + numSommet2.toString();
    }
}
