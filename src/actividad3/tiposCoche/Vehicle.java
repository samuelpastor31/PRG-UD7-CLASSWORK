package actividad3.tiposCoche;

public class Vehicle {

    private int velocitat;

    @Override
    public String toString() {
        return "Vehicle{" +
                "velocitat=" + velocitat +
                '}';
    }

    private int rodes;
    public Vehicle(int velocitat) {
        this.velocitat = velocitat;
        this.rodes= 4;
    }

    public void accelerar() {
        this.velocitat += 10;
    }
    public void frenar() {
        this.velocitat = 0;
    }


}

