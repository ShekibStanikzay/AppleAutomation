package collections;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		
	try {	//// if we remove try from here then we see error. so we want to use try catch block to handle the exception.
		/// we put 0 value to int u, then we will see error in console.
		int i=78;
		 int u=5;
		 int k=i/u;
		 System.out.println(k);
	}
	catch ( Exception e ) {
		
	}
	}

}
