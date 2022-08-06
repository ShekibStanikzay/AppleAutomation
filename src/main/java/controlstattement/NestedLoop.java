package controlstattement;

public class NestedLoop {

	public static void main(String[] args) {
		for (int i=1;i<=9;i++)
		{
			for ( int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
				}
			System.out.println();
			
				}
		
		System.out.println("************************");
		
		
		for ( int m=5;m>=1;m--)
		{
			for (int o=5;o>=m;o--){
			System.out.print(o);
				System.out.println();
				
				System.out.println("************************");
				
				
			}
			for ( int n=1;n<=4;n++)
			{
				for ( int e=4;e>=n;e--)
			System.out.print(e+"    ");
				System.out.println();
			}
		}
			}
			}
		

	

