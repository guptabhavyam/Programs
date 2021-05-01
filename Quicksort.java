import java.util.Random;

public class Quicksort 
{
	static int c=0;

	public static int partition(int arr[], int s, int e) 
    { 
        int pivot = arr[e];  
        int i = (s-1); 
        for (int j=s; j<e; j++) 
        { 
            if (arr[j] <= pivot) 
            { 
                i++; 
  
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
            int temp = arr[i+1]; 
        	arr[i+1] = arr[e]; 
        	arr[e] = temp; 
  
       		return i+1; 
    } 
  
  
    public static void main(String[] args)
	{
		Random rand = new Random();
		int[] arr1 = new int[1000];
		int c ;
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=rand.nextInt(1000);
		}
	
		int l=0;
		int h1=arr1.length-1;

		int[] arr2=new int[1000];

		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=i;
		}
	
		int[] arr3=new int[1000];
	
		for(int i=arr3.length,j=0;i>0;i--,j++)
		{
			arr3[j]=i;
		}

		int h2=arr2.length-1;

		int h3=arr3.length-1;

		int[] arr4=new int[1000];

		for(int i=0;i<arr2.length;i++)
		{
			arr4[i]=1;
		}

		int h4=arr4.length-1;


		long start = System.currentTimeMillis(); 
		c=0;
		sort(arr1,l,h1);
		System.out.println("\nCount "+ c);
    	long end = System.currentTimeMillis(); 
    	System.out.print("Random takes " +(end - start) + "ms\n");
    	for(int i=0;i<10;i++)
		{
			System.out.print(arr1[i]+ " ");
		}	 
	
		long start1 = System.currentTimeMillis(); 
		c=0;
		sort(arr2,l,h2);
		System.out.println("\n\nCount "+ c);
    	long end1 = System.currentTimeMillis(); 
    	System.out.print("Ascending takes " +(end1 - start1) + "ms\n");
    	for(int i=0;i<10;i++)
		{
			System.out.print(arr2[i]+" ");
		} 
	
		long start2 = System.currentTimeMillis(); 
		c=0;
		sort(arr3, l, h3);
		System.out.println("\n\nCount "+ c);
    	long end2 = System.currentTimeMillis(); 
    	System.out.print("Descending takes " +(end2 - start2) + "ms\n");
    	for(int i=0;i<10;i++)
		{
			System.out.print(arr3[i]+" ");
		}  

	
		long start3 = System.currentTimeMillis(); 
		c=0;
		sort(arr4,l,h4);
		System.out.println("\n\nCount "+ c);
    	long end3 = System.currentTimeMillis(); 
    	System.out.print("Same takes " +(end3 - start3) + "ms\n");
    	for(int i=0;i<10;i++)
		{
			System.out.print(arr4[i]+" ");
		}  
	}
	 public static void sort(int arr[], int s, int e) 
    { 
        if (s < e) 
        { 
            int pi = partition(arr, s, e); 
  
            sort(arr, s, pi-1); 
            sort(arr, pi+1, e); 
        }
        c++; 
    }

}