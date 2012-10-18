public class HelloThread extends Thread{


	void hello(String msg) {
		while(true)
				System.out.println(msg);
		
	}
	
	public void run() {
		hello("thread");
	}
	
	public HelloThread() {
		start();
		hello("main");
	}
	
	public static void main(String[] args) {
		new HelloThread();

	}

}
