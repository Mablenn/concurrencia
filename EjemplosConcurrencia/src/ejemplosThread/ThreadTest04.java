
package ejemplosThread;

/**
 *
 * @author renton
 */
public class ThreadTest04 extends Thread {

    public void run(){
        int numID = (int)Thread.currentThread().getId();
        try {sleep((int)numID * 500);} 
        catch (InterruptedException e) { e.printStackTrace();}
        System.out.println("Hilo:" + numID +  " esperando " + (float)numID / 2 + " segundos." +  " Mensaje: Hola mundo");
    }
    
    public static void main(String[] args) {
        ThreadTest04 hilo1 = new ThreadTest04();
        ThreadTest04 hilo2 = new ThreadTest04();
        ThreadTest04 hilo3 = new ThreadTest04();
        ThreadTest04 hilo4 = new ThreadTest04();
        ThreadTest04 hilo5 = new ThreadTest04();
        ThreadTest04 hilo6 = new ThreadTest04();
        //Ejecutar hilos desde método 'start()'
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        hilo6.start();
    }
}
