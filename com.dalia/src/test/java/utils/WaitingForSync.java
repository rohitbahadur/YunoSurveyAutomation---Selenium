package utils;

public class WaitingForSync {

	public void Wait() {
		wait(2000);
	}

	/* Overloaded method  */
	
	public void wait(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
		}
	}
}
