# C-Scan
 - In the C-SCAN algorithm, the disk's arm travels in one direction, servicing requests until it hits the last cylinder, then hops to the last cylinder in the opposite direction, without servicing any requests, before turning around and servicing the remaining requests.



## Input

- Memory size
- Page size
- Number of Processes
- Pages required
- Logical Address
- Page Number
- Page Table


## Process
- Finding the Physical Address
- Number of pages
- assign number of pages to rempages


## Output
- Display the Physical address

## Advantages

- The C-SCAN Algorithm is the improved successor to the SCAN Scheduling Algorithm.
- The Head move from one end to the other of the disk while serving all the requests in between.
- The waiting time for the cylinders which were just visited by the head is reduced in C-SCAN compared to the SCAN Algorithm.

## Disadvantages 

- More seek movements are caused in C-SCAN compared to SCAN Algorithm.
- In C-SCAN even if there are no requests left to be serviced the Head will still travel to the end of the disk unlike SCAN algorithm.