package ejemplosThread;

/**
 *
 * @author renton
 */
public class ThreadTest03 extends Thread {
    
    static String mensaje[] = {"Este","es", "el", "texto", "que", "saldrá", "por", "consola"}; 
    
    public ThreadTest03(String id){
        super(id);
    }
    
    public void run(){
        String nombreHilo = getName();
        for (int i = 0; i < mensaje.length; ++i) {
            try {
                sleep( (long)(1500 * Math.random()) );
                System.out.println( nombreHilo + mensaje[i]);
            } catch (Exception e) {
                System.out.println("Interrumpido el hilo");
            }
        }
    }//run()
    
    
    //============================================================================= //
    public static void main(String[] args) {
        ThreadTest03 hilo1 = new ThreadTest03(("Hilo 1: "));
        ThreadTest03 hilo2 = new ThreadTest03(("Hilo 2: "));
        
        boolean hilo1Ejecutandose = true;
        boolean hilo2Ejecutandose = true;
        
        hilo1.start();
        hilo2.start();
        
        while ( hilo1Ejecutandose || hilo2Ejecutandose ){
            if( hilo1Ejecutandose && !hilo1.isAlive() ){
                hilo1Ejecutandose = false;
                System.out.println("Termina el hilo: " + hilo1.getName());
            }
        
            if( hilo2Ejecutandose && !hilo2.isAlive() ){
                hilo2Ejecutandose = false;
                System.out.println("Termina el hilo " + hilo2.getName());
            }
        } // while
    } // main
} // Fin clase
