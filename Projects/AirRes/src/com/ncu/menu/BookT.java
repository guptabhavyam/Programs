package com.ncu.menu;
import java.util.*;
import java.io.*;
import com.ncu.main.*;          //To be able to back to menu after execution of this function
import com.ncu.validators.*;    //To be able to call validating functions & getLocationof Check class and GetLocation class 
public class BookT
{
	public void bookTickets()
	{
		Deletecmd d =new Deletecmd();   		 //Created an object for Delete Function
      	d.delete();								 //called the function to clear command prompt screen of any commands before
		Boolean vld;							 // To return true/false values of input data after being checked by validator
		Check ch=new Check();					//Creating object for calling validating function
		String names,source,destination;
		String phoneNo;
		int age,tickets;
		Scanner sc = new Scanner(System.in);
				
		while(10>9)               //Placing Infinite loops for data that need to be checked so that it asks for values repeately
		{
			System.out.print("\nEnter name:- ");
			names = sc.nextLine();
			vld=ch.name(names);        //Calling name function of check(validator) class to check name input for problems
			if(vld==true)              //if input data has no problem, vld==true and thus the loop gets breaked
			{
				break;                 //The loop will continue asking for data unless data is input in right format
			}
		}

		while(10>9)
		{
			System.out.print("\nEnter your age:- ");
			age=sc.nextInt();
			vld=ch.ageCheck(age);      //Calling ageCheck function of check(validator) class to check age input for problems
			if(vld==true)
			{
				break;
			}
		}

		while(10>9)
		{
			System.out.print("\nEnter phone number:- ");
			phoneNo = sc.next();
			vld=ch.noFormCheck(phoneNo);  //Calling No Format check function of check(validator) class to check 
			if(vld==true)                                                           //number input for problems
			{
				break;
			}
		}


		System.out.print("\nEnter Destination:- ");
		destination = sc.next();
		System.out.print("\nEnter the departure:- ");
		source =sc.next();
		
		while(10>9)
		{
			System.out.print("\nEnter no. of tickets:- ");
			tickets= sc.nextInt();
			vld=ch.ticCheck(tickets);    //Calling ageCheck function of check(validator) class to check age input for problems
			if(vld==true)
			{
				break;
			}
		}
		//ticket id
		Random random = new Random();        // Creating object of Random
   		int num = random.nextInt(100000);    // creating a random 5 digit no.
    	String ticketId = String.format("%05d", num); //Converting num to string
    	GetLocation loc = new GetLocation();//Creating an object for getlocation function which would get path of ticket file
		String f_loc = loc.getLocation();   //Inputing ticket info file path into a string by calling getLocation function
    	File f = new File(f_loc);           //Declaring file and its object and passing string containing path of data file
    	
    	try
    	{
    		BufferedWriter bw = new BufferedWriter(new FileWriter(f,true)); //Creating buffered Writer obj to write in csv file
			System.out.print("\nYour Ticket is confirmed\nYour TicketId is:- "+ticketId);// To let the user know id if they want to search by tickediD 
    		bw.newLine();        //Complication due to get location| Started writing next to last line and not below it.Thus had to include this
    		bw.write(ticketId+","+names+","+age+","+phoneNo+","+destination+","+source+","+tickets);//Writing data in csv format
    		bw.close(); //Closing Writer

    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
			System.out.println("\t\t==============================================");
			System.out.println("\t\t|                                            |");
			System.out.println("\t\t|          Flight Ticket Not Booked          |");
			System.out.println("\t\t|                                            |");
			System.out.println("\t\t==============================================");
    	}

    	
    	System.out.println("\nPress M to go back to Menu\nPress any other key to exit");
    	String ent=sc.next();
    	if((ent.equals("M"))==true)
    	{
    		AirRes menu=new AirRes();
    		String trash[]={"abc","def"}; //Trash array.Created only to parse the arguement of main function.Data of no value.
    		menu.main(trash);             //Calling main function. Also passing trash String array
    	}
  		else
  		{
    		d.delete();
    		System.out.println("\t\t==============================================");
			System.out.println("\t\t|                                            |");
			System.out.println("\t\t|                 Thank You!                 |");
			System.out.println("\t\t|                                            |");
			System.out.println("\t\t=============================================="); //Exiting the Programm
  		}

	}

}
