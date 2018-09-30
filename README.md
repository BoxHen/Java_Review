# Java_Review
Will go over basics of java 

common_ques will cover data structures such as arrays & Strings, Linked Lists, stacks & queues, and tree & graphs.

    1. Nqueens.java: 
    The N Queen is the problem of placing N chess queens on an N×N chessboard so that no two queens attack each other.For       example,       following is a solution for 4 Queen problem:
        {0,  1,  0,  0}
        {0,  0,  0,  1}
        {1,  0,  0,  0}
        {0,  0,  1,  0}
    Two ways to do this are: 
        a.Generate all possible configurations of queens on board and print a configuration that satisfies the given constraints.
        
        b.To place queens one by one in different columns, starting from the leftmost column. When we place a queen in a column,                   we check for clashes with already placed queens. In the current column, if we find a row for which there is no clash, we mark             this row and column as part of the solution. If we do not find such a row due to clashes then we backtrack and return false.
