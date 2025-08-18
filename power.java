class power{
	public static void main(String[] args) {
		int n=5;
		boolean a=false;
		for (int i=0;i<n;i++ ) {
			if(Math.pow(i,4)==n)
			{
				a=true;
				break;		
			}				
			

		}
		if(a==true)
		{
			System.out.println(true);

		}
		else
		{
			System.out.println(false);
		}
	}
}