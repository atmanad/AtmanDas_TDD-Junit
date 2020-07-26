package com.atman.task_tdd_junit;

public class RemoveChar {
	public String remove(String string) {
		if(string.equals(""))
			return string;
		if(string.length()==1)
			if(string.equals("A"))
				return "";
			else
				return string;
		if(string.length()==2) {
			if(string.charAt(0)=='A') {
				if(string.charAt(1)=='A')
					return "";
				else
					return string.substring(1);
			}
			if(string.charAt(1)=='A')
				return Character.toString(string.charAt(0));
				
			
		}
		if(string.charAt(0)=='A') {
			string = string.substring(1);
			if(string.charAt(0)=='A')
				string = string.substring(1);
		}
		else
			if(string.charAt(1)=='A')
				string = string.substring(0,1)+string.substring(2);
		
		return string;
	}


}
