package coderprogramming.chapter01.t4_threadsafe.src.extthread;


import coderprogramming.chapter01.t4_threadsafe.src.controller.LoginServlet;

public class ALogin extends Thread {
	@Override
	public void run() {
		LoginServlet.doPost("a", "aa");
	}
}
