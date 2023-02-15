package actividad7;
public class Cliente {

    private int telefono;
    private String nombre;
    private String dni;
    private String nombreCompañia;

    public Cliente(int telefono, String nombre, String dni, String nombreCompañia) {
        this.nombre = nombre;
        this.nombreCompañia = nombreCompañia;
        this.telefono = telefono;
        this.dni = dni;

    }

    public String getNombre() {
        return nombre;
    }
}
