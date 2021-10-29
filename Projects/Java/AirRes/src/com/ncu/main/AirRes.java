package com.ncu.main;
import com.ncu.menu.*;			//To be able to call functions of menu 
import java.util.*;

public class AirRes
{
	public static void main(String args[])
	{
		Deletecmd d =new Deletecmd();	//Created an object for Delete Function
        d.delete();   					//called the function to clear command prompt screen of any commands before
		BookT book = new BookT();       //Created object for booking ticket function
		Show sh = new Show();			//Created object for show all function
		SourceSearch ss = new SourceSearch();    //Created object for Searching by departure function
		IdSearch is = new IdSearch();			 //Created object for Searching by ticketId function
		Scanner s = new Scanner(System.in);		 //Create and object of scanner class
		System.out.println("\t\t=============================================");
		System.out.println("\t\t|                                           |");
		System.out.println("\t\t|                  WELCOME                  |");
		System.out.println("\t\t|                    TO                     |");
		System.out.println("\t\t|            AIRLINE RESERVATION            |");
		System.out.println("\t\t|                                           |");
		System.out.println("\t\t|                  ------                   |");
		System.out.println("\t\t|-----------------| MENU |------------------|");    //Displaying functions
		System.out.println("\t\t|                  ------                   |");   
		System.out.println("\t\t|                                           |");
		System.out.println("\t\t|                                           |");
		System.out.println("\t\t| 1-Book tickets        2-Print All Tickets |");
		System.out.println("\t\t|                                           |");
		System.out.println("\t\t| 3-Search departure    4-Ticket search     |");
		System.out.println("\t\t|   location                                |");
		System.out.println("\t\t|                                           |");
		System.out.println("\t\t|                 5-Exit                    |");
		System.out.println("\t\t|                                           |");
		System.out.println("\t\t|             PRESS YOUR CHOICE             |");
		System.out.println("\t\t|                                           |");
		System.out.println("\t\t=============================================");
		int entry = s.nextInt();  		//User is entering their choice 
		switch(entry)
		{
			case 1:
			book.bookTickets();			//calling bookTickets Function
			break;
			case 2:
			sh.showallTickets();		//calling show all Function
			break;
			case 3:
			ss.sSearch();				//calling search by departure location Function
			break;
			case 4:
			is.idSearch();				//calling search by ticket Id Function
			break;
			case 5:
			break;						//Exiting the main page
			default:
			System.out.println("Invalid choice,");
		}
	}
}           													//---|
//javac -cp classes/ -d classes/ src/com/ncu/exceptions/*.java       |
//javac -cp classes/ -d classes/ src/com/ncu/validators/*.java       |
//javac -cp classes/ -d classes/ src/com/ncu/menu/*.java             |-Compilling Commands in the Specific Order
//javac -cp classes/ -d classes/ src/com/ncu/main/*.java             |
//java -cp classes/ com.ncu.main.AirRes                           ---|