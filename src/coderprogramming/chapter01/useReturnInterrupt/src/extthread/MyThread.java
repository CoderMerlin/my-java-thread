package coderprogramming.chapter01.useReturnInterrupt.src.extthread;

public class MyThread extends Thread {

	@Override
	public void run() {
			while (true) {
				if (this.isInterrupted()) {
					System.out.println("Õ£÷π¡À!");
					return;
				}
				System.out.println("timer=" + System.currentTimeMillis());
			}
	}

}
