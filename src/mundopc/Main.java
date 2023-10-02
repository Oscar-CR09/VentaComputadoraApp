package mundopc;

import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;

public class Main {
    public static void main(String[] args) {

        //crear objetos

        Raton ratonLenovo = new Raton("bluetooth","epson");
        System.out.println(ratonLenovo);

        Teclado tecladoLenovo = new Teclado("bluetooth","epson");
        System.out.println(tecladoLenovo);

        Monitor monitorLenovo = new Monitor("epson",27);
        System.out.println(monitorLenovo);
        
        }
    }