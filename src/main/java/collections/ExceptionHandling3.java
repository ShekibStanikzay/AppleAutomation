package collections;

public class ExceptionHandling3 {

	public static void main(String[] args) {
	
		
///NOTE: HERE WE HAVE 5 VALUSE IN OUR ARRAY LIST AND WE TRY TO PRINT 6 VALUE IN SYSOUT, SO IT SHOW EXCEPTION IN CONSOLE AFTER PRINTING FROM 10 TO 50. THERFORE, WE NEED TO USE TRY AND CATCH BLOCK TO COVER THR ERROR 
		try {
		
		int a[]= {10,20,30,40,50};
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		}
		catch(Exception e)
		{
		}
		}
		

	}


