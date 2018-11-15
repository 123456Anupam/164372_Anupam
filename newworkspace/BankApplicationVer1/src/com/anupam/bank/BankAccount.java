package com.anupam.bank;//collection of logical classes

public class BankAccount {

	//static variable
private static int autoAccountNo;
	
	//instance variable / class variable we cant use intance variable if object is not created/exist
private int accountNo;
private String accountHolderName;
private double accountBalance;

//init block reduces redundancy it gets executed before constructor
{  
	accountNo=++autoAccountNo;
}
//job of constructor is initializing class variable/instance variable
//Default Constructor
public BankAccount(){

	accountHolderName="Unknown";
	accountBalance=0;

}
// Parametrized Constructor
public BankAccount(String accountHolderName,double accountBalance){
	
	
	this.accountHolderName=accountHolderName;
	this.accountBalance=accountBalance;
	
} 
// set is used to modify the existing value/reintialise member variable 
 public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}

 public double getAccountBalance() {
	return accountBalance;
}
 public int getAccountNo() {
	return accountNo;
}
 public String getAccountHolderName() {
	return accountHolderName;
}
 public void withdraw(double amount){
	 
	 this.accountBalance-=amount;
 }
 
 public void deposit(double amount)
 {   if(amount<0)
      System.out.println("Enter a correct Amount");
 	if(amount>accountBalance)
     System.out.println("Enter a correct Amount");
 	else
	 this.accountBalance+=amount;
 	  System.out.println("BAlance"+accountBalance);
 }
 
public static void main(String[] args){
	BankAccount acc=new BankAccount();
	BankAccount acc2=new BankAccount("Onkar",5000);
	acc2.deposit(2000);
}
}



