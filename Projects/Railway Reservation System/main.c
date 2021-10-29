//HEADER FILE

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <ctype.h>

//FUNCTION PROTOTYPE


void reservation();                                                                                                                 // TO RESERVE SEAT
void view_details();                                                                                                                // TO VIEW DETAILS
void cancel();                                                                                                                      // TO CANCEL SEAT
void print_ticket(char name[],int num_of_seats,int train_num,float charges,char time[],char departure[],char destination[]);        // TO PRINT DETAILS
void about_train(int);                                                                                                              // TO LEARN ABOUT TRAIN
float charge(int,int);                                                                                                              // TO CHARGE WITH RESPECT TO NO. OF SEATS AND TRAINS
void login();                                                                                                                       // TO LOGIN WITHUERNAME AND PASSWORD
void bookseats();                                                                                                                   // TO BOOK SEATS
void seattype();                                                                                                                    // TO LEARN AOUT SEAT TYPE
void passenger_details();

struct train
    {

        int train_num;
        char name[20];
        char departure[20];
        char destination[20];
        int charges;
        char time[20];
        int num_of_seats;
    } tr [5] =       {
                        { 1 , "RajdhaniExp"  ,  "delhi" , "hyderabad" ,  5000 ,  "12pm" , 10 },
                        { 2 , "ShatabadiExp" ,  "delhi" , "amritsar"  ,  4000 ,  "8am"  , 10 },
                        { 3 , "Jammu tawi"   ,  "delhi" , "Jammu"     ,  4500 ,  "11am" , 10 },
                        { 4 , "Durunto"      ,  "delhi" , "mumbai"    ,  5500 ,  "7am"  , 10 },
                        { 5 , "tsamjhauta"   ,  "India" , "pakistan"  ,  7000 ,  "7pm"  , 5  }

                    };

struct passenger
    {

        char name[30],fname[30],country[10],add[50];
        int train_num;
        long int phno;
        int seat;
        int charge;

    }p1;


//MAIN FUNCTION

int main()
    {
        system("cls");
        printf("\n                 *******************************************************************************");
        printf("\n                 *                                                                             *");
        printf("\n                 *                       -----------------------------                         *");
        printf("\n                 *                        RAILWAY RESERVATION SYSTEM                           *");
        printf("\n                 *                       -----------------------------                         *");
        printf("\n                 *                                                                             *");
        printf("\n                 *******************************************************************************");

        printf("\n\nPress any key to continue");
        getchar();
        login();
        return 0;

    }



int mainmenu()
    {

        int option;

        printf("\n                   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        printf("                                                      TRAIN RESERVATION");
        printf("\n                   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        printf("\n \n                                                 1 >> TO RESERVE TRAIN ");
        printf("\n                                              2 >> TO VIEW ALL AVAILABLE TRAIN ");
        printf("\n                                                 3 >> TO CANCEL RESERVATION");
        printf("\n                                                     4 >> TO EXIT MENU");
        printf("\n \n                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        printf("\n\n\n");
        scanf("%d",&option);

        switch(option)
            {

                case '1':
                reservation();
                break;

                case '2':
                view_details();
                printf("Press any key to go back to the MAIN MENU");
                getchar();
                mainmenu();
                break;

                case '3':
                cancel();
                break;

                case '4':
                exit(0);  // THIS PROCESS HELPS TO TERMINATE FROM THE PROGRAM

                default:
                printf("\nInvalid choice");
                break;
            }

            return 0;

    }

void login()
    {

        char name[15],pass[20];
        char p[10]={"bhavyam"};
        char q[10]={"123"};

        system("cls");

        int i,j;
        char ch;

        for( i=0 ; i<3 ; i++ )
            {

                system("cls");
                printf("  *******************please login here***************");
                printf("\n\n                ENTER YOUR USERNAME:");
                gets(name);
                printf("\n                  ENTER YOUR PASSWORD:");


                for(j=0;j<8;j++)
                    {

                        ch = getch();
                        pass[j] = ch;
                        ch = '*' ;
                        printf("%c",ch);
                    }
                pass[j]='\0';


                if( strcmp(p,name)==0 && strcmp(q,pass)==0 )
                    {

                        system("cls");
                        mainmenu();
                    }

                else
                        printf("                     SORRY !!!  Invalid");
            }

            getch();

    }





void cancel()
    {


    getch();
    }

void view_details()
    {

        system("cls");
        printf("-----------------------------------------------------------------------------");
        printf("\n           Tr.No\tName\t\tDeparture\t\tDestinations\t\tCharges\t\tTime\n");
        printf("-----------------------------------------------------------------------------");

        for(int i=0; i<5;i++)
            {

                printf("\n%-5d %-20s %-20s rs %-15d %-10s ",tr[i].train_num, tr[i].name,tr[i].departure, tr[i].destination, tr[i].charges ,tr[i].time);

            }

        getch();

    }


void print_ticket(char name[],int num_of_seats,int train_num,float charges,char time[],char departure[],char destination[])
    {

        system("cls");
        printf("-------------------\n");
        printf("\tTICKET\n");
        printf("-------------------\n\n");
        printf("Name:\t\t\t%s",name);
        printf("\nNumber Of Seats:\t%d",num_of_seats);
        printf("\nTrain Number:\t\t%d",train_num);
        printf("\nTrain Departure \t\t%s",departure);
        printf("\nDestination: \t\t%s", destination);
        printf("\nDeparture Time: \t\t%s", time);
        printf("\nCharges:\t\t%.2f", charges);
        getch()

    }
