package coderprogramming.chapter01.t6.src.run;


import coderprogramming.chapter01.t6.src.mythread.MyThread;

public class Run2 {
	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		mythread.start();
		//mythread.run();
	}
}
