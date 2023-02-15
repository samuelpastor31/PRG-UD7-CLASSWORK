package actividad11.tiposempleados;

public class Administrativo extends Empleado {

    private int despacho;
    private int numeroFax;


    public Administrativo(String nombre, String apellidos, String dni, String direccion, int telefonoContacto, int salario, int despacho, int numeroFax) {
        super(nombre, apellidos, dni, direccion, telefonoContacto, salario);
        this.despacho = despacho;
        this.numeroFax = numeroFax;
    }

    @Override
    public void incrementarSalario() {
        super.salario = super.salario + (super.salario * 0.05);
    }

    @Override
    public String toString() {

        return super.toString()+" Administrativo{" +
                "despacho=" + despacho +
                ", numeroFax=" + numeroFax +
                '}';
    }
}
