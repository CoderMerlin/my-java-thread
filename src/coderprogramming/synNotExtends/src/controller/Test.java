package coderprogramming.synNotExtends.src.controller;


import coderprogramming.synNotExtends.src.extthread.MyThreadA;
import coderprogramming.synNotExtends.src.extthread.MyThreadB;
import coderprogramming.synNotExtends.src.service.Sub;

public class Test {

	public static void main(String[] args) {
		Sub subRef = new Sub();

		MyThreadA a = new MyThreadA(subRef);
		a.setName("A");
		a.start();

		MyThreadB b = new MyThreadB(subRef);
		b.setName("B");
		b.start();
	}

}
