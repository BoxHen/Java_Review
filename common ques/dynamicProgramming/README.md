#Dynamic Programming

	The idea is very simple, If you have solved a problem with the given input, then save the result for future reference, 
	so as to avoid solving the same problem again

	There are two ways of doing this:
	1) Top-Down : Start solving the given problem by breaking it down. If you see that the problem has been solved already, 
	then just return the saved answer. If it has not been solved, solve it and save the answer. This is usually easy to 
	think of and very intuitive. This is referred to as Memoization.

	2) Bottom-Up : Analyze the problem and see the order in which the sub-problems are solved and start solving from the
	trivial subproblem, up towards the given problem. In this process, it is guaranteed that the subproblems are solved 
	before solving the problem. This is referred to as Dynamic Programming.

	The following code goes through simple examples using the fib seq to show recursion vs memoization.

