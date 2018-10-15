/*
 * Demo método 'yield()'
 * Utilización de una inner class
 * 
 * Con este ejemplo, conseguimos que el scheduler del procesador distribuya el tiempo
 * del procesador entre los hilos que están ejecutándose. No se ejecutan los hilos de 
 * forma secuencial.
 */

package ejemplosThread;

import static java.lang.Thread.yield;

/**
 *
 * @author renton
 */
public class ThreadTest04 {

    public static void main(String[] args) {
    
        DemoThread hilo1 = new DemoThread("Hilo AAA",30);
        DemoThread hilo2 = new DemoThread("Hilo BBB",10);
        DemoThread hilo3 = new DemoThread("Hilo CCC",15);
        DemoThread hilo4 = new DemoThread("Hilo DDD",50);
        DemoThread hilo5 = new DemoThread("Hilo EEE",25);
        DemoThread hilo6 = new DemoThread("Hilo FFF",30);
        DemoThread hilo7 = new DemoThread("Hilo GGG",50);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        hilo6.start();
        hilo7.start();
         
    } // main
    
    static class DemoThread extends Thread{
    
        String nombreHilo;
        int t;
        
        public DemoThread(String nombre, int t){ 
            this.nombreHilo = nombre; 
            this.t = t;
        }
        
        public void run(){
            for (int i = 0; i < t; ) {
                System.out.println("\t\t\t" + nombreHilo + " -> iteración " + ++i);
                if (i >= 20){
                   yield();
                   System.out.println();
                } 
            }
        }
    }
}
