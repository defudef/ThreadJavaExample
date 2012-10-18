public class HelloThread extends Thread{


	void hello(String msg) {
		while(true)
				System.out.println(msg);
		
	}
	
	public void run() {
		hello("Aaa");
	}
	
	public HelloThread() {
		start();
		hello("Bbb");
	}
	
	public static void main(String[] args) {
		new HelloThread();

	}

}
