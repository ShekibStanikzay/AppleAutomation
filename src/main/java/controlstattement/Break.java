package controlstattement;

public class Break {

	public static void main(String[] args) {
	
		
		for ( int i=1;i<=8;i++)
		{
			if (i==5) {
				break;// Break terminate the program execution. here it print from 1 to 4 because we used Break method.
			}
			System.out.println(i);
		}
System.out.println("*************************");

		for ( int i=1;i<=8;i++)
		{
			if (i==5) {
				continue;// continue skip execution the number as above if(i==5). here it print from 1 to 8 but not 5.
			}
			System.out.println(i);
	}

}
}