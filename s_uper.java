class person{
	void message(){
		System.out.println("I am in parent class");
	}
}
class child extends person{
	
	void message(){

		System.out.println("I am in child class ");
	}
	void display(){
		message();
		super.message();

	}
}
class s_uper{
	public static void main(String[] args) {
		child c=new child();
		c.display();
	}
}