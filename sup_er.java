class parent{
	parent(){
		System.out.println("I am in parent");
	}
	
}
class child extends parent{
	child(){
		super();
		System.out.println("I am in child ");
	}
}
class sup_er{
	public static void main(String[] args) {
		child cd = new child();

		
	}
}