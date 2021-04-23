# Best Fit

- This method sorts the free/busy list from smallest to largest by number. This method allows the operating system to efficiently use memory by searching the entire memory according to the size of the given job and allocating it to the closest-fitting free partition in the memory. The jobs are classified in ascending order from smallest to largest.

## INPUT
**nb**
- It accepts input for the number of blocks.

**nf**
- This variable contains the input for the number of files.

**b**
- This array accept input for a particular block size.

**f**
- Accept input for a particular file size.

## PROCESS

**temp**
- This variable holds the difference between the current block and the current file.

**bf**
- It checks if process has been assigned to that block.

**ff**
- It holds the Block containing that file.

**lowest**
- It holds the value of fragmentation in a memory.

**frag Array**
- It holds the value of Fragment of block index.



## OUTPUT
- The output display file number ( as I) , file size(as file[i]),Block Size( as block[ff[i]]) and fragment( as frag[i]);




