package core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class library {
	
	List<song> songs;
	song s=new song("come on","Thaman");
	song s1=new song("Fear", "Anirudh");
	song s2=new song("Butta bomma", "Armaan malik");
	song s3=new song("maguva", "Sid sriram");
	song s4=new song("Gaali valuga","Anirudh");
	

	public library() {
		
		songs=new ArrayList<>();
		songs.add(s);
		songs.add(s1);
		songs.add(s2);
		songs.add(s3);
		songs.add(s4);
		
	}
	
	void addsong(String Songname,String Artist)
	{
		song s6=new song(Songname, Artist);
		songs.add(s6);
		display();
	}
	
	void removesong(String sname)
	{
		for(song x:songs)
		{
			if(x.Songname.equals(sname))
			{
				songs.remove(x);
				System.out.println("song deleted successfully");
				break;
			}
			
		}
		display();
	}
	
	
	void display()
	{
		for(song x: songs)
		{
			System.out.println(x);
		}
		
	}
	
	void random()
	{
		Random r=new Random();
		int i=r.nextInt(songs.size());
		System.out.println(songs.get(i));
	}
	

}
