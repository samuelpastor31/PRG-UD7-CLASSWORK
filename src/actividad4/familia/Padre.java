package actividad4.familia;

public class Padre extends Abuelo {
    public Padre() {
    }
    public Padre(String name) {
        super(name);
    }
    public String toString() {
        return "padre" + super.toString();
    }
}