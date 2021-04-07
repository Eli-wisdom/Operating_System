import java.util.Scanner;

public class Bankers {
    public static void main(String[] args){
        int allocated[][] = new int [10][10];
        int max[][] = new int [10][10];
        int need[][] = new int [10][10];
        int flag[] = new int [10];
        int fl;
        //loops
        int i;
        int j;
        int k;
        int p;

        int b;

        int n;
        int r;
        int g;
        int cnt = 0;
        int id;
        int newr;
        int avail[] = new int[10];
        int seq[] = new int[10];
        boolean yes = false;

        Scanner input = new Scanner(System.in);



        System.out.println("**** Bankers Algorithm ****\n");
        System.out.println("Enter number of processes -- ");
        n = input.nextInt();
        System.out.println("Enter number of resources -- ");
        r = input.nextInt();


        allocated = new int[n][r];
        max = new int[n][r];

        for (i = 0; i < n; i++) {
            System.out.println("Enter details for "+ i);
            System.out.println("\nEnter allocation\t -- \t");
            for (j = 0; j < r; j++){
                allocated[i][j] = input.nextInt();

            }
            System.out.println("Enter Max\t\t -- \t");
            for (j = 0; j < r; j++){
                max[i][j] = input.nextInt();
            }

            flag[i] = 0;
        }

        System.out.println("\nEnter Available Resources\t -- \t");
        for (i = 0; i < r; i++){
            avail[i] = input.nextInt();
        }


        System.out.println("\nEnter New Request Details -- ");
        System.out.println("\nEnter pid \t -- \t");
        id = input.nextInt();
        System.out.println("Enter Request for Resources \t -- \t");

        for (i = 0; i < r; i++) {
            newr = input.nextInt();
            // f[id].all[i] += newr;
            allocated[id][i] += newr;           // add the newr to the process' resource
            avail[i] = avail[i] - newr;     // subtract the newr from the avail
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < r; j++) {
                // f[i].need[j] = f[i].max[j] - f[i].all[j];
                need[i][j] = max[i][j] - allocated[i][j];

                if (need[i][j] < 0)
                    need[i][j] = 0;     // need is initialize to 0 if it is less than 0
            }
        }

        cnt = 0;
        fl = 0;

        while (cnt != n) {
            g = 0;
            for (j = 0; j < n; j++) {

                // check if a process is not finished,
                // this is determined by the flag value 0
                if (flag[j] == 0) {
                    b = 0;
                    for (p = 0; p < r; p++) {
                        if (avail[p] >= need[j][p])
                            b = b + 1;
                        else
                            b = b - 1;
                    }

                    // if all needs of p above are satisfied
                    if (b == r) {
                        System.out.printf("\nP%d is visited", j);
                        seq[fl++] = j;                          // add the process to the seq[] list
                        flag[j] = 1;                            // to indicate the process is in safe mode
                        for (k = 0; k < r; k++)
                            avail[k] = avail[k] + allocated[j][k];    // add allocation to available since
                        cnt = cnt + 1;                          // increament cnt by 1
                        System.out.println("(");
                        // the loop displays the available elements
                        for (k = 0; k < r; k++)
                            System.out.println( avail[k]);
                        System.out.println(")");
                        g = 1;
                    }
                }
            }

            // if there is a deadlock display this
            if (g == 0) {
                System.out.println("\n REQUEST NOT GRANTED -- DEADLOCK OCCURRED");
                System.out.println("\n SYSTEM IS IN UNSAFE STATE");
                // goto y;
                yes = true;
            }
        }

        // to implement goto
        if (yes == false) {
            System.out.println("\nSYSTEM IS IN SAFE STATE");
            System.out.println("\nThe Safe Sequence is -- (");

            for (i = 0; i < fl; i++)
                System.out.printf("P%d ", seq[i]);

            System.out.println(")");
        }

        // y:
        System.out.println("\nProcess\t\tAllocation\t\tMax\t\t\tNeed\n");
        for (i = 0; i < n; i++) {
            System.out.printf("P%d\t   ", i);
            for (j = 0; j < r; j++)
                System.out.printf("%6d", allocated[i][j]);
            for (j = 0; j < r; j++)
                System.out.printf("%6d", max[i][j]);
            for (j = 0; j < r; j++)
                System.out.printf("%6d", need[i][j]);
            System.out.printf("\n");
        }
        input.nextLine();


    }
}
