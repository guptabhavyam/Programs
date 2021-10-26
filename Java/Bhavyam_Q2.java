//Q-2.An  almost  complete  binary  tree  has  been  created  using  array.  Write  a  function  to  print  all ancestor nodes of a given node. The array and a particular index (for which we wanted to know ancestors) are passed to the function as parameters.
import java.util.*;
public class Bhavyam_Q2
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

      for(int j = 0 ; j < 7 ; j++ )
      {
          System.out.print("\n\nAncestor node of " + a[j] + " is: ");
          Ancestor(a,j);
          System.out.print("\t");
      }
      
   }

   public static void Ancestor(int a[], int k)
   {
          if(k==0)
          System.out.print("\nIt is the root node");
          
          else if(k%2!=0)
          System.out.print(a[k/2]);
          
          else if(k%2==0 && k!=0)
          System.out.print(a[k/2-1]);
   }
   
}