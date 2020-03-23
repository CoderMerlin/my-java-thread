package coderprogramming.chapter01.runMethodUseStopMethod.src.test.run;


import coderprogramming.chapter01.runMethodUseStopMethod.src.testpackage.MyThread;

public class Run {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
	}
}
