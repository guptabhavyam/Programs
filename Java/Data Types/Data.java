/*3.	Write a program that displays the sizes and ranges of the different primitive data types in Java in the given format. */
class Primitive
	{
		public static void main(String args[])
			{
			
				short s=30;
				int i=100;
				long l=10000;
				float f=1.41f;
				double d=4213;
				char c='A';
				boolean b=true;
				System.out.println(" S.No."+"\t"+"Data Type   "+"\t"+" Size"+"\t\t"+"  Minimum"                 +"\t\t\t"  +"Maximum\n");
				System.out.println("   1. "+"\t"+"  short     "+"\t"+"  1  "+"\t\t   "+  Short.MIN_VALUE           +"\t\t\t"  +Short.MAX_VALUE);
				System.out.println("   2. "+"\t"+"  int       "+"\t"+"  2  "+"\t\t   "+  Integer.MIN_VALUE         +"\t\t\t"      +Integer.MAX_VALUE);
				System.out.println("   3. "+"\t"+"  long      "+"\t"+"  4  "+"\t\t   "+  Long.MIN_VALUE            +"\t\t"      +Long.MAX_VALUE);
				System.out.println("   4. "+"\t"+"  float     "+"\t"+"  4  "+"\t\t   "+  Float.MIN_VALUE           +"\t\t\t"      +Float.MAX_VALUE);
				System.out.println("   5. "+"\t"+"  double    "+"\t"+"  8  "+"\t\t   "+  Double.MIN_VALUE          +"\t\t\t"      +Double.MAX_VALUE);
				System.out.println("   6. "+"\t"+"  character "+"\t"+"  1  "+"\t\t   "+ (int)Character.MIN_VALUE   +"\t\t\t\t"      +(int)Character.MAX_VALUE);

  			}
	}	
	