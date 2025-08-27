class var_arg2{
	void m1(int... a){
		System.out.println("Variable argument :"+a);
	}
	void m1(int a){
		System.out.println("Normal argument :"+a);
	}
	public static void main(String[] args) {
		var_arg2 v=new var_arg2();
		v.m1(10);
		v.m1(10,20);
		v.m1(10,20,30);
	}
}