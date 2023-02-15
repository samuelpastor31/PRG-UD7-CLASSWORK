package actividad5;

public class BatoiFlix {

    public static void main(String[] args) {

        Date releaseDate = new Date("19/02/2021");
        Documental dreamSongs = new Documental("Dream Songs", 2400l, Format.MPG, releaseDate, "Enrique Juncosa",
                "Movimiento Hippie");
        dreamSongs.setSummary("Lorem Ipsum Lorem Ipsum Lorem Ipsum");

        releaseDate = new Date("20/06/2020");
        Pelicula newsOfTheWorld = new Pelicula("News of the World", 7200l, Format.AVI, releaseDate, "Tom Hanks",
                "Carolina Betller");
        newsOfTheWorld.setSummary("Lorem Ipsum Lorem Ipsum Lorem Ipsum");

        Date date = new Date("04/06/2001");
        Serie elHacker = new Serie("El hacker", 3600l, Format.FLV, date,
                1, 20);
        elHacker.setSummary("Lorem Ipsum Lorem Ipsum Lorem Ipsum");

        System.out.println("\nListado Producciones (Uso toString()) \n");
        System.out.println(newsOfTheWorld);
        System.out.println(dreamSongs);
        System.out.println(elHacker);

        System.out.println("\nDetalle Producciones (uso mostrarDetalle()\n");
        newsOfTheWorld.showDetails();
        dreamSongs.showDetails();
        elHacker.showDetails();

    }

}