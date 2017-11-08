/**
 * Clase ejemplo de Thread. Lanzará varios hilos desde el main.
 * De los hilos que se ejecutarán, unos lo harán invocando el método 'start()', otros serán ejecutados
 * invocándo el método 'run()', de este modo podemos comprobar cuales se ejecutan concurrentemente
 * y cuales de forma secuencial.
 */
package ejemplosThread;

/**
 *
 * @author renton
 */
public class TestThread010 extends Thread {
    
    private String nombre;
    
    public TestThread010(String nombre){
        this.nombre = nombre;
    }
    
    public void run(){
        try {
            int n = (int)(Math.random()*2000);
            Thread.sleep(n);
            System.out.println("El hilo " + nombre +" tarda " + n + " segundos en terminar ");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        
        TestThread010 hilo1 = new TestThread010("Hilo 1");
        TestThread010 hilo2 = new TestThread010("Hilo 2");
        TestThread010 hilo3 = new TestThread010("Hilo 3");
        TestThread010 hilo4 = new TestThread010("Hilo 4");
        TestThread010 hilo5 = new TestThread010("Hilo 5");
        TestThread010 hilo6 = new TestThread010("Hilo 6");
        TestThread010 hilo7 = new TestThread010("Hilo 7");
        //Al ejecutarse desde el método run directamente, los hilos 1,2 y 3 se ejecutarán secuencialmente, es decir, en el mismo orden en
        //el que fueron lanzados
        hilo1.run();
        hilo2.run();
        hilo3.run();
        //Los hilos del 4 al 7 se ejecutarán de forma paralela, concurrentemente, su finalización dependerá
        //del tiempo que estarán durmiendo.
        hilo4.start();
        hilo5.start();
        hilo6.start();
        hilo7.start();
    }
}
