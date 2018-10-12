public class rotateMatrix90{
  public static void main(String[] args){
    int[][] input_matrix = {{1,2,3,4,5}, {6,7,8,9,8}, {1,2,3,4,5}, {6,7,8,9,8}, {1,2,3,4,5}};  //5 x 5 matrix
    System.out.println("Input matrix is:");
    printMatrix(input_matrix); // old
    rotateMatrix(input_matrix);
    System.out.println("Output matrix is:");
    printMatrix(input_matrix); // new
  }
  /*===============================Change Matrix================================*/
  public static void rotateMatrix(int[][] matrix){
    int temp;
    int xlength = matrix.length;
    for(int x=0; x<(xlength/2); x++){ // divides length by two and round up to whole #
      for(int y=x; y<(xlength-x-1); y++){
        temp = matrix[x][y];
        matrix[x][y] = matrix[y][xlength-1-x]; // top right to top left
        matrix[y][xlength-1-x] = matrix[xlength-1-x][xlength-1-y]; // bottom right to top right
        matrix[xlength-1-x][xlength-1-y] = matrix[xlength-1-y][x]; //bottom left to bottom right
        matrix[xlength-1-y][x] = temp;
      }
    }
  }
  /*================================Print Matrix==================================*/
  static void printMatrix(int[][] matrix){
    for(int i=0; i<matrix.length; i++){
      for(int j=0; j<matrix[0].length; j++){
        System.out.print(matrix[i][j]+" ");
      }
      System.out.println(""); // newline
    }
    System.out.println(""); // newline
  }
}
