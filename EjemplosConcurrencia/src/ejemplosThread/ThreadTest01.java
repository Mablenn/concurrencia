/**
 * Este ejemplo es una sencilla clase que hereda de Thread. En el método run() escribiremos
 * el código referente a la tarea a realizar. En el método main lanzaremos dos hilos que se ejecutarán de
 * forma concurrente.
 * 
 *      - Crear clase que herede de Thread
 *      - Sobreescribir método run()
 *      - ejecutar los Threads desde el main utilizando el método start()
 * 
 */

package ejemplosThread;

/**
 *
 * @author mab
 */
public class ThreadTest01 extends Thread {
    
    private String nombre;
    
    public ThreadTest01(String nombre){
        this.nombre = nombre;
    }
    
    //Sobreecribir método run
    public void run(){
        //Tarea a realizar por el Thread
        for (int i = 0; i < 10; i++) {
            System.out.println("Ejecutándo hilo " + nombre);
        }
    }
    
    public static void main(String[] args) {
        ThreadTest01 hilo1 = new ThreadTest01("Hilo 1");
        ThreadTest01 hilo2 = new ThreadTest01("Hilo 2");
        //Ejecutar Thread desde método start()
        hilo1.start();
        hilo2.start();
    }
}
