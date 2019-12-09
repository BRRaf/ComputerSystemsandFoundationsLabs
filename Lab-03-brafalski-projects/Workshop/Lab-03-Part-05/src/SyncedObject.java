
public class SyncedObject {
	private int count;
	private String name;
	private SyncedObject other;
	
	public SyncedObject(int count, String name) {
		this.count = count;
		this.name = name;
		this.other = null;
		
	}
	
	public synchronized int changeCount(int change) {
		System.out.println("changing "+name+" by "+count);
		count += change;
		if(change > 0) {
			System.out.println(count);
		}
		return count;
	}
	
	public void setOther(SyncedObject other) {
		this.other = other;
	}
	
	public synchronized void printMyCount() {
		System.out.println(name+"'s count = "+count);
	}
	
	public synchronized String getName() {
		return name;
	}
	
	public synchronized int getCount() {
		return count;
	}
	
	public synchronized void printOtherCount() {
		System.out.println(other.getName()+"'s count = "+other.getCount());
	}
	
	
}
