/**
 * Priority scheduling is a non-preemptive algorithm that is one of the most widely used in batch systems.
 * A priority is given to each operation. The process with the highest priority will be carried out first, and so on. On a first-come,
 * first-served basis, processes of the same priority are executed.
 * Prioritization can be dictated by memory requirements, time limits, or some other resource constraint.
 */

import java.util.Scanner;

public class Priority {
    public static void main(String[] args) {
        int i,  //loop counter
                k,//loop counter
                n,//Number of priority
                temp;//temporal value.
        int[] p = new int[20];//process number
        int[] bt = new int[20];//burst time of a priority
        int[] pri = new int[20];//priority list
        int[] wt = new int[20];//waiting time
        int[] tat = new int[20];//turnaround time
        float totwta,    //total waiting time
                tottat;// Total turnaround time
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of processes --- ");

        n = input.nextInt();

        for (i = 0; i < n; i++) {
            p[i] = i;
            System.out.println("Enter the Burst Time --- " + i);
            bt[i] = input.nextInt();
            System.out.println("Enter the Burst  Priority of Process--- " + i);
            pri[i] = input.nextInt();
        }
        for (i = 0; i < n; i++)
            for (k = i + 1; k < n; k++)
                if (pri[i] > pri[k]) {
                    temp = p[i];
                    p[i] = p[k];//interchange process number
                    p[k] = temp;//interchange process number
                    temp = bt[i];
                    bt[i] = bt[k];//Interchange  burst time
                    bt[k] = temp;//Interchange  burst time
                    temp = pri[i];
                    pri[i] = pri[k];//Interchange priority
                    pri[k] = temp;//Interchange priority
                }
        totwta = wt[0] = 0;
        tottat = tat[0] = bt[0];
        for (i = 1; i < n; i++) {
            wt[i] = wt[i - 1] + bt[i - 1];//previous waiting time plus previous burst time is assigned to current wait time
            tat[i] = tat[i - 1] + bt[i];//current burst time plus previous turnaround time is assigned to current turnaround time
            totwta = totwta + wt[i];
            tottat = tottat + tat[i];
        }

        System.out.println("\nPROCESS\t\tPRIORITY\tBURST TIME\tWAITING TIME\tTURNAROUND TIME");//Displays the following  output
        for (i = 0; i < n; i++)
            System.out.println("\n" + p[i] + " \t\t\t " + pri[i] + " \t\t\t\t" + bt[i] + " \t\t\t " + wt[i] + " \t\t\t\t " + tat[i]);
        System.out.println("\nAverage Waiting Time is --- " + totwta / n);//Display  Average Waiting time
        System.out.println("\nAverage Turnaround Time is --- " + tottat / n);//Display Average Turnaround Time


    }
}
