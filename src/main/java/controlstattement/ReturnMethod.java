package controlstattement;

public class ReturnMethod {

	public static void main(String[] args) {
		
		ReturnMethod ap=new ReturnMethod();
		int d=ap.sum();
		System.out.println(d);
	}
	public int sum()
	{
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}

}
