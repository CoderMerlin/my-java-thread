package coderprogramming.synLockIn_2.src.extthread;


import coderprogramming.synLockIn_2.src.myservice.Sub;

public class MyThread extends Thread {
	@Override
	public void run() {
		Sub sub = new Sub();
		sub.operateISubMethod();
	}

}
