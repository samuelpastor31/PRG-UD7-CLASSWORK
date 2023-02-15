package actividad3;

import actividad3.tiposCoche.Cotxe;
import actividad3.tiposCoche.CotxeEsportiu;
import actividad3.tiposCoche.Vehicle;

public class TestCoche {
    public static void main(String[] args) {
        Cotxe opel = new Cotxe(30, 100, "AAA111");
        opel.accelerar();
        CotxeEsportiu ferrari = new CotxeEsportiu(100, false);
        ferrari.accelerar();
        ferrari.frenar();

        Vehicle vehicle = new Vehicle(50);
        vehicle.accelerar();
        vehicle.accelerar();
        System.out.println(vehicle);

    }
}
