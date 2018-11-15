package com.anupam;

public class LoginData {

	public boolean compare(String uname,String psw)
	{
			String username = "anupam";
			String password = "vishwakarma";
			if(username==uname && password==psw)
				return true;
			else
				return false;
	}
	
	
}
