/**
 * Clase que hereda de Thread, en el método run() haremos que
 * cada hilo que sea lanzado, duerma un número determinado de segundo, el hilo
 * que al crearlo le pasemos como parámetro el número 1, tardará más tiempo
 * que los demás en terminar su ejecución.
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
 */
// 1 - Crear clase que herede de Thread
public class ThreadTest03 extends Thread{

    private String nombre;

    public ThreadTest03(String nombre) {
        this.nombre = nombre;
    }
    
    // 2 - Sobreescribir método run()
    public void run(){
        System.out.println("Empieza el hilo número: " + nombre);
        try {
            if (nombre.equals("1")) {
                Thread.sleep(6000);
                System.out.println("Durmiendo proceso " + nombre + " 6000 milisegundos");
            } else {
                int x = (int)(Math.random()*3000);
                Thread.sleep(x);
                System.out.println("Durmiendo proceso " + nombre + " " + x + " milisegundos");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        // 3 - Instancia de la clase Thread creada.
        ThreadTest03 tarea1 = new ThreadTest03("1");
        ThreadTest03 tarea2 = new ThreadTest03("2");
        ThreadTest03 tarea3 = new ThreadTest03("3");
        ThreadTest03 tarea4 = new ThreadTest03("4");
        // 4 - Iniciar el thread ejecutándo el método start()
        tarea1.start();
        tarea2.start();
        tarea3.start();
        tarea4.start();
    }
}
