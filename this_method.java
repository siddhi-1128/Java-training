class data{
	int a,b;
	data(){
		this(10,20);
	}
	data(int x,int y){
		a=x;
		b=y;
		this.show();
	}
	void show(){
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	
}
class this_method{
	public static void main(String[] args) {
		data d1=new data();
		data d2=new data(100,200);		
	}
}
