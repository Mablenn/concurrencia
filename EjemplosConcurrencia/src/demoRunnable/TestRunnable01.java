
/**
 *  Esta clase es un sencillo ejemplo de ejecución de varios Threads
 * simultáneamente. La misma clase implementa la interfaz Runnable y
 * contiene el método main para ejecutarla.
 * 
 *  1 - Crear la clase que implemente la interfaz Runnable.
 *  2 - Sobreescribir método 'run()'.
 *  3 - Instancia a la clase creada.
 *  4 - Crear objetos Thread pasándoles como parámetro nuestro objeto Runnable
 *  5 - Ejecutar cada Thread desde el método 'start()'.
 */

 
package demoRunnable;

/**
 *
 * @author mab
 */
public class TestRunnable01 implements Runnable {
        //Sobreescribir método 'run()'
        public void run(){
            for (int i = 1; i <= 5; i++) {
                System.out.println("Ejecutándose el Thread " + Thread.currentThread().getName());
            }
        }

        public static void main(String[] args) {
            //Objetos de nuestra clase Runnable
            TestRunnable01 tarea1 = new TestRunnable01();
            TestRunnable01 tarea2 = new TestRunnable01();
            //Objetos Thread
            Thread t1 = new Thread(tarea1);
            Thread t2 = new Thread(tarea2);
            //Ejecutar cada Thread desde su método 'start()'
            t1.start();
            t2.start();
        }
}
