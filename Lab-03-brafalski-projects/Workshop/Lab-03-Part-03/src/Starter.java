
/*
 * Project lab 03 Part 3 that creates and uses threads to constantly change 
 * a single variable with a semaphore method
 * 
 */

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sema s = new Sema();
		
		Runner r1 = new Runner(s, 1);
		Runner r2 = new Runner(s, -5);
		Runner r3 = new Runner(s, 10);
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
