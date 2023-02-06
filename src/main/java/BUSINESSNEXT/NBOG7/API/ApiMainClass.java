package BUSINESSNEXT.NBOG7.API;

public class ApiMainClass {

	
	public static void main(String args[])
	
	{
		TokenGeneration token=new TokenGeneration();
		AMLServicesForLead aml=new AMLServicesForLead();
		AMLServicesForContact1 con1=new AMLServicesForContact1();
		AMLServicesForContact2 con2=new AMLServicesForContact2();
		token.Token();
		aml.AMLServicesCall();
		con1.AMLServicesCallCont1();
		
		
	}
	}
