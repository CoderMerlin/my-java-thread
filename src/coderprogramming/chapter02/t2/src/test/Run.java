package coderprogramming.chapter02.t2.src.test;


import coderprogramming.chapter02.t2.src.extthread.ThreadA;
import coderprogramming.chapter02.t2.src.extthread.ThreadB;
import coderprogramming.chapter02.t2.src.service.HasSelfPrivateNum;

public class Run {

	public static void main(String[] args) {

		HasSelfPrivateNum numRef = new HasSelfPrivateNum();

		ThreadA athread = new ThreadA(numRef);
		athread.start();

		ThreadB bthread = new ThreadB(numRef);
		bthread.start();

	}

}
