package coderprogramming.chapter01.t4_threadsafe.src.extthread;


import coderprogramming.chapter01.t4_threadsafe.src.controller.LoginServlet;

public class BLogin extends Thread {
	@Override
	public void run() {
		LoginServlet.doPost("b", "bb");
	}
}
