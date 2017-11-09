/*
 * Demo del método 'yield()'
 * Utilización de una inner class
 * 
 * Con este ejemplo, conseguimos que el scheduler del procesador distribuya el tiempo
 * del procesador entre los hilos que están ejecutándose.
 */

package ejemplosThread;

/**
 *
 * @author renton
 */
public class ThreadTest04 extends Thread {

    public static void main(String[] args) {
    
        NyThread hilo1 = new NyThread("AAA");
        NyThread hilo2 = new NyThread("BBB");
        NyThread hilo3 = new NyThread("CCC");
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
    
    static class NyThread extends Thread{
    
        String nombreHilo;
        
        public NyThread(String nombre){this.nombreHilo = nombre;}

        public void run(){
            try {
                Thread.sleep(1500);
                for (int i = 1; i < 11; i++) {
                    System.out.println(nombreHilo + " -> " + i);
                    //Repartir el tiempo de ejecución entre los hilos
                    yield();
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}