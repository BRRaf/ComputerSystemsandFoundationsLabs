
public class SynchedObject {
	
	private int count;
	
	public SynchedObject() {
		count = 0;
	}
	
	// Taking the count variable and adding the change variable to it, and then printing it
	public synchronized int ChangeCount(int change) {
		
		count += change;
		
		System.out.println(count);
		
		return count;
		
	}
}
