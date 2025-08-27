class rectangle{
	int len,bre,area;
	public rectangle(int l,int b){
		len=l;
		bre=b;
	}
	public void area(){
		area=len*bre;
		System.out.println("Area of rectangle :"+area);
	}
}
class rect_area{
	public static void main(String[] args) {
		rectangle r1=new rectangle(4,5);
		r1.area();
		rectangle r2=new rectangle(5,8);
		r2.area();
	}
}