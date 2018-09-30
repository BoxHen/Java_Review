#Hour Glass Sum in 6x6 Array 

Given a  2D Array, :
	1 1 1 0 0 0
	0 1 0 0 0 0
	1 1 1 0 0 0
	0 0 0 0 0 0
	0 0 0 0 0 0
	0 0 0 0 0 0

	We define an hourglass in  to be a subset of values with indices falling in this pattern in 's graphical representation:

	a b c
  	  d
	e f g

	The hourglass sum is the sum of an hourglass' values. here the excercise is to calculate the hourglass sum for every hourglass, and print the maximum hourglass sum.
	For example, given the 2D array:

	-9 -9 -9  1 1 1 
 	 0 -9  0  4 3 2
	-9 -9 -9  1 2 3
 	 0  0  8  6 6 0
 	 0  0  0 -2 0 0
 	 0  0  1  2 4 0

	We calculate the following  hourglass values:

	-63, -34, -9, 12, 
	-10,   0, 28, 23, 
	-27, -11, -2, 10, 
	 9 ,  17, 25, 18

	Our highest hourglass value is  from the hourglass:

	0 4 3
	  1
	8 6 6

	Here we realize that there are 16 of these hourglass values


