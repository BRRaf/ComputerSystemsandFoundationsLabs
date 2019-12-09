/*
 * Preventing synchronized deadlock by programming a form of Peterson's Solution
 */
public class Starter {

	public static void main(String[] args) {
		
		SyncedObject s = new SyncedObject(0, "Synched1",1);
		SyncedObject s2 = new SyncedObject(100, "Synced2",2);
		
		s.setOther(s2);
		s2.setOther(s);
		
		Runner r1 = new Runner(s,10,"thread1");
		OppositeRunner r2 = new OppositeRunner(s2, -5,"thread2");
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		

	}

}
