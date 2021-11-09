import java.util.*;

public class RoundRobin{
    public static void main(String args[]){
        int n, i, tq, count = 0, temp, completion = 0, bt[], wt[], tat[], rem_bt[];
        float awt = 0, atat = 0;
        bt = new int[10];
        wt = new int[10];
        tat = new int[10];
        rem_bt = new int[10];
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of processes: ");
        n = sc.nextInt();
        System.out.println("Enter the burst time of processes: ");
        for(i=0; i<n; i++)
        {
            System.out.print("P"+i+" = ");
            bt[i] = sc.nextInt();
            rem_bt[i] = bt[i];
        }
        System.out.print("Enter the quantum time: ");
        tq = sc.nextInt();
        while(true)
        {
            for(i=0, count=0; i<n; i++)
            {
                temp = tq;
                if(rem_bt[i] == 0)
                {
                    count++;
                    continue;
                }
                if(rem_bt[i] > tq)
                rem_bt[i] = rem_bt[i] - tq;
                else
                if(rem_bt[i] >= 0)
                {
                    temp = rem_bt[i];
                    rem_bt[i] = 0;
                }
                completion = completion + temp;
                tat[i] = completion;
            }
            if(n == count)
            break;
        }
        System.out.print("\nProcess\tBurst Time\tTurnaround Time\tWaiting Time\n");
        for(i=0; i<n; i++)
        {
            wt[i] = tat[i] - bt[i];
            awt = awt + wt[i];
            atat = atat + tat[i];
            System.out.print("\n   "+(i+1)+"\t   "+bt[i]+"\t\t   "+tat[i]+"\t\t   "+wt[i]);
        }
        awt = awt/n;
        atat = atat/n;
        System.out.println("\nAverage Waiting Time = "+awt);
        System.out.print("\nAverage Turnaround Time = "+atat);
    }
}