package coderprogramming.chapter02.twoObjectTwoLock.src.test;


import coderprogramming.chapter02.twoObjectTwoLock.src.extthread.ThreadA;
import coderprogramming.chapter02.twoObjectTwoLock.src.extthread.ThreadB;
import coderprogramming.chapter02.twoObjectTwoLock.src.service.HasSelfPrivateNum;

public class Run {

	public static void main(String[] args) {

		HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
		HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();

		ThreadA athread = new ThreadA(numRef1);
		athread.start();

		ThreadB bthread = new ThreadB(numRef2);
		bthread.start();

	}

}
