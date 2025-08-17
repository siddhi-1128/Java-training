interface l1{
	void show1();
}
class abc implements l1{
	void show2(){
		System.out.println("Show 2");
	}
	public void show1(){
		System.out.println("Show 1");
	}
}
class interface1{
	public static void main(String[] args) {
		abc ob=new abc();
		ob.show2();
		ob.show1();
	}
}