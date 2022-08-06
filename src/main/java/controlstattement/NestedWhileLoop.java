package controlstattement;

public class NestedWhileLoop {

	public static void main(String[] args) {
		
int i=1;
while (i<=4)
{
	int j=4;
	while (j>=i)
	{
		System.out.print(j+"  ");
		j--;
	}
	System.out.println();
	i++;
	}
}
	}


