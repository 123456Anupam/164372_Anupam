import java.util.Scanner;


public class tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float tax;
		System.out.println("Enter the ctc");
		Scanner sc=new Scanner(System.in);
		
		float sal=sc.nextFloat();
		if(sal>=0 && sal<=180000)
		{ tax=0;
		System.out.println("Slab A");
		 System.out.println("Tax"+tax);
		}
		else if(sal>=181001 && sal<=300000)
		{
		 tax=(float)sal*(10/100);
		 System.out.println("Slab B");
		 System.out.println("Tax"+tax);
		}
		else if(sal>=300001 && sal<=500000)
		{
		 tax=(float)sal*(20/100);
		 System.out.println("Slab C");
		 System.out.println("Tax"+tax);
		}
		else if(sal>=500001 && sal<=1000000)
		{
		 tax=(float)sal*(30/100);
		 System.out.println("Slab D");
		 System.out.println("Tax"+tax);
		}
		
	}

}
