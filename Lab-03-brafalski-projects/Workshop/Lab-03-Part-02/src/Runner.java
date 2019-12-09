
public class Runner implements Runnable {

	private SynchedObject s;
	
	private int change;
	
	public Runner(SynchedObject s, int change) {
		
		this.s = s; 
		this.change = change;
	}

	
	// Running the synced object method and stating that the change has happened	
	@Override
	public void run() {
		while(true) {
			
			System.out.println("changing the shared variable by " + change);
			
			s.ChangeCount(change);
			
		}
		
	}
	
	
	
}
