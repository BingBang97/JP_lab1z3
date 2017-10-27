package colections_pkg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	Scanner get=new Scanner(System.in);
	Functions show = new Functions();
	Person toshow = new Person();
	int x=0;
	String name;
	Integer age;
	int choose;
	
	
	public void list(int x)
	{
	System.out.println("Wype³nianie listy imionami.");
	for(int i=0;i<x;i++)
	{
	name=setname();
	toshow.setList(new Person(name));
	}
	dialog();
	}
	
	public void set(int x)
	{int count=0;
		System.out.println("Wype³nianie zbioru imionami. ");
		while (count< x)
		{
		name=setname();
		show.setSet(name);
		count ++;
		}
		dialog();
	}
	public void map(int x)
	{
		System.out.println("Wype³nianie mapy imionami i wiekiem osob.");
		for(int i=0;i<x;i++)
		{
		age=setAge();
		name=setname();
		show.setMap(name,age);
		}
		dialog();
	}
	public String setname()
	{String s;
		System.out.println("Podaj imie: ");
		s=get.next();
		return s;
		
	}
	public Person createPerson(String name)
	{
		return new Person(name);
	}
	public Integer setAge()
	{
		Integer age;
		System.out.println("Podaj wiek osoby: ");
		age=get.nextInt();
		return age;
	}
	public void dialog()
	{ try{
		System.out.println("***MENU***");
		System.out.println("0 - zamknij program.");
		System.out.println("1 - wypelnienie listy.");
		System.out.println("2 - wypelnienie zbioru.");
		System.out.println("3 - wypelnienie mapy.");
		System.out.println("4 - wyswietlenie listy.");
		System.out.println("5 - wyswietlenie zbioru.");
		System.out.println("6 - wyswietlenie mapy.");
		System.out.println("7 - przeszukanie listy.");
		System.out.println("8 - przeszukanie zbioru.");
		System.out.println("9 - przeszukanie mapy.");
		System.out.println("Wybierz jedna z opcji: ");
		choose=get.nextInt();
	
		if(choose>=1 && choose<=3)
		{
		System.out.print("Ile pozycji chcesz dodac: ");
		x=get.nextInt();
		}
		
		switch(choose){
		case 0: System.exit(0);
		case 1: list(x); break;
		case 2: set(x); break;
		case 3: map(x); break;
		case 4: System.out.println("Wyswietlenie listy: "); toshow.showList(); dialog(); dialog(); break;
		case 5: System.out.println("Wyswietlenie zbioru: "); show.showSet(); dialog(); dialog(); break;
		case 6:System.out.println("Wyswietlenie mapy: "); show.showMap(); dialog(); break;
		case 7: System.out.println("Jakie imie chcesz wyszukac: "); name=get.next(); toshow.searchList(name); dialog(); break;
		case 8: System.out.println("Jakie imie chcesz wyszukac: "); name=get.next(); show.searchSet(name); dialog(); break;
		case 9: System.out.println("Jakie imie chcesz wyszukac: "); name=get.next(); show.searchMap(name); dialog(); break;
		default: break;
		}
	}
	catch(InputMismatchException e){System.out.println("Podaj poprawna wartosc z MENU!"); System.out.println("opcja: "); choose=get.nextInt();}
	}
}
