package coderprogramming.chapter01.t17.src.test;


import coderprogramming.chapter01.t17.src.extthread.MyThread;

public class Run {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
	}

}
