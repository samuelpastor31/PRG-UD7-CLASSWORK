package actividad9.types;

import actividad9.Animal;
import actividad9.Comida;
import actividad9.Tamaño;

public class Lobo extends Animal {
    public Lobo(boolean vacunado, Comida comida, Tamaño tamaño, String localizacion) {
        super(vacunado, comida, tamaño, localizacion);
    }

    @Override
    public void emitirSonido() {
        System.out.println("AAAAUUUUUUU");
    }

    @Override
    public void comer() {
        super.hambre--;
    }

    @Override
    public void vacunar() {

    }
}
