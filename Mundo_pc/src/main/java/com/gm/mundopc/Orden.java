package com.gm.mundopc;

public class Orden {
    private int idOrden;
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 3;
    private Computadora computadoras[];


    public Orden() {      
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras<Orden.MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadoras++] = computadora;
        }else
            System.out.println("Se ha asignado la cantidad máximo de productos");
    }
    
    public void mostrarOrden(){
        System.out.println("Id de orden: " + this.idOrden);
        for(int i = 0; i < this.contadorComputadoras; i++){
            System.out.println(this.computadoras[i]);
        }

    }
    
}
