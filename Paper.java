package Examination;

import java.util.ArrayList;

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
		for(Compoent c:list)
		{
			c.print();
			
		}
		
		
	}

}
