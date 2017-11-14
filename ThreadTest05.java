/*
 * Demo del método 'yield()'
 * Utilización de una inner class
 * 
 * Con este ejemplo, conseguimos que el scheduler del procesador distribuya el tiempo
 * del procesador entre los hilos que están ejecutándose. No se ejecutan los hilos de 
 * forma secuencial.
 */

package ejemplosThread;

/**
 *
 * @author renton
 */
public class ThreadTest05 extends Thread {

    public static void main(String[] args) {
    
        NyThread hilo1 = new NyThread(50, "AAA");
        NyThread hilo2 = new NyThread(120, "BBB");
        NyThread hilo3 = new NyThread(20, "CCC");
        
        hilo1.setPriority(MIN_PRIORITY);
        hilo3.setPriority(MIN_PRIORITY);
        hilo2.setPriority(MAX_PRIORITY);
       
        hilo1.start();
        hilo2.start();
        hilo3.start();

    } // main
    
    static class NyThread extends Thread{
    
        int tiempo;
        String nombre;
        
        public NyThread(int t, String n){
            this.tiempo = t;
            this.nombre = n;
        }

        public void run(){
            for (int i = 1; i < tiempo; i++) {
                System.out.println("\t\t"+ nombre + " -> " + i);
            }
        }
    }
}