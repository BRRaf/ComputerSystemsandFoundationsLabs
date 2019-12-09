import java.util.concurrent.Semaphore;

public class Sema {

	Semaphore s;
	
	int globalCount = 0;
	
	Sema other;
	
	public Sema() {
		
		s = new Semaphore(1);
		other = null;
	}
	
	// Taking the count variable, and adding it, and then printing the secondary object's variable
	public int ChangeCount(int change) {
		
		try {
		s.acquire();
		globalCount += change;
		System.out.println(globalCount);
		if (other != null) {
			other.ChangeCount(change);
			System.out.println(other.getCount());
		}
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
	
	public int getCount() {
		return globalCount;
	}
}
