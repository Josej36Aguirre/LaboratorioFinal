
package com.gm.mmundopc;


public class Orden {
    private final int idorden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS= 10;
    private int contadorComputadoras;

    public Orden() {
       this.idorden = ++Orden.contadorOrdenes;
       this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }
    
    public void agregarOrden(Computadora computadora){
        if (contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        }else{
            System.out.println("HAs superado el limite: "+Orden.MAX_COMPUTADORAS);
        }
    }
    public void mostrarOrden(){
        System.out.println("Orden #: "+this.idorden);
        System.out.println("Computadora de la Orden #: "+this.idorden);
        
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }
}
