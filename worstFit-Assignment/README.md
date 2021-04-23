# Worst Fit allocates
Worst Fit allocates a process to the partition which is largest sufficient among the freely available partitions available in the main memory. If a large process comes at a later stage, then memory will not have space to accommodate it.



## INPUT
**nb**
- It accepts input for the number of blocks.

**nf**
- This variable contains the input for the number of files.

**block** 
- This array accept input for a particular block size.

**file**
- Accept input for a particular file size.

## PROCESS

**temp**
- This variable holds the difference between the current block and the current file.

**bf**
- It checks if process has been assigned to that block.

**ff**
- It holds the Block containing that file.

**lowest**
- IT holds the value of fragmentation in a memory.

**frag**
- It holds the value of Fragment of block index.



## OUTPUT
- The output display  file number ( as I) , file size(as file[i]),Block Size( as block[ff[i]]) and fragment( as frag[i]).




