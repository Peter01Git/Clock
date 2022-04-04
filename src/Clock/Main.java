package Clock;

public class Main implements Runnable {
	private Thread thread = null;
	int time;
	
	//constructor
	public Main() {
		thread = new Thread(this);
		thread.start();
		time = 0;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				time++;
				if(time == 60) {
					time = 0;
				}
				System.out.println(time);
				Thread.sleep(100);
			}
		} catch (Exception e) {
			
		}		
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
