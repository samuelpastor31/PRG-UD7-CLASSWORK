package actividad11.tiposempleados;
import actividad11.Cliente;
import actividad11.Coche;
import actividad11.tiposempleados.Empleado;

public class Vendedor extends Empleado {


    private Coche coche;
    private String areaDeVenta;
    private Cliente[] listaClientes;
    private int contadorClientes = 0;
    private double comision;

    public Vendedor(String nombre, String apellidos, String dni, String direccion, int telefono, int salario, int matricula, String marca, String modelo, String areaDeVenta, double comision) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.areaDeVenta = areaDeVenta;
        this.listaClientes = new Cliente[10];
        this.comision = comision;


    }

    @Override
    public void incrementarSalario() {
        super.salario = super.salario + (super.salario * 0.1);
    }


    public void altaCliente(Cliente cliente ){
        for (int i = 0; i < this.listaClientes.length; i++) {
            if(this.listaClientes[i]==null) {
                this.listaClientes[i] = cliente;

            }
        }
        contadorClientes = contadorClientes +1;

    }
    public void bajaCliente(Cliente cliente){
        for (int i = 0; i <this.listaClientes.length ; i++) {
            if(listaClientes[i].getNombre().equals(cliente.getNombre())) {
                listaClientes[i] = null;
            }

        }
    }

    public void cambiarCoche(Coche coche){
        this.coche = coche;
    }

    @Override
    public String toString() {
        return super.toString()+"NumeroClientes=" + contadorClientes +
                '}';
    }
}
