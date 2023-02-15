
package actividad11.tiposempleados;

abstract public class Empleado {

    private String nombre;
    private String apellidos;
    protected String dni;
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

    public String getDni() {
        return dni;
    }

    public double getSalario() {
        return salario;
    }

    public boolean equals(Empleado empleado){
        return empleado.getDni().equals(this.dni);
    }

    public boolean equals(String dni){
        return this.dni.equals(dni);
    }
}
