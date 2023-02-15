package actividad4.familia;

public class Abuelo {
    private String name;
    public Abuelo() {
        this.name = "Sin nombre";
    }
    public Abuelo(String name) {
        this.name = name;
    }
    public String toString() {
        return "name: " + name;
    }
}
