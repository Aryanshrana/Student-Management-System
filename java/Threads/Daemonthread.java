/*showing daemon threads
 * Daemon thread is a service provider thread that provide background services to other user threads. it life scope depends on user threads , jvm terminates it when all user threads are terminated.
 * it is low priority thread
 * it do works as garbage collection
 * .setDaemon and .isDaemon are its methods
 */
public class Daemonthread extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread is running");
        } else {
            System.out.println("user thread is running");
        }
    }

    public static void main(String[] args) {
        Daemonthread th1 = new Daemonthread();
        Daemonthread th2 = new Daemonthread();
        Daemonthread th3 = new Daemonthread();

        // never set a thread as daemon if it is already started otherwise it will
        // throww IllegalThreadStateException
        th1.start();
        th2.setDaemon(true);
        th2.start();
        th3.start();
    }
}
