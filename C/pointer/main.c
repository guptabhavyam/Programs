

#include <stdio.h>

int main()
{
    int a; /**integer**/
    int *b;/**pointer**/
    a=5;
    printf("\nValue of a \t                 %d",a);

    b=&a; /**giving pointer address of a**/
    printf("\nvalue of b or address of a \t %p",b);

    printf("\nValue at b \t                 %d",*b);

    printf("\naddress of b \t               %p",&b);
    return 0;
}
