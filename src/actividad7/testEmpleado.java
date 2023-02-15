package actividad7;
public class testEmpleado {
    public static void main(String[] args) {
        Cliente clienteadmin1 = new Cliente(6453452,"samuel","dadfqwdwad","carglas");
        Cliente clienteadmin2 = new Cliente(6453452,"ruben","23523523X","airbender");
        Administrativo admin1 = new Administrativo("Juan","Perez Perez","21655251Q","s",123456789,1000,2,345645445);
        Vendedor vend1 = new Vendedor("Vendedor1","Gomez Gomez","21564451E","Casa",123456,2000,123,"E","Si","Casa",0);
        System.out.println("---- Trabajadores antes de aumentar salario ----");
        System.out.println(admin1.toString());


        System.out.println(vend1.toString());
        System.out.println("\n");


        admin1.incrementarSalario();
        vend1.incrementarSalario();
        System.out.println("---- Trabajadores después de aumentar salario ----");
        System.out.println(admin1.toString());
        System.out.println(vend1.toString());
        System.out.println("\n");
        System.out.println("---- Vendedor después de añadir 2 clientes ----");
        vend1.altaCliente(clienteadmin1);
        vend1.altaCliente(clienteadmin2);
        System.out.println(vend1.toString());
    }
}

