/**
 * 
 * Creating a program that deadlocks using two synced objects 
 *  
 */
public class Starter {

	public static void main(String[] args) {
		
		SyncedObject s = new SyncedObject(0, "Synched1");
		SyncedObject s2 = new SyncedObject(100, "Synced2");
		
		s.setOther(s2);
		s2.setOther(s);
		
		Runner r1 = new Runner(s,10,"thread1");
		Runner r2 = new Runner(s2, -5,"thread2");
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		

	}

}
