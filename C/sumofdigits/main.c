#include <stdio.h>

int sum(int p,int q)
{
   int a;
   a=p%10;
   p/=10;
   if(q==1)
   {
       return  a ;
   }
   return a+sum(p,q-1);
}
int main()
{
    int n,k,i,b,c=0;
    printf("Enter the number");
    scanf("%d",&n);
    b=n;
   for( i=10 ; b != 0 ; i=i*10 )
         {
            b = n/i;
            c++;
         }
    k=sum(n,c);
    printf("The sum is %d",k);
    return 0;

}
