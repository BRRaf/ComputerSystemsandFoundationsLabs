/**
 * 
 * creating a situation that prevents deadlock by using two semaphore objects and two threads that interact 
 * with both semaphores values.
 * 
 * 
 *
 */
public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sema s1 = new Sema();
		Sema s2 = new Sema();
		
		s1.setOtherSema(s2);
		s2.setOtherSema(s1);
		
		Runner r1 = new Runner(s1, -82);
		Runner r2 = new Runner(s2, 5);
	
		
		Thread t1 = new Thread(r2);
		Thread t2 = new Thread(r1);
		
		
		t1.start();
		t2.start();
	
	}

}
