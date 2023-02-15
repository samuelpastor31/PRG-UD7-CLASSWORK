package actividad5;

public class Documental extends Produccion {

   private String investigador;

   private String tema;

    public Documental(String title, long duration, Format format, Date releaseDate, String investigador, String tema) {
        super(title, duration, format, releaseDate);
        this.investigador = investigador;
        this.tema = tema;
    }

    public Documental(String title, Format format, Date releaseDate, String investigador, String tema) {
        this(title, 2000l, format, releaseDate, investigador, tema);
    }

    @Override
    public void showDetails() {
        System.out.println("---------------- Documental ---------------");
        super.showDetails();
        System.out.println("Investigador: " + investigador);
        System.out.println("Duracion: " + getDurationTime());
        System.out.println("--------------------------------------------");
    }

    @Override
    public String toString() {
        return super.toString() + " (documental)" + " investigador: = " + investigador + ", tema= " + tema;
    }

}
