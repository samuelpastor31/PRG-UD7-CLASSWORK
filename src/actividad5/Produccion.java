package actividad5;

public class Produccion {

    private String title;

    private long duration;

    private String summary;

    private Format format;

    protected Date releaseDate;

    public Produccion(String title, long duration, Format format, Date releaseDate) {
        this.title = title;
        this.duration = duration;
        this.format = format;
        this.releaseDate = releaseDate;
    }

    public void showDetails() {
        System.out.printf("%s (%d)%n",  title, releaseDate.getAnyo());
        System.out.println("Descripcion: " + summary);
    }

    public String getTitle() {
        return title;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSummary() {
        return summary;
    }

    public long getDuration() {
        return duration;
    }

    protected String getDurationTime() {
        int totalSeconds = (int) duration;
        int horas = totalSeconds / 3600;
        totalSeconds -= horas * 3600;
        int minutes = totalSeconds / 60;
        totalSeconds -= minutes * 60;
        return String.format("%dh %dmin %ds", horas, minutes, totalSeconds);
    }

    @Override
    public String toString() {
        return "Producción: " + "titulo = " + title + ", duración=" + getDurationTime() + ", formato=" + format;
    }
}
