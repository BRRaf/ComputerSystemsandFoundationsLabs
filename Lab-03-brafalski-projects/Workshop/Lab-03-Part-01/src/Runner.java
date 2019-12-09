
public class Runner implements Runnable {

	private SharedObject s;
	private int change;
	
	public Runner(SharedObject s, int change) {
		
		this.s = s;
		this.change = change;
		
	}
	
// Running the synced object method and stating that the change has happened
	@Override
	public void run() {
		while(true) {
			
			s.ChangeCount(change);
			
			System.out.println("changing the shared variable by "+ change);
			
		}
		
	}

}
