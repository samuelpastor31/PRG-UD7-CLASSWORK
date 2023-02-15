package actividad9;

abstract public class Animal {
    private boolean vacunado;
    protected Comida comida;
    protected int hambre;
    private Tamaño tamaño;
    private String localizacion;

    public Animal(boolean vacunado, Comida comida, Tamaño tamaño, String localizacion) {
        this.vacunado = vacunado;
        this.comida = comida;
        this.hambre = 8;
        this.tamaño = tamaño;
        this.localizacion = localizacion;
    }

    public abstract void emitirSonido();

    public abstract void comer();

    public abstract void vacunar();
}
