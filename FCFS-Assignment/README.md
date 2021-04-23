# First Come First Serve

## First Come First Serve (FCFS) is an operating system scheduling algorithm that automatically executes queued requests and processes in order of their arrival. It is the easiest and simplest CPU scheduling algorithm.

## INPUT 
**n**
- This holds the number of process.

**i**
- This holds the burst time for that particular process.


## PROCESS
Base on the input, the system produce the wait time for a particular process by adding the wait time the previous process and burst time of the previous process. The system then produce turnaround Time by adding previous turnaround time  and the current burst time.

## OUTPUT
The output displays the PROCESS,BURST TIME ,WAITING TIME	 TURNAROUND TIME, Average Waiting Time and Average Turnaround Time.
