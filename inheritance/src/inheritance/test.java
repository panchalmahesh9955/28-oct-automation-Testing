package inheritance;

public class test {

	public static void main(String[] args) {
		
		son3 s3= new son3();
		s3.home();
		s3.car();
		s3.money();
		s3.mobile();
		s3.bike();
		s3.laptop();
		System.out.println();
		
		son2 s2= new son2();
		s2.home();
		s2.car();
		s2.money();
		s2.mobile();
		s2.bike();
		System.out.println();
		
		son1 s1= new son1();
		s1.home();
		s1.car();
		s1.money();
		s1.mobile();
		
	}

}
