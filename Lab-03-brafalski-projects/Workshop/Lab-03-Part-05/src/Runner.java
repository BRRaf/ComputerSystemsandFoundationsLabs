// printing the changing the main objects value and printing the other value
public class Runner implements Runnable {
	
	private SyncedObject s;
	
	private int change;
	
	private String name;
	
	public Runner(SyncedObject s, int change, String name) {
		this.s = s;
		this.change = change;
		this.name = name;
	}

	@Override
	public void run() {
		while(true) {
			s.changeCount(change);
			System.out.println("finished changing "+ s.getName() +" now printing the other");
			s.printOtherCount();
			System.out.println(name +" finished going through a round");
			
			
		}
		
	}
	
	
}
