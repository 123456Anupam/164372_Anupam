import java.util.Scanner;


public class Result {

	public static void main(String[] args) {
		int marks1,marks2,marks3;
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of first subject");
		marks1=sc.nextInt();
		System.out.println("Enter marks of second subject");
		marks2=sc.nextInt();
		System.out.println("Enter marks of third subject");
		marks3=sc.nextInt();
		float res=(marks1+marks2+marks3)/3;
		
	if(marks1>60 && marks2>60 && marks3>60)
		System.out.println("PAssed");
	else if((marks1>60 && marks2>60) || (marks2>60 && marks3>60) || (marks3>60 && marks1>60))
		System.out.println("Promoted");
	else if(res<60)
		System.out.println("Failed");

	}

}
