class static2{
	{
		System.out.println("I am in non static block");
	}
	static{
		System.out.println("I am in static block");
	}
	public static void main(String[] args) {
		static2 st=new static2();
		System.out.println("I am in main");	
	}
}