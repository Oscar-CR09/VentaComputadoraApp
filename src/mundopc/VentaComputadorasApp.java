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
        }

    //Crear una orden
    Orden orden1 = new Orden();
    

    }