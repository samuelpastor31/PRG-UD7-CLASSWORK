package actividad11;

import actividad11.tiposempleados.Administrativo;
import actividad11.tiposempleados.Vendedor;

public class testEmpleado {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();
        Administrativo admin1 = new Administrativo("Empleado administrativo 1","Perez Perez","21655251Q","s",123456789,1024,2,345645445);
        Administrativo admin2 = new Administrativo("Empleado administrativo 2","Perez Perez","21655252Q","s",123456789,2024,24,345645445);
        Vendedor vend1 = new Vendedor("Empleado vendendor 1","Gomez Gomez","21564451E","Casa",123456,3024,123,"E","Si","Casa",0);
        Vendedor vend2 = new Vendedor("Empleado vendendor 1","Gomez Gomez","21564452E","Casa",123456,4024,123,"E","Si","Casa",0);
        empresa.anyadirEmpleados(admin1);
        empresa.anyadirEmpleados(admin2);
        empresa.anyadirEmpleados(vend1);
        empresa.anyadirEmpleados(vend2);
        empresa.visualizarListaEmpleados();
        System.out.println("------------------------\n\n");

        System.out.println("El coste mensual en salarios es "+empresa.totalMensualSalarios()+" €\n\n");
        empresa.aumentoSalarioGeneralizado();
        empresa.visualizarListaEmpleados();
        System.out.println("------------------------\n\n");

        System.out.println("El coste mensual en salarios es "+empresa.totalMensualSalarios()+" €\n\n");

        System.out.println("------ Listados con filtros ------");
        empresa.visualizarListaAdministrativos();
        empresa.visualizarListaVendedores();





    }
}

