import static utils.Repetition.twice;

public class TestFive {
	private int x;
	public void foo() { 
		synchronized (this) {
			int current = x;
			x = current + 1;
			System.out.print(x + ", ");
		}
	}

	public void go() { 
		for(int i = 0; i < 5; i++) { 
			new Thread() { 
				public void run() { 
					foo();
				}
			}.start();
		}
	}
	
	//Main
	public static void main(String[] args) { 
		TestFive tf = new TestFive();
		tf.go();
	} 
} 