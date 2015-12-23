package Examination;

class Question extends Compoent 
{
	String description;
	
	public Question(String desc) 
	{
		 this.description = desc;
	}
	
	public void print() 
	{
		System.out.println(description);
	}

	@Override
	public void addCompoent(Compoent c) {
	}
		 
		    
}
