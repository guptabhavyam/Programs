package com.ncu.validators; 
import java.io.*;
public class GetLocation
{
	public String getLocation()
	{
		File fl = new File("location.txt");//This file is saved where this programm is saved
		String location = fl.getAbsolutePath();//This would give the exact path of the file 
		String[] path = location.split("\\\\");//We are spiliting the path by \ to edit it 

		//Note:- When compiled from AirRes, path read is as  
		//			abc\xyz\.....\AirRes\location.txt
		//                   and not as
		//          abc\xyz\.....\AirRes\src\com\ncu\validators\location.txt   

		int length=path.length; //identifying the length of array(no of folders deep the programm AirRes is stored)
		//System.out.println(length);
		int lmt=length-1;      //Since array start from 0
		path[lmt]="data";      // We are replacing location.txt by data to create path to tickets.csv
		String f_path="";     //Declaring and initialising f_path which is empty
		for(int i=0;i<length;i++)//Loop will repeat till the array of path ends(no.of folders deep)
		{
			f_path=f_path+path[i]+"\\\\";  //We are writing and adding the folders and writing \\ between them .By end of loop
			  //                            f_path="abc\\xyz\\..........\\AirRes\\data\\" 
		}
		f_path=f_path+"tickets.csv";// we are writing the file name which is being added to string
		//                     now f_path="abc\\xyz\\..........\\AirRes\\data\\tickets.csv"  
		return f_path;         //giving the path to files where getLocation is being called
	}
	public String getLocationP() 
	{
		File fl = new File("location.txt");
		String location = fl.getAbsolutePath();
		String[] pathP = location.split("\\\\");
		int length=pathP.length;
		int lmt=length-1;
		pathP[lmt]="configs"; // We are replacing location.txt by configs to create path to exceptions.properties
		String p_path=""; 
		for(int i=0;i<=lmt;i++)
		{
			p_path=p_path+pathP[i]+"\\\\";
			//                            p_path="abc\\xyz\\..........\\AirRes\\configs\\" 
		}
		p_path=p_path+"constants"+"\\\\"+"exceptions.properties";
		//                     now p_path="abc\\xyz\\..........\\AirRes\\configs\\constants\\exceptions.properties"  
		return p_path;
	}
}