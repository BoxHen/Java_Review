#String Compression

	The length after compression must always be smaller than or equal to the original array.
	If the new compressed length is longer than original, return the original string
	Input:
	["a","a","b","b","c","c","c"]

	Output:
	Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]

	Explanation:
	"aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is replaced by "c3".