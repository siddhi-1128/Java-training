class calculator{
	int a,b,c;
	int peri,area;
	public calculator(){
		a=4;
		b=5;
		c=6;
	}
	public void perimeter(){
		peri=a+b+c;
		System.out.println("Perimeter is "+peri);
	}
	public void area(){
		area=(a*b)/2;
		System.out.println("Area is "+area);
	}
}
class triangle{
	public static void main(String[] args) {
		calculator c=new calculator();
		c.perimeter();
		c.area();
	}
}