import java.util.scanner;
public class Password
{ 
	public static void main(String[] args) {
	{
	  String user_id="anupam";
	  String password="qwerty";
	  
	  Scanner sc=new Scanner(System.in);
	  Console.out.println("Enter Username");
	  String uname=sc.nextLine();
	  Console.out.println("Enter Password");
	  String pwd=sc.nextLine();
	  
	  for(i=0;i<2;i++)
	  {
	   if(pwd==password && uname==user_id)
	      {  Console.out.println("welcome "+uname);
		  }
		else