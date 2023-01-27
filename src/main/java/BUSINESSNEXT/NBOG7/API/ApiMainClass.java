package BUSINESSNEXT.NBOG7.API;

public class ApiMainClass {

	
	public static void main(String args[])
	
	{
		TokenGeneration token=new TokenGeneration();
		AMLServices aml=new AMLServices();
		
		token.Token();
		aml.AMLServicesCall();
		
		
	}
	}
