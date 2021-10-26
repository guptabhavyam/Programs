import java.util.*;
public class BhavyamQ2
{
   public static void main(String args[])
   {
      Scanner x = new Scanner(System.in);
      int a[] = {5,7,11,13,17,19,23};

      System.out.print("The elements :\n\n");
      
      for(int i = 0; i < 7 ; i++)
      {
         System.out.print(a[i] + "\t");
      }

       System.out.print("\n");

      System.out.print("\nEnter the element whose Ancestor is to be found :");
      int n = x.nextInt();
      int k = -1;

      for(int i = 0 ; i < 7 ; i++)
      {
         if(a[i]==n)
         {
            k = i;
         }
      }

      if(k!=-1)
      {
         System.out.print("\nAncestor node of " + n + " is:");
         Ancestor(a,k);
      }

      else
      {
         System.out.print("\nNot Present");
      }
   }

   public static void Ancestor(int[] a, int k)
   {
          if(k==0)
          System.out.print("\nIt is the root node");
          
          else if(k%2!=0)
          System.out.print(a[k/2]);
          
          else if(k%2==0 && k!=0)
          System.out.print(a[k/2-1]);
   }
   
}