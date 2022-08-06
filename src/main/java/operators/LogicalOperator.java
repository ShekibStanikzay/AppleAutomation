package operators;

public class LogicalOperator {
	public static void main(String[] args) {
		
		
		int a = 5;
		int b =3;
		int c= 20;
		int f=23;
		
		System.out.println((a>b)&&(f<b));  //true&&false---false
		System.out.println((a>b)&&(f>b)); //true&&true---true
		System.out.println((a<b)&&(f<b)); // false&&false=false
		System.out.println((a<b)&& (a>b));
		System.out.println("****************************************");
		System.out.println((a>b)||(f<b));  //true||false---true
		System.out.println((a>b)||(f>b));   //true||true----true
		System.out.println((a<b)||(f<b)); //false||false----false
	}
}
