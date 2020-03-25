package coderprogramming.synLockIn_1.src.test;


import coderprogramming.synLockIn_1.src.extthread.MyThread;

public class Run {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
	}
}
