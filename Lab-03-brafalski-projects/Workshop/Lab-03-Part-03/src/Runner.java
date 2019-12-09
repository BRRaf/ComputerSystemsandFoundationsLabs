
public class Runner implements Runnable{
	
	private Sema s;
	
	private int change;
	
	public Runner(Sema s, int change) {
		this.s = s;
		this.change = change;
	}

// printing the start of the thread and using the method in the semaphore object.
	@Override
	public void run() {
		while(true) {
			System.out.println("Changing the shared semaphore variable amount by "+ change);
			s.ChangeCount(change);
		}
		
	}

}
