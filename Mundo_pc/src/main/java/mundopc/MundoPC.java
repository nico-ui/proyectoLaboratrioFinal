package mundopc;

import com.gm.mundopc.Computadora;
import com.gm.mundopc.Monitor;
import com.gm.mundopc.Orden;
import com.gm.mundopc.Raton;
import com.gm.mundopc.Teclado;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("LG", 29.0);
        Monitor monitor2 = new Monitor("HUAWEI", 29.0);
        Monitor monitor3 = new Monitor("SAMSUNG", 24.0);
        Monitor monitor4 = new Monitor("XIAOMI", 21.5);
        Monitor monitor5 = new Monitor("HP", 23.8);
        Monitor monitor6 = new Monitor("Alienware", 27.0);
        
        Teclado teclado = new Teclado("USB", "SteelSeries");
        Teclado teclado2 = new Teclado("USB", "Logitech");
        Teclado teclado3 = new Teclado("Bluetooth", "Razer");
        Teclado teclado4 = new Teclado("Alambrico", "Gamecraft");
        
        Raton raton = new Raton("Bluetooth", "Logitech");
        Raton raton2 = new Raton("USB", "Razer");
        Raton raton3 = new Raton("Bluetooth", "Microsoft");
        
        Orden orden1 = new Orden();
        Computadora computadora = new Computadora("MacBook Air", monitor, teclado, raton);
        Computadora computadora2 = new Computadora("Gamer pro", monitor6, teclado3, raton2);
        Computadora computadora3 = new Computadora("Diseño", monitor2, teclado2, raton3);
        
        orden1.agregarComputadora(computadora);
        orden1.agregarComputadora(computadora2);
        orden1.agregarComputadora(computadora3);
        orden1.agregarComputadora(computadora3);
        
        orden1.mostrarOrden();
        
    }
}
