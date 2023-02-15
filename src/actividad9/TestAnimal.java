package actividad9;

import actividad9.types.*;

public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animales= new Animal[10];
        Animal gato = new Gato(false,Comida.OMNIVORO,Tamaño.PEQUEÑO,"Espanya");
        Animal hipopotamo = new Hipopotamo(false,Comida.HERBIVORO,Tamaño.GRANDE,"Africa");
        Animal Leon = new Leon(false,Comida.CAMNIVORO,Tamaño.GRANDE,"Africa");
        Animal Lobo = new Lobo(false,Comida.CAMNIVORO,Tamaño.GRANDE,"Africa");
        Animal perro = new Perro(false,Comida.OMNIVORO,Tamaño.PEQUEÑO,"Espanya");
        Animal tigre = new Tigre(false,Comida.CAMNIVORO,Tamaño.GRANDE,"Africa");
        Animal Leon2 = new Leon(false,Comida.CAMNIVORO,Tamaño.GRANDE,"Africa");
        Animal Lobo2 = new Lobo(false,Comida.CAMNIVORO,Tamaño.GRANDE,"Africa");
        Animal perro2 = new Perro(false,Comida.OMNIVORO,Tamaño.PEQUEÑO,"Espanya");
        Animal tigre2 = new Tigre(false,Comida.CAMNIVORO,Tamaño.GRANDE,"Africa");
        animales[0]=gato;
        animales[1]=hipopotamo;
        animales[2]=Leon;
        animales[3]=Lobo;
        animales[4]=perro;
        animales[5]=tigre;
        animales[6]=Leon2;
        animales[7]=Lobo2;
        animales[8]=perro2;
        animales[9]=tigre2;
        Veterinario veterinario = new Veterinario();

        for (int i = 0; i < animales.length ; i++) {
            veterinario.alimentar(animales[i]);
            veterinario.vacunar(animales[i]);
        }
    }
}
