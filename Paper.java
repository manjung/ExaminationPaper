package Examination;

import java.util.ArrayList;
import java.util.ListIterator;

public class Paper extends Compoent{

	ArrayList<Compoent>  list;
	
	public Paper()
	{
		list = new ArrayList<Compoent>();
	}
	
	public void addCompoent(Compoent c)
	{
		list.add(c);
	}
	
	@Override
	public void print() 
	{
		ListIterator <Compoent> iterator = list.listIterator();
		
		while(iterator.hasNext())
		{
			Compoent c = iterator.next();
			c.print();
		}
		
		
	}

	

}
