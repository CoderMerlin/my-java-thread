package coderprogramming.chapter01.t12.src.test;



public class Run2 {
	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		System.out.println("ÊÇ·ñÍ£Ö¹1£¿=" + Thread.interrupted());
		System.out.println("ÊÇ·ñÍ£Ö¹2£¿=" + Thread.interrupted());
		System.out.println("end!");
	}
}
