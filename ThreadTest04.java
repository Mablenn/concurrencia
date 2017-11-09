
package ejemplosThread;

/**
 *
 * @author renton
 */
public class ThreadTest04 extends Thread {

    private String nombre;
    
    public ThreadTest04(String nombre){
        this.nombre = nombre;
    }
    
    public void run(){
    
        try {
            int x = (int)(Math.random() * 3000);
            Thread.sleep(x);
            System.out.println(nombre + ". Proceso dormido " + x + " milisegundos");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        //Crear los hilos
        ThreadTest04 tarea01 = new ThreadTest04("Tarea 1");
        ThreadTest04 tarea02 = new ThreadTest04("Tarea 2");
        ThreadTest04 tarea03 = new ThreadTest04("Tarea 3");
        //Iniciar los hilos. El método 'start' invocará al método 'run' de cada objeto
        tarea01.start();
        tarea02.start();
        tarea03.start();
    }
}
