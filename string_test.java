class string_test{
	public static void main(String[] args) {
		String t1="Siddhi";
		String t2="Siddhi";
		System.out.println(t1==t2);
		string_test s1=new string_test();
		string_test s2=new string_test();
		System.out.println(s1==s2);
		String m1=new String("help4code");
		String m2=new String("help4code");
		System.out.println(m1==m2);	
	}
}