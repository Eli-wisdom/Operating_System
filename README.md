# Operating System
___

We tackled Memory Management techniques and CPU Scheduling Algorithms


## Memory Management Techniques	

- MVT (Multiprogramming with a Variable number of Tasks)
MVT is the memory management technique in
which each job gets just the amount of memory it needs. That is, 
the partitioning of memory is dynamic and changes as jobs enter and leave the system

- MFT (Multiprogramming with a Fixed number of Tasks)
MFT is one of the old memory management techniques in which the memory is partitioned into 
fixed size partitions and each job is assigned to a partition. The memory assigned 
to a partition does not change.

- Worst-fit 
Worst Fit allocates a process to the partition which is largest sufficient
among the freely available partitions available in the main memory.

- Best-fit 
The best fit deals with allocating the smallest free partition which meets the requirement of the 
requesting process. This algorithm first searches the entire list of free partitions and considers 
the smallest hole that is adequate. It then tries to find a hole which is close to actual 
process size needed.


- First-fit
In this method, first job claims the first available memory with space more than or equal to it's size.
The operating system doesn't search for appropriate partition but just allocate
the job to the nearest memory partition available with sufficient size.

- Paging technique of memory management
Paging is a storage mechanism that allows OS to retrieve processes from the secondary storage into 
the main memory in the form of pages. In the Paging method, the main memory is divided into 
small fixed-size blocks of physical memory, which is called frames.

___

## CPU Scheduling Algorithms
CPU Scheduling is a process of determining which process will own CPU for execution while another process is on hold. The main task of CPU scheduling is to make sure that whenever the CPU remains idle, the OS at least select one of the processes available in the ready queue for execution. The selection process will be carried out by the CPU scheduler. It selects one of the processes in memory that are ready for execution.




**Types of CPU Scheduling**

**Here are two kinds of Scheduling methods:**

- Preemptive Scheduling

In Preemptive Scheduling, the tasks are mostly assigned with their priorities. Sometimes it is important to 
run a task with a higher priority before another lower priority task, even if the lower priority 
task is still running. The lower priority task holds for some time and resumes when the 
higher priority task finishes its execution.


- Non Preemptive Scheduling
In this type of scheduling method, the CPU has been allocated to a specific process. 
The process that keeps the CPU busy will release the CPU either by switching context or 
terminating. It is the only method that can be used for various hardware platforms. 
That's because it doesn't need special hardware (for example, a timer) like preemptive scheduling.


**Types of CPU scheduling Algorithm**

- FCFS ----First Come First Serve 

- SJF --- Shortest Job First

- Round Robin (pre-emptive) 

- Priority 

- Multiple-Level Queues Scheduling

___

## Deadlock Management Techniques

- FCFS 

- SCAN 

- C-SCAN 

___

## Important Terms you need to know
Burst Time/Execution Time: It is a time required by the process to complete execution. 
It is also called running time.
- Arrival Time: when a process enters in a ready state

- Finish Time: when process complete and exit from a system

- Multiprogramming: A number of programs which can be present in  memory at the same time.

- Jobs: It is a type of program without any kind of user interaction.*

- User: It is a kind of program having user interaction.

- Process: It is the reference that is used for both job and user.

- CPU/IO burst cycle: Characterizes process execution, which alternates between CPU and I/O activity. 
CPU times are usually shorter than the time of I/O.

___

## INSTALLATION 

For this code to run  Java SE Develoment Kit and  any Java IDE or text editor needs to be installed on the system.



## RUN CODE

To run the algorithms in an IDE or text editor.You first need to extract the downloaded  repository and use the IDE or text editor to open the algorithm you wish to open.From here you can run the specific code through the Main.


___

**Our Code is well commented clarity of each line. 
Please check read the beginning comment in each file to know that algorithm it is. 
Thank you.**


 


