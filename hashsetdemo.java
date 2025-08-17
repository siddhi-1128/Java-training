import java.util.*; 
class hashsetdemo{
	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String>();
		h.add("s");
		h.add("b");
		h.add("o");
		h.add("d");
		h.add("z");
		Iterator<String> itr=h.iterator();
		while (itr.hasNext()) {
			String str=itr.next();
			System.out.println(str);
		}
		System.out.println(h);
	}
}