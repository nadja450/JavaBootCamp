package sef.module8.activity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.


public class CustomExceptionActivityTest {
	
	
	public static void main(String[] args) { 
		
		
		CustomExceptionActivityTest obj = new CustomExceptionActivityTest();
		
		obj.validateUser("Mike");
		
		try { obj.setUsername ("Mike");}
		
		catch (CustomExceptionActivity c) {
			System.out.println (c.getMessage());
		}
	}
		

		//1 - Type main method and call validateUser() from it.
		
	//Call this method with different names to test it 
	

    int validateUser(String name)
    { 
	 
	//array of names
        String []validUsers={"John","Mike","Shanti","Stacie"};

       int flag=0; //flag stores 1 if a match is found else it should remain 0 
       for(int i=0;i<4;i++);
       
       if (validUsers[0]==name)
       {
    	   flag=1;
       }
       
       else if (validUsers[1]==name) 
       {
           flag=1;
        
       }
	
       else if (validUsers[2]==name)
	   {
    	   flag=1;
    
       }
	   else if (validUsers[3]==name) 
       {
           flag=1;
       }
	   
	   else 
	   {
    	   flag=0;
    	 
       }
       return flag;
	         }
//2 - Write code to check if parameter name contains a value which is found in validUsers array and change flag's value accordingly 


//3 - check if flag is zero, throw CustomExceptionActivity Exception.
//You may also have to declare this exception in the method call using throws.
void setUsername (String username) throws CustomExceptionActivity{
	
//4 - else if flag is one, print a message "Welcome to Payroll program". 
int flag=validateUser(username);
if (flag==0) {
throw new CustomExceptionActivity ();
}
else { 

		System.out.println ("Welcome to Payroll program");
		
}
}
	}
