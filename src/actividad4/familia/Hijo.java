package actividad4.familia;

public class Hijo extends Padre{
    private int surname;
    public Hijo (int surname) {
        this. surname = surname;
    }
    public String toString() {
        return super.toString() + ",surname:" + surname;
    }
}