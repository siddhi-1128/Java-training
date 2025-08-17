class A{
	public void showA(){
	 	System.out.println("I am in show A");
	 }
}
class B extends A{
	public void showB(){
		System.out.println("I am in show B");
	}
}
class C extends A{
	public void showC(){
		System.out.println("I am in show C");
	}
}
class hierarchy{
	public static void main(String[] args) {
		B b=new B();
		C c=new C();
		b.showA();
		b.showB();
		c.showC();
		c.showA();
	}
}