package dayFirstClass;

public class Ploymorphisam {

	public static void main(String[] args) {
	
		Ploymorphisam pl = new Ploymorphisam();
		pl.car( );
		pl.car(30);
pl.car("Bus",   50);

	}
	public void car()
	{
		System.out.println("car doesnt contain any size");
	}
	public void car( int person)
	{
		System.out.println("total nomber of persons can journey"  +person);
		
	}
	public void car ( String carname, int person)
	{
		System.out.println(" car name is"  +carname);
		System.out.println("total number of persons can travel"  +person);
		
	}
}
