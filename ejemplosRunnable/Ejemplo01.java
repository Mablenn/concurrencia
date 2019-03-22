/**
 *  Clase que lanzará tres threads dentro de su método main. Cada uno de ellos mostrará 100 veces
 *  un mensaje con su nombre.
 *  En la salida por consola podremos ver como estos no se ejecutan de forma secuencial, sino
 *  simultáneamente.
 *  
 */
package ejemplosRunnable;

public class Ejemplo01 implements Runnable{

	private String nombre;
	
	public Ejemplo01(String nombreHilo) {
		this.nombre = nombreHilo;
	}
	
	public void run() {
			for(int i =0; i<100; i++) {
				System.out.println("Ejecutándose el hilo: " + nombre);
			}
	}
	
	//Ejecutar la clase
	public static void main(String[] args) {
		//Instancia a dos threads, a los que se le pasa como parámetro
		//un objeto de la clase que hemos creado
		Thread hilo1 = new Thread(new Ejemplo01("HILO 1"));
		Thread hilo2 = new Thread(new Ejemplo01("HILO 2"));
		Thread hilo3 = new Thread(new Ejemplo01("HILO 3"));
		
		//Para que los hilos se ejecuten de forma concurrente
		//se deben ejecutar desde el método 'main()'
		hilo1.start();
		hilo2.start();
		hilo3.start();
	}
}
