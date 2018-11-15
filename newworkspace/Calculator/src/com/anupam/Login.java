package com.anupam;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the user name:  ");
			String uname = sc.nextLine();

			System.out.println("Enter the password:  ");
			String psw = sc.nextLine();
			LoginData d = new LoginData();

			if (d.compare(uname, psw) == true) {
				System.out.println("Success");
				break;
			} else if (d.compare(uname, psw) == false) {
				continue;
			}
			System.out.println("Contact Admin");
		}

	}

}
