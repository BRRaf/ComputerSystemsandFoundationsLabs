import java.util.concurrent.Semaphore;

public class Sema {

	Semaphore s;
	
	int globalCount = 0;
	
	Sema other;
	
	public Sema() {
		
		s = new Semaphore(1);
		other = null;
	}
	
	//changing the integer variable and printing the result
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
	
	public void setOtherSema(Sema other) {
		this.other = other;
	}
	
	public Sema getOtherSema() {
		return other;
		
	}
	
	public int getCount() {
		return globalCount;
	}
}
