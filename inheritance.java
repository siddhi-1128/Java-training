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
class inheritance{
	public static void main(String[] args) {
		B b=new B();
		b.showA();
		b.showB();
	}
}