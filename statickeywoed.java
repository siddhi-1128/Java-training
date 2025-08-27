class statickeywoed{
	//static variable
	static int num=stasticmethod();
	//static block
	static{
		System.out.println("Inside static block");
	}
	//static method
	static int stasticmethod(){
		System.out.println("from static method");
		return 40;
	}
	//static main method
	public static void main(String[] args) {
		System.out.println("num : "+num);
		System.out.println("from main");
	}
}