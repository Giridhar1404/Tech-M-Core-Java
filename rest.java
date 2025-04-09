package core;

import java.util.HashMap;
import java.util.Set;

public class rest {

	HashMap <String,Integer> menu=null;
	void rest()
	{
		menu = new HashMap <String,Integer>();
		menu.put("idli", 30);
		menu.put("dosa", 40);
		menu.put("upma", 50);
			
	}
	
	void display1()
	{
		Set<String> s= menu.keySet();
		for(String f:s)
		{
			System.out.println("Item name : "+f+ ", Price : "+menu.get(f));
		}
	}
	
	boolean additem(String d ,int k)
	{
		if(menu.containsKey(d))
		{
			System.out.println("Item already exist");
			return true;
		}
		else
		{
			menu.put(d, k);
			System.out.println("Item added successfully");
			return false;
		}
	}
}
