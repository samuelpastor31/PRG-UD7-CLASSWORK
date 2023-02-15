package actividad11;

import actividad11.tiposempleados.Administrativo;
import actividad11.tiposempleados.Empleado;
import actividad11.tiposempleados.Vendedor;

public class Empresa {

    private Empleado[] empleados;

    public Empresa() {
        this.empleados = new Empleado[20];
    }

    public void anyadirEmpleados(Empleado empleado){
        if (empleados.length<=20) {
            for (int i = 0; i < empleados.length; i++) {
                if (empleados[i]!=null) {
                    if (empleados[i].equals(empleado.getDni())) {
                        return;
                    }
                }
                if (empleados[i] == null) {
                    empleados[i] = empleado;
                    if (empleados[i].equals(empleado.getDni())) {
                        return;
                    }
                }
            }
        }
    }

    public void borrarEmpleado(String dni){
        for (int i = 0; i <empleados.length ; i++) {
            if (empleados[i].equals(dni)){
                empleados[i]=null;
            }
        }
    }

    public void visualizarEmpleado(String dni){
        for (int i = 0; i <empleados.length ; i++) {
            if (empleados[i].equals(dni)){
                System.out.println(empleados[i].toString());
            }
        }
    }

    public void visualizarListaEmpleados(){
        System.out.println("------ Todos Los empleados --------");
        for (int i = 0; i <empleados.length ; i++) {
            if (empleados[i] != null) {
                System.out.println(empleados[i].toString());
            }
        }
    }

    public void visualizarListaVendedores(){
        System.out.println("---Vendedores---");
        for (int i = 0; i <empleados.length ; i++) {
            if (empleados[i] != null) {
                if (empleados[i] instanceof Vendedor) {
                    System.out.println(empleados[i].toString());
                }
            }
        }
        System.out.println("--------------");
    }

    public void visualizarListaAdministrativos(){
        System.out.println("---Administrativos---");
        for (int i = 0; i <empleados.length ; i++) {
            if (empleados[i] != null) {
                if (empleados[i] instanceof Administrativo) {
                    System.out.println(empleados[i].toString());
                }
            }
        }
        System.out.println("---------------------");
    }

    public double totalMensualSalarios(){
        double totalSalariosMenusal = 0;
        for (int i = 0; i <empleados.length ; i++) {
            if (empleados[i] != null) {
                totalSalariosMenusal = totalSalariosMenusal + empleados[i].getSalario();
            }
        }

        return totalSalariosMenusal;
    }

    public void aumentoSalarioGeneralizado(){
        for (int i = 0; i < empleados.length ; i++) {
            if (empleados[i] != null) {
                empleados[i].incrementarSalario();
            }
        }
        System.out.println("------ Aumento salario de empleados ------");
    }
}
