/**
 * Clase ejemplo de Thread, cada hilo que lancemos de esta clase mostrará 5 veces
 * un texto con el nombre del hilo que es pasado en el constructor.
 * 
 *  1 - Crear clase que herede de Thread.
 *  2 - Sobreescribir método run(). 
 *  3 - Crear instancia de la clase Thread creada.
 *  4 - Iniciar el thread ejecutándo el método start()
 */

package ejemplosThread;

/**
 *
 * @author renton
 */

// 1 - Crear clase que herede de Thread
public class ThreadTest01 extends Thread{

    private String nombreThread;

    public ThreadTest01(String nombreThread) {
        this.nombreThread = nombreThread;
    }
    
    // 2 -Sobreescribir método run()
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Se está ejecutando " + nombreThread );
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // 3 - Crear instancia de la clase Thread creada.
        ThreadTest01 tarea1 = new ThreadTest01("Tarea 1");
        ThreadTest01 tarea2 = new ThreadTest01("Tarea 2");
        ThreadTest01 tarea3 = new ThreadTest01("Tarea 3");
        // 4 - Iniciar el thread ejecutándo el método start()
        tarea1.start();
        tarea2.start();
        tarea3.start();
    }
}
