/**
 * Clase ejemplo de Thread, dentro del método run() duerme el hilo una cantidad
 * de milisegundos invocando el método 'sleep()'.Después mostrará un texto por consola.
 * 
 *  1 - Crear clase que herede de Thread
 *  2 - Sobreescribir método run()
 *  3 - Instancia de la clase Thread creada.
 *  4 - Iniciar el thread ejecutándo el método start()
 */

package ejemplosThread;

/**
 *
 * @author renton
 * @time    10:20:13   
 * @date    08-sep-2017   
 */
// 1 - Crear clase que herede de Thread
public class ThreadTest02 extends Thread{

    private String nombre;
    
    public ThreadTest02(String nombre){
        this.nombre = nombre;
    }
    // 2 - Sobreescribir método run()
    public void run(){
        try {
            int n = (int)(Math.random() * 3000);
            Thread.sleep(n);
            System.out.println( nombre + ". Proceso dormido " + n + " milisegundos");
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        //  3 - Instancia de la clase Thread creada.
        ThreadTest02 hilo01 = new ThreadTest02("Hilo 1");
        ThreadTest02 hilo02 = new ThreadTest02("Hilo 2");
        ThreadTest02 hilo03 = new ThreadTest02("Hilo 3");
        // 4 - Iniciar el thread ejecutándo el método start()
        hilo01.start();
        hilo02.start();
        hilo03.start();
    }
}
