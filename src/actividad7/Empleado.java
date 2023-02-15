package actividad7;
import java.time.LocalDate;

public class Empleado {

    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private String fecha;
    private int telefonoContacto;
    protected double salario;

    public Empleado(String nombre, String apellidos, String dni, String direccion, int telefonoContacto, int salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefonoContacto = telefonoContacto;
        this.salario = salario;
        this.fecha = "2023-02-08";
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", salario=" + salario +
                '}';
    }

    public void incrementarSalario(){
        this.salario = this.salario + (this.salario*0.02);
    }
}
