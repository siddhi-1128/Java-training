class test{
	void add(int a,int b){
		System.out.println("addition is "+(a+b));
	}
	void add(int a,int b,int c)
	{
		System.out.println("addition is "+(a+b+c));
	}
	void add(int a,int b,int c,int d)
	{
		System.out.println("addition is "+(a+b+c+d));
	}
	
}
class overloading{
	public static void main(String[] args) {
		test t=new test();
		t.add(10,20);
		t.add(10,20,30);
		t.add(10,20,30,40);
	}
	
}