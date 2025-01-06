package inheritance;

public class son2 extends son1{
	
	public void bike()
	{
		System.out.println( "bike");
	}
public static void main(String[] args) {
	

	
	son2 s2= new son2();
	s2.home();
	s2.car();
	s2.money();
	s2.mobile();
	s2.bike();
	System.out.println();
	
}
}