#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <ctype.h>
#include <string.h>

int mainmenu1();
int mainmenu2();
int mainmenu3();
int mainmenu4();
int new_register();
int student_login();
int admin_login();
int view_staff();
int view_notice();
int view_complaint();
int add_complaint();
int add_notice();
int delete_complaint();
int delete_notice();

struct student
    {
        char rollno[10];
        char name[20];
        char dept[10];
    };

struct admin
    {
        char name[20];
        char dept[10];
    };

struct new_register
    {
        char name[20];
        char dept[10];
        char fname[20];
        char rollno[20];
    };

int main()
    {
        system("cls");
        printf("\n                 ***************************************************************************");
        printf("\n                 *                                                                         *");
        printf("\n                 *                       ---------------------------                       *");
        printf("\n                 *                        COLLEGE MANAGEMENT SYSTEM                        *");
        printf("\n                 *                       ---------------------------                       *");
        printf("\n                 *                                                                         *");
        printf("\n                 ***************************************************************************");

        printf("\n\nPress any key to continue");
        getchar();
        mainmenu1();
        return 0;

    }


int mainmenu1()
    {

        int option;

        system("cls");

        printf("\n                   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        printf("                                                           MAIN MENU");
        printf("\n                   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
        printf("\n                                                    1 >> LOGIN ");
        printf("\n                                                    2 >> NOTICES ");
        printf("\n                                                    3 >> TO EXIT MENU");
        printf("\n \n                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        printf("\n\n\n");
        scanf("%d",&option);

        switch(option)
            {

                case 1:
                mainmenu2();
                break;

                case 2:
                view_notice();
                break;

                case 3:
                exit(0);  // THIS PROCESS HELPS TO TERMINATE FROM THE PROGRAM

                default:
                printf("\nInvalid choice");
                printf("\nPress any key to continue");
                getch();
                mainmenu1();
                break;
            }

        return 0;
    }

int mainmenu2()
    {

        int option;

        fflush(stdin);
        system("cls");

        printf("\n                   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        printf("                                                           MAIN MENU");
        printf("\n                   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
        printf("\n                                                    1 >> STUDENT ");
        printf("\n                                                    2 >> ADMIN ");
        printf("\n                                                    3 >> NEW REGISTRATION");
        printf("\n                                                    4 >> TO EXIT MENU");
        printf("\n \n                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        printf("\n\n\n");
        scanf("%d",&option);

        switch(option)
            {

                case 1:
                student_login();
                break;

                case 2:
                admin_login();
                break;

                case 3:
                new_register();
                break;

                case '4':
                exit(0);  // THIS PROCESS HELPS TO TERMINATE FROM THE PROGRAM

                default:
                printf("\nInvalid choice");
                mainmenu2();
                break;
            }

        return 0;
    }

int mainmenu3()
    {
        system("cls");
        int option;

        system("cls");

        printf("\n                   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        printf("                                                           STUDENT");
        printf("\n                   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
        printf("\n                                                    1 >> ADD COMPLAINT ");
        printf("\n                                                    2 >> STAFF VIEW ");
        printf("\n                                                    3 >> VIEW NOTICE ");
        printf("\n                                                    4 >> EXIT MENU ");
        printf("\n \n                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        printf("\n\n\n");
        scanf("%d",&option);

        switch(option)
            {

                case 1:
                add_complaint();
                break;

                case 2:
                view_staff();
                break;

                case 3:
                view_notice();
                break;

                case 4:
                exit(0);  // THIS PROCESS HELPS TO TERMINATE FROM THE PROGRAM

                default:
                printf("\nInvalid choice");
                mainmenu3();
                break;
            }

        return 0;
    }

int mainmenu4()
    {

        int option;

        system("cls");

        printf("\n                   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        printf("                                                           ADMIN");
        printf("\n                   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
        printf("\n                                                    1 >> VIEW COMPLAINT ");
        printf("\n                                                    2 >> REMOVE COMPLAINT ");
        printf("\n                                                    3 >> ADD NOTICE ");
        printf("\n                                                    4 >> REMOVE NOTICE ");
        printf("\n                                                    5 >> TO EXIT MENU");
        printf("\n \n                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        printf("\n\n\n");
        scanf("%d",&option);

        switch(option)
            {

                case 1:
                view_complaint();
                break;

                case 2:
                delete_complaint();
                break;

                case 3:
                add_notice();
                break;

                case 4:
                exit(0);  // THIS PROCESS HELPS TO TERMINATE FROM THE PROGRAM

                default:
                printf("\nInvalid choice");
                mainmenu4();
                break;
            }

        return 0;
    }





int student_login()
    {

        char name[15],pass[20];
        char p[10];
        char q[10];

        system("cls");

        int i,j;
        char ch;

        for( i=0 ; i<3 ; i++ )
            {


                system("cls");
                fflush(stdin);
                printf("  *******************please login here***************");
                printf("\n\n                ENTER YOUR USERNAME:");
                gets(name);
                fflush(stdin);

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
                        mainmenu3();
                    }

                else
                        printf("                     SORRY !!!  Invalid");
            }

        return 0;

    }

int admin_login()
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
                        mainmenu4();
                    }

                else
                        printf("                     SORRY !!!  Invalid");
            }

            return 0;

    }


int new_register()
    {
        system("cls");
        struct new_register n;

        printf("\n\n\t Enter Name : ");
        gets(n.name);
        fflush(stdin);

        printf("\n\t Enter Fathers Name : ");
        gets(n.fname);
        fflush(stdin);

        printf("\n\t Enter Department : ");
        gets(n.dept);
        fflush(stdin);

        printf("\n\t Enter Rollno : ");
        gets(n.dept);
        fflush(stdin);

        return 0;

    }

int view_staff()
    {
        system("cls");
        FILE *s;
        char read[50];
        s=fopen("staff.txt","r");

        if(s==NULL)
            {
                printf("No record found.");
            }
         else
            {
                while( fgets ( read, 50, s ) != NULL )
                    {

                        if( fgets ( read, 50, s ) != NULL )
                            {
                                printf( "%s" , read );
                            }

                        else
                            {
                                printf("File is empty");
                            }

                    }

                fclose(s );


            }
        return 0;
    }

int view_notice()
    {
        system("cls");
        FILE *n;
        char read[50];
        n=fopen("notice.txt","r");

        if(n==NULL)
            {
                printf("No record found.");
            }
         else
            {
                while( fgets ( read, 50, n ) != NULL )
                    {

                        if( fgets ( read, 50, n ) != NULL )
                            {
                                printf( "%s" , read );
                            }

                        else
                            {
                                printf("File is empty");
                            }

                    }

                fclose(n);


            }

       return 0;
    }

int view_complaint()
    {
        system("cls");
        FILE *c;
        char read[50];
        c=fopen("complaint.txt","r");

        if(c==NULL)
            {
                printf("No record found.");
            }
         else
            {
                while( fgets ( read, 50, c ) != NULL )
                    {

                        if( fgets ( read, 50, c ) != NULL )
                            {
                                printf( "%s" , read );
                            }

                        else
                            {
                                printf("File is empty");
                            }

                    }

        fclose(c);


            }

        return 0;
    }

int add_complaint()
    {
        system("cls");
        FILE *c ;

        char write[50];

        c=fopen("complaint.txt","r");

        if (c == NULL)
            {
                puts("No record found");
            }

        while(1)
            {
                if(fgets(write, 50, c) ==NULL)
                break;

                else
                printf("%s", write);
            }
        printf("\n\n");

    fclose(c);

    return 0;
    }

int add_notice()
    {
        system("cls");
        FILE *n ;

        char write[50];

        n = fopen("complaint.txt", "r");


        if (n == NULL)
            {
                puts("No record found");
            }

        while(1)
            {
                if(fgets(write, 50, n) ==NULL)
                break;

                else
                printf("%s", write);
            }
        printf("\n\n");

        fclose(n);
        return 0;
    }

int delete_complaint()
    {
        system("cls");
        printf("Complaint has been deleted");
        return 0;

    }

int delete_notice()
    {
        system("cls");
        printf("The notice has been deleted");
        return 0;
    }

