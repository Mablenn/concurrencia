/**
 * Esta clase lanzará 3 Threads simultaneamente en el método main. Uno de ellos
 * lo dormiremos durante medio segundo para ver la diferencia
 * durante la ejecución.
 */
package ejemplosThread;

/**
 *
 * @author mab
 */
public class ThreadTest02 extends Thread{

    private String nombre;
    
    public ThreadTest02(String name) {
        this.nombre = name;
    }
        
    public void run(){
        if ( nombre.equals("tarea1")){
            try {
                sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Ejecutándo hilo: " + nombre);
        }
    }
    
    public static void main(String[] args) {
        ThreadTest02 hilo1 = new ThreadTest02("tarea1");
        ThreadTest02 hilo2 = new ThreadTest02("tarea2");
        ThreadTest02 hilo3 = new ThreadTest02("tarea3");
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
