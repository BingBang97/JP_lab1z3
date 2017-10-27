package colections_pkg;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Functions{

	
	Set<String> set= new HashSet<>();
	Map<String,Integer> map = new HashMap<>();
	Scanner get=new Scanner(System.in);
	String name;
	
	

	public void setSet(String y)
	{long start=System.nanoTime();
		set.add(y);
		long stop=System.nanoTime();
		long time=stop-start;
		System.out.println("Umieszczono w czasie: "+time+" nano sekund.");
	}
	public void setMap(String x, Integer i)
	{long start=System.nanoTime();
		map.put(x, i);
		long stop=System.nanoTime();
		long time=stop-start;
		System.out.println("Umieszczono w czasie: "+time+" nano sekund.");
	}
	
	public Set<String> getSet()
	{
		return set;
	}
	public void showSet()
	{
		System.out.println(getSet());
	}
	public Map<String,Integer> getMap()
	{
		return map;
	}
	public void showMap()
	{
		System.out.println(getMap());
	}
	
	public void searchSet(String x)
	{
		 int test=0;String tofind;
			for(int i=0;i<set.size();i++)
			{tofind=set.iterator().next();
				if(Objects.equals(x,tofind))
				{
					System.out.println("Imie: "+x+" wystêpuje w zbiorze na pozycji: "+i);
					test++;
				}
			}
			if(test==0)
			{
				System.out.println("Imie: "+x+" nie wystêpuje w zbiorze.");
			}	
	}
	public void searchMap(String x)
	{
		if(map.get(x)==null)
		{
			throw new IllegalArgumentException("Wybrane imie nie istnieje w mapie!");
		}
		else
		System.out.println(x+" istnieje w mapie "+"ma "+map.get(x)+" lat.");
	}
}
