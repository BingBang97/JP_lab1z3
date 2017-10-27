package colections_pkg;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Person {
	List<Person> list = new LinkedList();
	static String name;
	
	public Person(String pname)
	{
		this.name=pname;
	}
	public void setname(String pname)
	{
		name=pname;
	}
	public static String getname(){return name;}
	
	public void setList(Person x)
	{	long start = System.nanoTime();
		list.add(x);
		long stop=System.nanoTime();
		long time=stop-start;
		System.out.println("Umieszczono w czasie: "+time+" nano sekund.");
	}
	public List<Person> getList()
	{
		return list;
	}
	public void showList()
	{
		for(int i=0;i<list.size();i++)
		{
			 String temp=getList().get(i).toString();
			System.out.println("Osoba nr."+i+" "+temp);
		}
	}
	public void searchList(String x)
	{ int test=0;Person tofind;
		for(int i=0;i<list.size();i++)
		{tofind=list.get(i);
			if(Objects.equals(x,tofind))
			{
				System.out.println("Imie: "+x+" wystêpuje w liscie na pozycji: "+i);
				test++;
			}
		}
		if(test==0)
		{
			System.out.println("Imie: "+x+" nie wystêpuje w liscie.");
		}
	}
	public Person() {}
	
}
