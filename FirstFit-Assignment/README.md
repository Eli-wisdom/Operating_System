# First Fit
- This method keeps the free/busy list of jobs organized by memory location, low-ordered to high-ordered memory. In this method, first job claims the first available memory with space more than or equal  it’s size. The operating system doesn’t search for appropriate partition but just allocate the job to the nearest memory partition available with sufficient size.

## INPUT 
**nb**
- It accepts input for the number of blocks.

**nf**
- This variable contains the input for the number of files.

**Block** 
- This array accept input for a particular block size.

**file**
- Accept input for a particular file size.

## PROCESS

**temp**
- This variable holds the difference between the current block and the current file.

**bf**
- It checks if process has been assign to that block.

**ff**
 - It holds the Block containing that file.

**lowest**
- IT holds the value of fragmentation in a memory.

**frag Array**
- It holds the value of Fragment of block index.



## OUTPUT
- The output display  file number ( as I) , file size(as file[i]),Block Size( as block[ff[i]]) and fragment( as frag[i]).




