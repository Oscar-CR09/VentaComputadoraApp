package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentaComputadorasApp {
    public static void main(String[] args) {

        //crear objetos

        Raton ratonLenovo = new Raton("bluetooth","epson");
       // System.out.println(ratonLenovo);

        Teclado tecladoLenovo = new Teclado("bluetooth","epson");
       // System.out.println(tecladoLenovo);

        Monitor monitorLenovo = new Monitor("epson",27);
        //System.out.println(monitorLenovo);

        //objeto de tipo computadora
        Computadora computadoraLenovo = new Computadora("Computadora Lenovo",monitorLenovo,tecladoLenovo,ratonLenovo);
       // System.out.println(computadoraLenovo);

        // nuevo

        Monitor monitorDell = new Monitor("Dell",15);
        Teclado tecladoDell = new Teclado("Usb","Dell");
        Raton ratonDell = new Raton("usb","Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell ",
                monitorDell,tecladoDell,ratonDell);

        //Crear una orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraDell);
        orden1.mostrarOrden();

        Monitor monitorMac = new Monitor("Mac",27);
        Teclado tecladoMac = new Teclado("bluetooth","Mac");
        Raton ratonMac = new Raton("bluetooth","Mac");
        Computadora computadoraIMac= new Computadora("iMac", monitorMac,tecladoMac,ratonMac);

        Orden orden2= new Orden();
        orden2.agregarComputadora(computadoraIMac);
        orden2.agregarComputadora(computadoraDell);
        orden2.agregarComputadora(computadoraLenovo);
        System.out.println();
        orden2.mostrarOrden();
    }
}