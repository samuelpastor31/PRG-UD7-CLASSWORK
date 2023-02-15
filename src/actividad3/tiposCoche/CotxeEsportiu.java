package actividad3.tiposCoche;

public class CotxeEsportiu extends Cotxe {
    private boolean descapotable;

    public CotxeEsportiu(int velocitat, boolean descapotable) {
        super(velocitat, 400, "BBB111");
        this.descapotable = descapotable;
    }

    @Override
    public void accelerar() {
        super.accelerar();
        super.consumir(1);
    }
}
