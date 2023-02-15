package actividad5;

public class Pelicula extends Produccion {

    private String mainActor;

    private String mainActress;

    public Pelicula(String title, long duration, Format format, Date releaseDate, String mainActor, String mainActress) {
        super(title, duration, format, releaseDate);
        this.mainActor = mainActor;
        this.mainActress = mainActress;
    }

    public Pelicula(String title, long duration, Format format, Date releaseDate, String mainActor) {
        this(title, duration, format, releaseDate, mainActor, null);
    }

    public Pelicula(String mainActress, String title, long duration, Format format, Date releaseDate) {
        this(title, duration, format, releaseDate, null, mainActress);
    }



    public Pelicula(String title, Format format, Date releaseDate, String mainActor, String mainActress) {
        this(title, 4800l, format, releaseDate, mainActor, mainActress);
    }

    @Override
    public void showDetails() {
        System.out.println("----------------- Película ----------------");
        super.showDetails();
        System.out.println("Duracion: " + getDurationTime());
        System.out.println("--------------------------------------------");
    }

    @Override
    public String toString() {
        return super.toString() + " (pelicula)" + " actor: = " + mainActor + ", actriz= " + mainActress;
    }
}
