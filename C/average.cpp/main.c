#include<stdio.h>
#include<stdlib.h>
#include<math.h>

    int volume ()
 {
     int r;
     double int v;
     printf("Enter the radius");
     scanf("%d",r);
     v = (4 * 3.14 * r^(3) )/ 3;
     printf("Volume is %d",v);
     return 0;
     }


int main()
{
    int i,j,k ,s;
    scanf("%d",i,j);
    k=i;
    i=j;
    j=k;
    printf("Swapped numbers are = %d%d",i,j);
    s = volume();
    return 0;
}
