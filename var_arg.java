class var_arg{
	void m1(int... n){
		System.out.println("Siddhi");
	}
	public static void main(String[] args) {
		var_arg v=new var_arg();
		v.m1();
		v.m1(10);
		v.m1(10,20);
		v.m1(10,20,30);
	}
}