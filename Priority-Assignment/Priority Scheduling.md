Priority Scheduling.
Priority Scheduling is a system of prioritizing processes for scheduling. The scheduler uses this algorithm to choose which tasks to work on based on their priority.

INPUT 
##n
This variable holds the number of processes.

##bt
This array holds the burst time for a particular process

##pri
This array holds the priority burst time of a particular process.


PROCESS 
The system check between two priorities and compare the two which of the priorities is less. The system the interchange the priority positions ,process number  and burst time of the two processes. The system then produce the total turnaround time and the total waiting time. Current wait time is equals to  previous waiting time plus previous burst time and the current turnaround time  is assigned current burst time plus previous turnaround time.

OUTPUT
The system then produces PROCESS number, PRIORITY	BURST TIME,WAITING TIME,TURNAROUND TIME of a particular process.

