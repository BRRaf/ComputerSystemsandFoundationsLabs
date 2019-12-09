
public class OppositeRunner  implements Runnable {

	
	private SyncedObject s;
	

	
	private int change;
	
	private String name;
	
	public OppositeRunner(SyncedObject s, int change, String name) {
		this.s = s;
		this.change = change;
		this.name = name;
		
		
		
	}
	
	// changing the secondary variable before using the main thread's object
	@Override
	public void run() {
		while(true) {
			
	
	if(s.getOther().getEntered() == false) {
		
		System.out.println("OPPOSITERUNNER STARTING");
		
		s.getOther().setEntered(true);
		s.printOtherCount();
		s.getOther().setEntered(false);
			
	}
	
	if(s.getEntered() == false) {
		s.setEntered(true);
		System.out.println("Starting to change "+s.getOther().getName());
		s.changeCount(change);
		System.out.println("finished changing "+ s.getOther().getName() +" now printing the other");
		System.out.println(name +" finished going through a round");
		s.setEntered(false);
	
			}
		}
	}
}
