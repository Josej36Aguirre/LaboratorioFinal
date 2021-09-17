
package com.gm.mmundopc;

public class Raton extends DispositivoEntrada{
    
    private final int  idRaton;
    private static int contadorRatone;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatone;
        
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", clase super=" + super.toString() + '}';
    }
    
    
}
