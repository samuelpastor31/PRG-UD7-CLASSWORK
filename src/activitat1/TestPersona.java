package activitat1;

public class TestPersona {
    public static void main(String[] args) {
        Persona sergio = new Persona();
        PersonaInglesa erik = new PersonaInglesa();
        PersonaRusa andor = new PersonaRusa();
        PersonaFrancesa ainhoa = new PersonaFrancesa();

        sergio.saluda();
        erik.saluda();
        andor.saluda();
        ainhoa.saluda();
    }
}
