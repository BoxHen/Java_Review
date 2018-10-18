#Partition a Linked List

	Partitioning a linked list around a given value and keeping the original order. 
	Given a linked list and a value x, partition it such that all nodes less than x come first, then all nodes with value equal to x 
	and finally nodes with value greater than or equal to x. The original relative order of the nodes in each of the three partitions 
	should be preserved. 

	Examples:
	Input : 1->4->3->2->5->2->3, 
        	x = 3
	Output: 1->2->2->3->3->4->5

	Input : 1->4->2->10 
        	x = 3
	Output: 1->2->4->10

	Input : 10->4->20->10->3 
	        x = 3
	Output: 3->10->4->20->10 