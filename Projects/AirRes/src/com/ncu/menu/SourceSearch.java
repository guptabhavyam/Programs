package com.ncu.menu;
import com.ncu.validators.*;//To be able to call getLocation of GetLocation class 
import com.ncu.main.*;      //To be able to back to menu after execution of this function
import java.util.*;
import java.io.*;

public class SourceSearch
{
	public void sSearch()
	{
		Deletecmd d =new Deletecmd();   //Created an object for Delete Function
      	d.delete();                     //called the function to clear command prompt screen of any commands before
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the departure location:- ");
		String source = s.next();
		GetLocation loc = new GetLocation();  //Creating an object for getlocation function which would get path of ticket file
		String f_loc = loc.getLocation();    //Inputing ticket info file path into a string by calling getLocation function
    	File f = new File(f_loc);            //Declaring file and its object and passing string containing path of data file
		try
		{
			int l=0;      //Int declared to determine whether the name associated with matched ticked id is of more than 16char or not

			FileReader z = new FileReader(f);          //Declaring and initialising File Reader
			BufferedReader b = new BufferedReader(z);  //Declaring and initialising Buffered Reader
			{
				String g;
				while((g=b.readLine())!=null)  //loop would work till all lines of csv file are scanned which all will be feeded to String g  
				{
					String[] data0 = g.split(",");//Splitting data and storing them in data0 array
					if((data0[5].equals(source))==true)//at 5 location of array,file gave the departure stored which we are comparing to the location user has enterned now
					{
													//since to one location, more than 1 ticket can be booked by different names who will
						   //                         have different length and may or may not be more than 16char  
						if(data0[1].length()>=16)//If name related to matched ticket id is of more than 16 char, l=1.Else l=0
							l=1;
					}
				}

			}
			b.close();//closing reader
								//			Note: This previous loop was to only identify if any name related to searched 
								//				  location of departure has more than 16 char so that correct name column size
								//					can be made 

			FileReader fr;									//Declaring file reader object
			fr= new FileReader(f);                          //Initialising filereader
			BufferedReader br = new BufferedReader(fr);		//Declaring and initialising Buffered Reader
			String data;
			String head=br.readLine();						//Seprating headings from mainstream data and feeding it to String 
			String[] headline=head.split(",");				//Splitting headings and storing them in headline array
			
			int i=0;//int i is declared so that header is printed only
			while((data=br.readLine())!=null)  //creating loop that will start reading data after headings and finish after file is completely read
			{                                  //storing each ticket info in data String one at a time as loop progresses
				String[] data1 = data.split(",");//Splitting ticket info into data1 array
				if((data1[5].equals(source))==true && i==0)//at 5 location of array,file gave the source stored which we are comparing to the location user has enterned now
				{                                         //i=0 means matched departure location is matched with data only once for now.
					//                                     Thus header will be printed along the data
					for(int j=0;j<headline.length;j++)
					{
						if(j==1 && l==1)
							System.out.print(headline[j]+"\t\t\t");//this will create 24char space for name column
						else 										//since l=1,i.e, Name of ticket owner is more than 16char
						{
							if(headline[j].length()>=8)    //this will create 16 char space between start of every column(except name)
								System.out.print(headline[j]+"\t");   //                         and even name column (only if l=0)

							else if(headline[j].length()<8)            //same as above
								System.out.print(headline[j]+"\t\t");
						}
					}
					System.out.print("\n");
					for(int k=0;k<data1.length;k++)
					{
						if(k==1 && l==1)         //This for the names of passengers whose source has matched with user entered location
												//l=1 meaning the name has more than 16 char requiring 24char sapce column					
						{
							if(data1[k].length()>=16)
								System.out.print(data1[k]+"\t");//since name > 16char, one tab will create remaining space required for 24char column
							else if(data1[k].length()>=8 && data1[k].length()<16)
								System.out.print(data1[k]+"\t\t");//since 8<= name< 16, two tabs required to create total 24char Column
							else if(data1[k].length()<8)
								System.out.print(data1[k]+"\t\t\t");//sincename < 8, 3 tabs are required to create total 24char Column
						}
						else
						{
							if(data1[k].length()>=8)   //this will create 16 char space between start of every column
								System.out.print(data1[k]+"\t");//               and even name column (only if l=0) 
							else if(data1[k].length()<8)           //same as above
								System.out.print(data1[k]+"\t\t");
						}
					}
					i++;  //this increase in value indicates that after this running of loop,if any source from file matches location entered
					      // by user, requires solo printing and does not require header printed along with it since header are already printed
				}
				else if((data1[5].equals(source))==true && i>=1)//header is already printed once and thus now only data is supposed to be printed
				{
					System.out.print("\n");
					for(int k=0;k<data1.length;k++)
					{
						if(k==1 && l==1)   //This for the names of passengers whose source has matched with user entered location
						{                  //l=1 meaning the name has more than 16 char requiring 24char sapce column					
							if(data1[k].length()>=16)
								System.out.print(data1[k]+"\t");//since name > 16char, one tab will create remaining space required for 24char column
							else if(data1[k].length()>=8 && data1[k].length()<16)
								System.out.print(data1[k]+"\t\t");//since 8<= name< 16, two tabs required to create total 24char Column
							else if(data1[k].length()<8)
								System.out.print(data1[k]+"\t\t\t");//sincename < 8, 3 tabs are required to create total 24char Column
						}
						else
						{
							if(data1[k].length()>=8)  //this will create 16 char space between start of every column
								System.out.print(data1[k]+"\t");//               and even name column (only if l=0) 
							else if(data1[k].length()<8)  //same as above
								System.out.print(data1[k]+"\t\t");
						}
					}
				}
			}
			if(i==0)
			{
				System.out.println("\t\t==============================================");
				System.out.println("\t\t|                                            |");
				System.out.println("\t\t|No Flight Found departing from this location|");
				System.out.println("\t\t|                                            |");
				System.out.println("\t\t==============================================");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		Scanner sc=new Scanner(System.in);
		System.out.println("\nPress M to go back to Menu\nPress any other key to exit");
    	String ent=sc.next();
    	if((ent.equals("M"))==true)  //Option to go back to menu or exit the programm
    	{
    		AirRes menu=new AirRes();
    		String trash[]={"abc","def"};  //Trash array.Created only to parse the arguement of main function.Data of no value.
    		menu.main(trash);              //Calling main function. Also passing trash String array
    	}
  		else
  		{
    		System.out.println("\nThank You!");
  		}
	}
}