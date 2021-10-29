package com.ncu.menu;  
import com.ncu.validators.GetLocation;//To be able to call getLocation of GetLocation class 
import com.ncu.main.*;              //To be able to back to menu after execution of this function
import java.util.*;
import java.io.*;
public class Show
{
	public void showallTickets()
	{
		Deletecmd d =new Deletecmd();   //Created an object for Delete Function
		try
		{
      		d.delete();						//called the function to clear command prompt screen of any commands before
			GetLocation loc = new GetLocation();//Creating an object for getlocation function which would get path of ticket file
			String f_loc = loc.getLocation();   //Inputing ticket info file path into a string by calling getLocation function
			File f=new File(f_loc);             //Declaring file and its object and passing string containing path of data file
			//System.out.println(f_loc);
			FileReader fr;                     //Declaring file reader object
			fr=new FileReader(f);              //Initialising filereader
			BufferedReader br;                 //Declaring Buffered Reader 
			br=new BufferedReader(fr);         //initialising Buffered Reader
			String line;
			int i;

			while((line=br.readLine())!=null)  //loop would work till all lines of csv file are scanned which all will be feeded to String line  
			{
				String[] dataLine = line.split(",");//Splitting data and storing them in dataline array
				for(i=0;i<dataLine.length;i++)
				{                               //Note: Since all info is being printed, we automaticalyy create a 24char(3 tabs) space 
					                            //between Name Header and age header and for other header gaps, default 16char space(2 tabs) 
						
						if(i==1)                //this to segragate name info since for every loop repetition, at dataLine[1] would be a name of passenger
						{
							if(dataLine[i].length()>=16)
								System.out.print(dataLine[i]+"\t");//since name > 16char, one tab will create remaining space required for 24char column
							else if(dataLine[i].length()>=8 && dataLine[i].length()<16)
								System.out.print(dataLine[i]+"\t\t");//since 8<= name< 16, two tabs required to create total 24char Column
							else if(dataLine[i].length()<8)
								System.out.print(dataLine[i]+"\t\t\t");//sincename < 8, 3 tabs are required to create total 24char Column
						}
						else
						{
							if(dataLine[i].length()>=8)//this will create 16 char space between start of every column(except name)
							{
								System.out.print(dataLine[i]+"\t");  ////since data >= 8, 1 tab are required to create total 16char Column
							}
							else if(dataLine[i].length()<8)//this will create 16 char space between start of every column(except name)
							{
								System.out.print(dataLine[i]+"\t\t");//since data < 8, 2 tabs are required to create total 16char Column
							}
						}
				}
				System.out.print("\n");
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
    		String trash[]={"abc","def"};    //Trash array.Created only to parse the arguement of main function.Data of no value.
    		menu.main(trash);                //Calling main function. Also passing trash String array
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