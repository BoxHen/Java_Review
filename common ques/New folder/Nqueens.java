class Nqueens{
  /*----------------------------------------------------------------------------------------------*/
  public static void main(String[] args){
    Nqueens test = new Nqueens();
    test.Solver();
  }
  /*----------------------------------------------------------------------------------------------*/
  //
  boolean isSafe(int[][] arr, int i, int colQueen){ // checks if queen is safe in this positon
    int row, col;
    for(col=0; col<colQueen; col++){
      if(arr[i][col] == 1) return false; // if 1(queen spotted) then not safe
    }
    for(row=i-1, col=colQueen-1; col>=0 && row>=0; row --, col--){
      if(arr[row][col] == 1) return false;
    }
    for(row=i+1, col=colQueen-1; row<arr.length && col>=0; row++, col--){
      if(arr[row][col] == 1) return false;
    }
    return true;
  }
  /*----------------------------------------------------------------------------------------------*/
  boolean placeQueen(int[][] arr, int colQueen){ // backtrack to find where to place queens
    if(colQueen >= arr.length){ //if all queens are placed
      return true;
    }
    for(int i=0; i<arr.length; i++){
      if(isSafe(arr, i, colQueen)){
        arr[i][colQueen] = 1; // set this to be true(queen placed)
        if(placeQueen(arr, colQueen+1) == true) return true; // recursion to test the next column
        arr[i][colQueen] = 0; // backtrack, make 0(queen cannot be placed here) and try next row in that column
      }
    }
    return false; // if we get through all the rows and cannot find a safe spot the not possible
  }
  /*----------------------------------------------------------------------------------------------*/
  boolean Solver(){
    int[][] board = {{0, 0, 0, 0},
                     {0, 0, 0, 0},
                     {0, 0, 0, 0},
                     {0, 0, 0, 0},
                   };
    if(placeQueen(board, 0) == false){
      System.out.println("No placement is possible");
      return false;
    }
    printBoard(board);
    return true;
  }
  /*----------------------------------------------------------------------------------------------*/
  void printBoard(int[][] arr){
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr.length; j++){
        System.out.print(" "+arr[i][j]+" ");
      }
      System.out.println("");
    }
  }
}
