abstract class test{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	void m4(){
		System.out.println("non=abstract method");
	}
}
class abstraction extends test{
	void m1(){
		System.out.println("abstract m1 method");
	}
	void m2(){
		System.out.println("abstract m2 method");
	}
	void m3(){
		System.out.println("abstract m3 method");
	}
	public static void main(String[] args) {
		abstraction a=new abstraction();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
	}
}