<h1>Concurrencia en Java</h1>
<p>Aplicada a la informática, la concurrencia o multitarea se conoce como la facultad que posee una máquina para ejecutar varias tareas a la vez. Objetivamente, la concurrencia solamente es posible en equipos con más de un procesador. En cambio, en equipos de un solo procesador, esto se consigue repartiendo el tiempo de CPU uniformemente entre varios procesos para que se ejecuten de forma simultánea.</p>
<p>En Java, las tareas se ejecutan de forma simultánea, se denominan threads (hilos). Un thread no es más que una clase que hereda de la clase Thread y sobreescribe su método run(), donde se escribirá el código con las instrucciones de la tarea que el hilo debe llevar a cabo.</p>
<h2>Crear un thread implementando la interfaz Runnable.</h2>
<p>Ejemplos en el paquete ejemplosRunnable.</p>
<h2>Crear un thread a partir de una clase que herede de la clase Thread.</h2>
<p>Ejemplos en el paquete ejemplosThread.</p>
<h2>Método sleep().</h2>
<p>Durante la ejecución de un thread, puede que por necesidades de la aplicación, necesitemos pararlo durante un periodo de tiempo para después reanudarlo. Para ello disponemos del método sleep(), que duerme un thread dejándolo sin consumir CPU. Este método recibe como parámetros un entero, que será el tiempo, en milisegundos, que estará durmiendo. Una vez termine este tiempo, el thread continuará con su ejecución.</p>
<h2>Método yield().</h2>