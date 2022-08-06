package controlstattement;

public class TwoDArray {

	public static void main(String[] args) {
		
		int [] [] t = {{1,2,3},{4,5,6},{7,8,9}};
		for ( int i=0;i<t.length;i++) {
			for ( int j=0; j<t[i].length;j++)
			{
		System.out.print(t [i] [j]+" ");
			}
		System.out.println();
		}
		

		
		String [] [] name= {{"rama","krishna"},{"sita","hari"}, {"anil","mary"}};
		for (int e = 0; e<name.length;e++)
		{
			for ( int k=0;k<name[e]. length;k++)
		
				System.out.println(name[e][k]+ "  ");
				{
					System.out.println();
				}
		}
	}
}
		
		
