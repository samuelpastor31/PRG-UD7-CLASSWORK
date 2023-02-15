package actividad9;

import actividad9.types.Leon;
import actividad9.types.Tigre;

public class Veterinario {

    public void alimentar(Animal animal){
        animal.comer();
        System.out.println("Animal alimentado");

    }

    public void vacunar(Animal animal){
        if (animal instanceof Tigre||animal instanceof Leon){
            animal.comer();
            System.out.println("Animal alimentado para vacunarlo");

        }
        animal.vacunar();
        System.out.println("Animal vacunado");
        animal.emitirSonido();
    }
}
