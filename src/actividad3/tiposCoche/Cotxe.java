package actividad3.tiposCoche;

public class Cotxe extends Vehicle {

    private float carburant;
    private String matricula;

    public Cotxe(int velocitat, float carburant, String matricula) {
        super(velocitat);
        this.carburant = carburant;
        this.matricula = matricula;
    }

    @Override
    public void accelerar() {
        super.accelerar();
        consumir(0.5f);
    }

    protected void consumir(float carburant) {
        this.carburant -= carburant;
    }

    public void proveir(int quantitat) {
        carburant += quantitat;
    }


}
