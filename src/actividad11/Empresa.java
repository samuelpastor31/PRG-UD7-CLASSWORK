package actividad11;

public class Empresa {

    private String[] empleados;

    public Empresa(String[] empleados) {
        this.empleados = empleados;
    }

    public void anyadirEmpleados(Empleado empleado){
        for (int i = 0; i <empleados.length ; i++) {
            if (empleados[i].equals(empleado.dni))
            {
                return;
            }
            if (empleados[i]==null){
                empleados[i]=empleado.getDni();
                if (empleados[i].equals(empleado.dni))
                {
                    return;
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
}
