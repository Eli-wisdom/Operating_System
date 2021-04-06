# Operating_System
 



**Memory Management Techniques**

**MVT (Multiprogramming with a Variable number of Tasks)**
MVT is the memory management technique in which each job gets just the amount of memory it needs. That is, the partitioning of memory is dynamic and changes as jobs enter and leave the system.

**MFT (Multiprogramming with a Fixed number of Tasks)**
MFT is one of the old memory management techniques in which the memory is partitioned into fixed size partitions and each job is assigned to a partition. The memory assigned 
to a partition does not change.

a) **Worst-fit**
Worst Fit allocates a process to the partition which is largest sufficient among the freely available partitions available in the main memory.

b) **Best-fit** 
The best fit deals with allocating the smallest free partition which meets the requirement of the requesting process. This algorithm first searches the entire list of free partitions and considers the smallest hole that is adequate. It then tries to find a hole which is close to actual process size needed.


c) **First-fit**
In this method, first job claims the first available memory with space more than or equal to it's size.The operating system doesn't search for appropriate partition but just allocate the job to the nearest memory partition available with sufficient size.

**Paging technique of memory management**
Paging is a storage mechanism that allows OS to retrieve processes from the secondary storage into the main memory in the form of pages. In the Paging method, the main memory is divided into small fixed-size blocks of physical memory, which is called frames.



**CPU Scheduling Algorithms**
CPU Scheduling is a process of determining which process will own CPU for execution while another process is on hold. The main task of CPU scheduling is to make sure that whenever the CPU remains  idle, the OS at least select one of the processes available in the ready queue for execution. The selection process will be carried out by the CPU scheduler. It selects one of the processes in memory that are ready for execution.


**Types of CPU scheduling Algorithm**
a) FCFS ----First Come First Serve 
b) SJF --- Shortest Job First	
c) Round Robin (pre-emptive) 
d) Priority 
e) Multiple-Level Queues Scheduling

**Deadlock Management Techniques**
a) FCFS  
b) SCAN 
c) C-SCAN 

****Important Terms you need to know*****
Burst Time/Execution Time: It is a time required by the process to complete execution. It is also called running time.
Arrival Time: when a process enters in a ready state
Finish Time: when process complete and exit from a system
**Multiprogramming: A number of programs which can be present in memory at the same time.
**Jobs: It is a type of program without any kind of user interaction.*
**User: It is a kind of program having user interaction.
**Process: It is the reference that is used for both job and user.
**CPU/IO burst cycle: Characterizes process execution, which alternates between CPU and I/O activity. 
CPU times are usually shorter than the time of I/O.



Please read the beginning comment in each file to know that algorithm it is.

To run any of the codes, open the folder you wish to run, then open to SRC folder ,you will see the main method.then run the content of the main method in any of the Java IDEs.
Thank you. 
