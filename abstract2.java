abstract  class test{
	abstract  void m1();
	abstract void m2();
	abstract void m3();
	void m4(){
		System.out.println("method m4");
	}
}
abstract class test1 extends test{
	void m1(){
		System.out.println("method m1");
	}
	
}
abstract class test2 extends test1{
	void m2(){
		System.out.println("method m2");
	}
} 
class abstract2 extends test2{
	void m3(){
		System.out.println("method m3");
	}
	public static void main(String[] args) {
		abstract2 a=new abstract2();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
	}
	
}