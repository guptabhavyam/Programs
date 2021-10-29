package com.ncu.menu;
import java.io.*;
import java.util.*;
public class Deletecmd
{
       //function to delete page
     public void delete()
     {
        try
     	  {
           new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        catch(Exception E)
        {
     	     System.out.println(E);
        }
      }
}