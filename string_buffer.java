class string_buffer{
	public static void main(String[] args) {
		String s="Siddhi";
		StringBuffer s1=new StringBuffer(s);
		System.out.println(s1);
		StringBuffer s2=new StringBuffer("Siddhi");
		String t=s2.toString();
		System.out.println(t);
	}
}