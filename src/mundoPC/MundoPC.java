package mundoPC;

import com.gm.mmundopc.*;

public class MundoPC {
    
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        Raton ratonHP = new Raton("bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        Monitor monitorGamer = new Monitor("Gamer", 34);
        Teclado tecladoCamer = new Teclado("bluetooth", "Gamer");
        Raton ratonGamer = new Raton("bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoHP, ratonHP);
        
        Orden orden1 = new Orden();
        orden1.agregarOrden(computadoraHP);
        orden1.agregarOrden(computadoraGamer);
        orden1.mostrarOrden();
    }
    
}
