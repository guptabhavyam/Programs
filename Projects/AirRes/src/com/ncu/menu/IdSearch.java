package com.ncu.menu;
import java.util.*;
import java.io.*;
import com.ncu.main.*;         //To be able to go back to menu after execution of this function
import com.ncu.validators.*;   //To be able to call validating functions & getLocation of Check class and GetLocation class 

public class IdSearch
{
	public void idSearch()
	{
		Deletecmd d =new Deletecmd();  			//Created an object for Delete Function
      	d.delete();								//called the function to clear command prompt screen of any commands before
		Scanner s = new Scanner(System.in);
		Check ch=new Check();					//Creating object for calling validating function
		String ticketId;
		while(10>9) 			//Placing Infinite loops for data that need to be checked so that it asks for values repeately
		{
			System.out.print("Enter the Ticket Id:- ");
			ticketId = s.next();
			Boolean vld=ch.ticIdCheck(ticketId);//Calling name function of check(validator) class to check name input for problems
			if(vld==true)						//if input data has no problem, vld==true and thus the loop gets breaked
			{
				break;						 //The loop will continue asking for data unless data is input in right format
			}
		}
		GetLocation loc = new GetLocation(); //Creating an object for getlocation function which would get path of ticket file
		String f_loc = loc.getLocation();    //Inputing ticket info file path into a string by calling getLocation function
		File f=new File(f_loc);				//Declaring file and its object and passing string containing path of data file
		try
		{
			FileReader fr;                 //Declaring file reader object
			fr= new FileReader(f);			//Initialising filereader
			BufferedReader br = new BufferedReader(fr);  //Declaring and initialising Buffered Reader
			String data;
			String head=br.readLine();     //Seprating headings from mainstream data and feeding it to String 
			String[] headline=head.split(",");//Splitting headings and storing them in headline array
			int i=0;                            
			while((data=br.readLine())!=null) //creating loop that will start reading data after headings and finish after file is completely read
			{                                 //storing each ticket info in data String one at a time as loop progresses
				String[] data1 = data.split(",");//Splitting ticket info into data1 array
				if((data1[0].equals(ticketId))==true)//at 0 location of array,file gave the ticket id stored which we are comparing to the ticket id user has enturned now
				{
					i++;
					int l=0;                  //Int declared to determine whether the name associated with matched ticked id is of more than 16char or not
					if(data1[1].length()>=16)
						l=1;
					for(int j=0;j<headline.length;j++)
					{
						if(j==1 && l==1)
							System.out.print(headline[j]+"\t\t\t");//this will create 24char space for name column
						else                                            //since l=1,i.e, Name of ticket owner is more than 16char
						{
							if(headline[j].length()>=8)//this will create 16 char space between start of every column
							{
								System.out.print(headline[j]+"\t");				//and even name column (only if l=0) 
							                                       
							}
							else if(headline[j].length()<8)         //same as above
								System.out.print(headline[j]+"\t\t");
						}
					}
					System.out.print("\n");
					for(int k=0;k<data1.length;k++)
					{
						if(data1[k].length()>=8)  //this will create required space for every column
							System.out.print(data1[k]+"\t");       //for both cases(l==1 or l==0)
						else if(data1[k].length()<8)//same as above
							System.out.print(data1[k]+"\t\t");
					}
				}
			}
			if(i==0)
			{
					System.out.println("\t\t==============================================");
					System.out.println("\t\t|                                            |");
					System.out.println("\t\t| No Flight Ticket Found with this Ticket ID |");
					System.out.println("\t\t|                                            |");
					System.out.println("\t\t==============================================");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		System.out.println("\nPress M to go back to Menu\nPress any other key to exit");
    	String ent=s.next();
    	if((ent.equals("M"))==true) //Option to go back to menu or exit the programm
    	{
    		AirRes menu=new AirRes();
    		String trash[]={"abc","def"};  //Trash array.Created only to parse the arguement of main function.Data of no value.
    		menu.main(trash);				//Calling main function. Also passing trash String array
    	}
  		else
  		{
    		d.delete();
    		System.out.println("\t\t==============================================");
			System.out.println("\t\t|                                            |");
			System.out.println("\t\t|                 Thank You!                 |");
			System.out.println("\t\t|                                            |");
			System.out.println("\t\t==============================================");
  		}
	}
}