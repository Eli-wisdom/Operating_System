# MULTIPROGRAMMING WITH A FIXED NUMBER OF TASKS
- MFT (Multiprogramming with a Fixed number of Tasks) Is a memory  techniques in which the memory  is partitioned into fixed size partitions and each job is assigned to partition.

# INPUT
## availableMemorySize
- It holds the total memory available.

## blockSize
- It holds the block size.

## noOfProcess
- It holds the number of process.

## processSize
- It hold the each process size.

## PROCESS
- Based on the input provided, the system divides block size by the available memory to get the number of blocks. Then we subtract total block size from available memory to get the external fragmentation. Then we enter the number of processes and then we enter the memory requirement for each of the processes. If a process size is greater than the fix block size the system will print "No" to indicate the process is not inputted into the block. For the internal Fragmentation we subtract a process size from its allocated block size,


## OUTPUT
- The output displays the 
PROCESS number,	MEMORY REQUIRED, whether the process has been ALLOCATED or not, INTERNAL FRAGMENTATION.
It also prints the total internal and total external fragmentation.

