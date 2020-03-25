package coderprogramming.synNotExtends.src.extthread;


import coderprogramming.synNotExtends.src.service.Sub;

public class MyThreadA extends Thread {

	private Sub sub;

	public MyThreadA(Sub sub) {
		super();
		this.sub = sub;
	}

	@Override
	public void run() {
		sub.serviceMethod();
	}

}
