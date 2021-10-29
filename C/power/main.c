#include <stdio.h>

int power(int b,int p)
{
   if( p==0 )
   {
     return (1);
   }
    return (b*power(b,p-1));
   }

int main()
{
    int n,m,k;
    printf("Enter a the base and power ");
    scanf("%d%d", &n,&m );
    k=power(n,m);
    printf("The output is %d ",k);
    return 0;
}
