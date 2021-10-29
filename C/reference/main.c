#include <stdio.h>
#include <stdlib.h>

int fact(int n)
{
    if( n == 1 )
    {
        return (1);
    }
    return  n*fact(n-1);
}
int main()
{
    int f,g;
    printf("Enter the number ");
    scanf("%d",&f);
    g=fact(f);
    printf("The factorial is %d ",g);
    return 0;
}
