interface abc{
	public void show();
}
class pqr{
	static int i=20;
}
class interface3 extends pqr implements abc{
	public void show(){
		System.out.println("I am in abc");
	}
	public static void main(String[] args) {
		abc a;
		interface3 i3=new interface3();
		a=i3;
		a.show();
		System.out.println(i);
	}
}