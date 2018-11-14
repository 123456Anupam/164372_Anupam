import java.util.Scanner; 
public class Tax
{ 
	public static void main(String[] args) {
		float tax;
	Scanner sc=new Scanner(System.in)
	System.out.println("Enter the ctc");
	int sal=sc.nextInt();
	if(sal>=0 && sal<=180000)
	{ tax=0;
	System.out.println("Slab A");
	 System.out.println("Tax"+tax);
	}
	if(sal>=181001 && sal<=300000)
	{
	 tax=sal*(10/100);
	 System.out.println("Slab B");
	 System.out.println("Tax"+tax);
	}
	if(sal>=300001 && sal<=500000)
	{
	 tax=sal*(20/100);
	 System.out.println("Slab C");
	 System.out.println("Tax"+tax);
	}
	if(sal>=500001 && sal<=1000000)
	{
	 tax=sal*(30/100);
	 System.out.println("Slab D");
	 System.out.println("Tax"+tax);
	}
	
	
	}
}