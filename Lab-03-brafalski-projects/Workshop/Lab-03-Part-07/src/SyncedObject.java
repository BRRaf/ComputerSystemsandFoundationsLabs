
public class SyncedObject {
	private int count;
	private String name;
	private boolean entered;
	private int objnum;
	private SyncedObject other;
	
	public SyncedObject(int count, String name, int objnum) {
		this.count = count;
		this.name = name;
		this.other = null;
		this.entered = false;
		this.objnum = objnum;
		
	}
	
	//telling the user which object is going to change, changing the main variable and printing it if the variable increases
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
	
	public SyncedObject getOther() {
		return other;
	}
	
	public synchronized void printMyCount() {
		System.out.println(name+"'s count = "+count);
	}
	
	public String getName() {
		return name;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int c) {
		count = c;
	}
	
	public synchronized void printOtherCount() {
		System.out.println(other.getName()+"'s count = "+other.getCount());
	}
	
	
	public void setEntered(boolean e) {
		entered = e;
	}
	
	public boolean getEntered() {
		return entered;
	}
	
	public int getObjnum() {
		return objnum;
	}
}
