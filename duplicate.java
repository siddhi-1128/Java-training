import java.util.*;
class duplicate{
	public static void main(String[] args) {
		String[] arr=new String[]{"Siddhi","Kunal","Pradnya","Manu","Riya","Siddhi","Manu"};
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j]) && (i!=j))
				{
					System.out.println("Duplicates value :"+arr[j]);
				}
				
			}
		}
	}
}