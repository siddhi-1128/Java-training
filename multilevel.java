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
class C extends B{
	public void showC(){
		System.out.println("I am in show C");
	}
}
class multilevel{
	public static void main(String[] args) {
		C c=new C();
		c.showA();
		c.showB();
		c.showC();
	}
}