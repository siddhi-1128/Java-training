class static3{
	static{
		System.out.println("I am in block 1");
	}
	static{
		System.out.println("I am in block 2");
	}
	public static void main(String[] args) {
		System.out.println("I am in main");
	}
	static{
		System.out.println("I am in block 3");
	}
}