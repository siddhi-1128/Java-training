class blank_final_var{
	final int max;
	blank_final_var(){
		max=120;
	}
	void me(){
		System.out.println(max);
	}
	public static void main(String[] args) {
		blank_final_var obj=new blank_final_var();
		obj.me();
	}
}