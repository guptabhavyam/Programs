package com.ncu.validators;
import com.ncu.exceptions.*; //to be able to throw exceptions created
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Check                               //To return true/ false value when returned
{
	Properties prop = new Properties();			 //Declaring object of properties and initialising
    FileInputStream input=null;					//Declaring object of FileInputStream
    String a;
	

	public boolean name(String pname) 	//function to validate name entered by user when booking ticket(passing name to be checked)
	{
		try
		{
			GetLocation loc = new GetLocation(); //Creating an object for getlocation class which would get path of properties file
			String p_loc = loc.getLocationP();  //Inputing properties file path into a string by calling getLocationP function
			input = new FileInputStream(p_loc);//Initialising FileInputStream and passing path of properties file
            prop.load(input);                  //Loading properties file
			nameForCheck(pname);                 //calling function of nameformat check(passing pname to as arguement)
		}
		catch(NameForEx s)    //catching NameForEx exception which we are throwing if conditions of nameForCheck are violated
		{
			a=prop.getProperty("NameForMs");  //accessing the message to be printed when this exception is thrown
			System.out.print("\n"+a);         //printing message obtained from properties file
			return false;                     //if NameForEx exception is caught, false is returned and thus loop will continue once 
			// 								 again forcing user to enter name again correctly as per conditions of nameForCheck
		}        						
		catch(Exception e)                    //To catch any other exception or problem 
		{
			System.out.println(e);           //Printing the exception or problem in try
			return false;					 //if exception is caught, false is returned and thus loop will continue once again
		}

		return true;                        //If no exception is caught,then true value would be returned thus breaking the loop of
		 //                                   of asking entry continuously

	}

	
	public boolean ageCheck(int age)   //function to validate age entered by user when booking ticket(passing age to be checked)
	{
		try
		{
			GetLocation loc = new GetLocation();
			String p_loc = loc.getLocationP();
			input = new FileInputStream(p_loc);
            prop.load(input);
			checkAge(age);     //calling function of age check(passing age to as arguement)
		}
		catch(TooOldEx s) //catching TooOldEx Exception which we are throwing if conditions of checkAge are violated
		{
			a=prop.getProperty("TooOldMs");
			System.out.print("\n"+a);
			return false;                  //if TooOldEx exception is caught, false is returned and thus loop will continue once 
			// 								 again forcing user to enter name again correctly as per conditions of checkAge
		}
		catch(TooYoungEx s)//catching TooYoungEx Exception which we are throwing if conditions of checkAge are violated
		{
			a=prop.getProperty("TooYoungMs");
			System.out.print("\n"+a);
			return false;                  //if TooYoungEx exception is caught, false is returned and thus loop will continue once 
			// 								 again forcing user to enter name again correctly as per conditions of checkAge
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}


		return true;
	}

	public Boolean noFormCheck(String pno) //function to validate phone no. entered by user when booking ticket(passing String pno to be checked)
	{
		try
		{
			GetLocation loc = new GetLocation();
			String p_loc = loc.getLocationP();
			input = new FileInputStream(p_loc);
			prop.load(input);
			checkNo(pno);  //calling function of phoneno check(passing String pno to as arguement)
		}
		catch(NoForEx s)          //catching NoForEx Exception which we are throwing if conditions of checkNo are violated
		{
			a=prop.getProperty("NoForMs");
			System.out.print("\n"+a);
			return false;           //if NoForEx exception is caught, false is returned and thus loop will continue once 
			// 								 again forcing user to enter name again correctly as per conditions of checkNo
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}

		return true;
	}

	public Boolean ticCheck(int tic) //function to validate numbers of ticket entered by user when booking ticket(passing tic to be checked)
	{
		try
		{
			GetLocation loc = new GetLocation();
			String p_loc = loc.getLocationP();
			input = new FileInputStream(p_loc);
			prop.load(input);
			checkTicQuan(tic);   //calling function of ticket quantity check(passing tic to as arguement)
		}
		catch(TooManyEx s)    //catching TooManyEx Exception which we are throwing if conditions of checkTicQuan are violated
		{
			a=prop.getProperty("TooManyMs");
			System.out.print("\n"+a);
			return false;                 //if TooManyEx exception is caught, false is returned and thus loop will continue once 
			// 								 again forcing user to enter name again correctly as per conditions of checkTicQuan
		}
		catch(TooLessEx s)  //catching TooLessEx Exception which we are throwing if conditions of checkTicQuan are violated
		{
			a=prop.getProperty("TooLessMs");
			System.out.print("\n"+a);
			return false;                 //if TooLessEx exception is caught, false is returned and thus loop will continue once 
			// 								 again forcing user to enter name again correctly as per conditions of checkTicQuan
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}

		return true;
	}

	public Boolean ticIdCheck(String id) //function to validate ticketId entered by user when searching by ticketId(passing id to be checked)
	{
		try
		{
			GetLocation loc = new GetLocation();
			String p_loc = loc.getLocationP();
			input = new FileInputStream(p_loc);
			prop.load(input);
			checkId(id);                    //calling function of checkId (passing String id to as arguement)
		}
		catch(TicIdEx s) //catching TicIdEx Exception which we are throwing if conditions of checkId are violated
		{
			a=prop.getProperty("TicIdMs");
			System.out.print("\n"+a);
			return false;       //if TicIdEx exception is caught, false is returned and thus loop will continue once 
			// 								 again forcing user to enter name again correctly as per conditions of checkId
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}

		return true;
	}






	
	void nameForCheck(String psname) throws NameForEx//function that may throw NameForEx when its conditions are violated by name entered
	{
		Pattern  patternGet = Pattern.compile("[@#$%^&(,)_]");//Selecting these pattern to match
        Matcher check = patternGet.matcher(psname);//matching the pattern with the name to find if they exist
        boolean checkV = check.find();             //whether characters in pattern exist in name(true/false value)
        String[] namesplit=psname.split(" ");      //Splitting the name by space to see if user entered a single name or name and surname, etc

		if(namesplit.length<=1 || namesplit.length>=5 || checkV==true)//if only one name is entered or more than 4 word name is entered or 
		        //                                            name has special characters , its conditions are violated  
		{
			throw new NameForEx("a");                  //since conditions are violated, NameForEx exception is thrown
		}
	}
	

	void checkAge(int age) throws TooOldEx,TooYoungEx//function that may throw TooOldEx & TooYoungEx when its conditions are violated by age entered
	{
		if(age<18)
			throw new TooYoungEx("b");    //since conditions are violated, TooYoungEx exception is thrown
		else if(age>100)                  
			throw new TooOldEx("c");      //since conditions are violated, TooOldEx exception is thrown
	}

	void checkNo(String pno) throws NoForEx //function that may throw NoForEx when its conditions are violated by pno
	{
		Pattern  patternGet = Pattern.compile("[@#$%^&(,)_aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ]");
        Matcher check = patternGet.matcher(pno);
        boolean checkV = check.find();
        if(checkV==true || pno.length()!=10)// if pno has anything except numbers or the digits are not equal to 10, conditions are violated 
        {
        	throw new NoForEx("d");// since conditions are violated, NoForEx exception is thrown
        }		
	}
	void checkTicQuan(int tic) throws TooManyEx,TooLessEx//function that may throw TooManyEx & TooLessEx when its conditions are violated by tic entered
	{
		if(tic>5)
			throw new TooManyEx("e"); // since conditions are violated, TooManyEx exception is thrown
		else if(tic<1)
			throw new TooLessEx("f");// since conditions are violated, TooLessEx exception is thrown
	}

	void checkId(String id) throws TicIdEx //function that may throw TicIdEx & TooLessEx when its conditions are violated by id entered
	{
		Pattern  patternGet1 = Pattern.compile("[@#$%^&(,)_aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ]");
        Matcher check1 = patternGet1.matcher(id);
        boolean checkV1 = check1.find();
		if(id.length()!=5 || checkV1==true)//  if digits are not eaqual to 5 or has anything else except numbers, conditions are violated
	        {
	        	throw new TicIdEx("g");// since conditions are violated, TicIdEx exception is thrown
	        }		
	}
}