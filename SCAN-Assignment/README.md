# SCAN

##  In this algorithm, the disk arm travels in one direction until it reaches the end, satisfying all requests in its path, before turning around and moving in the opposite direction, satisfying requests in its path.

## Advantages 
-- Scan scheduling algorithm is simple and easy to understand and implement.
Starvation is avoided in SCAN algorithm.
-- Low variance Occurs in waiting time and response time.


## Disadvantages 
-- For the cylinders that the head has just visited, there is a long wait.
Despite the absence of demands to be serviced, the head travels to the end of the disk in SCAN.