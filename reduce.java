import java.util.*;
class reduce{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.next();
		String name="";
		int i,j,count=1;
		for(i=0,j=i+1;i<str.length()-1;i++,j++){
			if(str.charAt(i)==str.charAt(j)){
				count++;
			} 
			else
			{
				name=name+str.charAt(i)+count;
				count=1;
			}
			// if(count>1)
			// {
			// 	System.out.print(str.charAt(j)+""+count);
			// }
			// else{
			System.out.print(name);
			// }
		}
	}
}