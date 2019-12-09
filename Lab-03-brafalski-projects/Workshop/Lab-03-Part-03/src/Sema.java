import java.util.concurrent.Semaphore;

public class Sema {

	Semaphore s;
	
	int globalCount = 0;
	
	public Sema() {
		
		s = new Semaphore(1);
		
	}
	
	
	//taking the change and adding it to count and then printed.
	
	public int ChangeCount(int change) {
		
		try {
		s.acquire();
		globalCount += change;
		System.out.println(globalCount);
		s.release();
		return globalCount;
		
		} catch(InterruptedException e) {
			System.out.println("Fail");
			return -1;
		}
	}
}
