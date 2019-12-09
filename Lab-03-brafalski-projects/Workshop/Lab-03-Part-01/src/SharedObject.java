
public class SharedObject {

	private int count;
	
	public SharedObject() {
		this.count = 0;
		
		
	}

//taking a value and changing it by the appropriate amount and then printing it
	
	public int ChangeCount(int change) {
		
		count += change;
		
		System.out.println(count);
		
		return count;
	}
}
