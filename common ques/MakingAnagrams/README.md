#Make an anagram from two strings by counting how many characters need to be deleted until they are anagrams

	Input Format:
	The first line contains a single string, a 
	The second line contains a single string, b

	Constraints:
	The strings a and b consist of lowercase English alphabetic letters ascii[a-z].

	Output Format
	Print a single integer denoting the number of characters you must delete to make the two strings anagrams of each other.

	Sample Input
	cde
	abc

	Sample Output
	4

	Explanation
	We delete the following characters from our two strings to turn them into anagrams of each other:
		1.Remove d and e from cde to get c.
		2.Remove a and b from abc to get c.
	We must delete  characters to make both strings anagrams, so we print 4 on a new line.