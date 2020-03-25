package coderprogramming.chapter02.synchronizedMethodLockObject2.src.extthread;


import coderprogramming.chapter02.synchronizedMethodLockObject2.src.extobject.MyObject;

public class ThreadA extends Thread {

	private MyObject object;

	public ThreadA(MyObject object) {
		super();
		this.object = object;
	}

	@Override
	public void run() {
		super.run();
		object.methodA();
	}

}
