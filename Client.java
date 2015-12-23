package Examination;

public class Client 
{
	Question Q;
	Compoent[] cc;
	
	
	public static void main(String[] args)
	{
		Client cl = new Client();
		
		cl.Q = new Question("Q");
		
		cl.cc = new Paper[2];
		
		for(int i=0;i<2;i++)
		{
			cl.cc[i] = new Paper();
			cl.cc[i].addCompoent(cl.Q);
		}
		
		if(cl.cc != null)
		{
			cl.exam(cl.cc);
		}	
		
		
		
	}
	
	public void exam(Compoent[] cc)
	{
		
		for(Compoent c:cc)
		{
			c.print();
		}
		
	}
	
}
