
public class Runner implements Runnable {
	
	private SyncedObject s;
	
	private boolean entered;
	
	private int change;
	
	private String name;
	
	public Runner(SyncedObject s, int change, String name) {
		this.s = s;
		this.change = change;
		this.name = name;
		this.entered = false;
	}

	
	//checking to see if the object is being used before running the object's methods
	@Override
	public void run() {
		while(true) {
			
				if(s.getEntered() == false) {
					s.setEntered(true);
					System.out.println("STARTING RUNNER ROUND");
					s.changeCount(change); s.printOtherCount();
					
					System.out.println(name+ " finished changing main, now printing other");

					
					s.setEntered(false);
					System.out.println("finished round for "+name);
				}
				
				
			
			
			}
			
		}
		
	}
	
	

