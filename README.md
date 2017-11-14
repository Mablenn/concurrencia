<h1>Concurrencia en Java</h1>
<p>En Java, para conseguir que varias tareas se ejecuten de forma simultánea, tenemos los threads (hilos). Un thread no es más que una clase que hereda de la clase Thread y sobreescribe su método run(), donde se escribirá el código con las instrucciones de la tarea que el hilo debe llevar a cabo.</p>
<h2>Crear un Thread</h2>
<p></p>
<h2>Método sleep()</h2>
<p>Durante la ejecución de un thread, puede que por necesidades de la aplicación, necesitemos pararlo durante un periodo de tiempo para después reanudarlo. Para ello disponemos del método sleep(), que duerme un thread dejándolo sin consumir CPU. Este método recibe como parámetros un entero, que será el tiempo, en milisegundos, que estará durmiendo. Una vez termine este tiempo, el thread continuará con su ejecución.</p>
<h2>Método yield()</h2>