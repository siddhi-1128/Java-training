class vehicle{
	int speed=170;
}
class car extends vehicle{
	int speed=120;
	void display(){
		System.out.println("Maximum speed is "+super.speed);
	}
}
class su_per{
	public static void main(String[] args) {
		car c=new car();
		c.display();
	}
}