package coderprogramming.chapter01.t4_threadsafe.src.test;


import coderprogramming.chapter01.t4_threadsafe.src.extthread.ALogin;
import coderprogramming.chapter01.t4_threadsafe.src.extthread.BLogin;

public class Run {

	public static void main(String[] args) {
		ALogin a = new ALogin();
		a.start();
		BLogin b = new BLogin();
		b.start();
	}

}
