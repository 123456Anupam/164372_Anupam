import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float simpleInterest,n,p,r,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of years");
		n=sc.nextFloat();
		System.out.println("Enter principle amount ");
		p=sc.nextFloat();
		System.out.println("Enter interest rate");
		r=sc.nextFloat();

		simpleInterest=(n*p*r)/100;
		float product=pow((1+r),n);
		float compoundInterest=(p*product)-1;;
		
		System.out.println("Simple Interest= "+simpleInterest);
		System.out.println("Compound Interest= "+compoundInterest);
		
		

	}

	private static float pow(float f, float g) {
		// TODO Auto-generated method stub
		return 0;
	}

}
