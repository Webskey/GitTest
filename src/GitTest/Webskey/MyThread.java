package GitTest.Webskey;

/**
 * @author Webskey
 *
 */
public class MyThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("Thread started");
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread ended");
	}
}
