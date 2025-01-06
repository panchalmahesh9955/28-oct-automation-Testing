package inheritance;

public class son1 extends father{
	
	public void mobile()
	{
		System.out.println("mobile");
	}
	public static void main(String[] args) {
		
		
		
		
		son1 s1= new son1();
		s1.home();
		s1.car();
		s1.money();
		s1.mobile();
	
	}

}
