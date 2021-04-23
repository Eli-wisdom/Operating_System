# MULTIPROGRAMMING WITH A VARIABLE NUMBER OF TASKS
- MVT (Multiprogramming with a Variable number of Tasks) is the memory management technique in which each job gets just the amount of memory it needs.

## INPUT
**memoryAvailableV**
- It holds the total memory available.

**MemoryR**
- It holds the memory required for process.


## PROCESS
- Base on the input  we assign memoryAvailableV to external fragment. Then we check if there is a space in the memory  for the next input(process).if this condition is true we subtract the process from the  external fragment. Else the memory will stop accepting input. During this process the system ask if you want to continue inputting or not, this condition will continue till the memory can no longer accept any input. 

## OUTPUT
- It displays the process its memory allocation.
