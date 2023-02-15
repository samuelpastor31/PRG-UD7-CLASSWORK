package actividad5;

public class Serie extends Produccion {

    private int season;

    private int chapter;

    public Serie(String title, long duration, Format format, Date releaseDate, int season, int chapter) {
        super(title, duration, format, releaseDate);
        this.season = season;
        this.chapter = chapter;
    }

    public Serie(String title, Format format, Date releaseDate, String director, int season, int chapter) {
        super(title, 2400l, format, releaseDate);
        this.season = season;
        this.chapter = chapter;
    }

    public void showDetails() {
        System.out.println("-------------------Serie--------------------");
        super.showDetails();
        System.out.printf("Capitulo: %d - Temporada %d %n", chapter, season);
        System.out.println("Duracion: " + getDurationTime());
        System.out.println("--------------------------------------------");
    }

    @Override
    public String toString() {
        return super.toString() + " (Serie) temporada = " + season + ", capítulo=" + chapter;
    }

}
