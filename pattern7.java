class pattern7
{
	public static void main(String[] args) 
	{
		int i,j,m;
		for(i=1;i<=4;i++)
		{
			for(m=1;m<=4;m++)
			{
				System.out.print(" ");
				
			}
			for(j=1;j<=i;++j)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}