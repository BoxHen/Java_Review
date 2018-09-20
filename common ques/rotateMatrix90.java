public class rotateMatrix90{
  public static void main(String[] args){
    int[][] input_matrix = new int[5][5];  //5 x 5 matrix
  }
  public static void rotateMatrix(int[][] matrix){
    int temp;
    int xlength = matrix.length;
    for(int x=0; x<(xlength/2); x++){ // divides length by two and round up to whole #
      for(int y=x; y<(xlength-x-1); y++){
        temp = matrix[x][y];
        matrix[x][y] = matrix[y][xlength-1-x]; // top right to top left
        matrix[x][xlength-1-x] = matrix[xlength-1-x][xlength-1-x]; // bottom right to top right
        matrix[xlength-1-x][xlength-1-x] = matrix[xlength-1-x][y]; //bottom left to bottom right
        matrix[xlength-1-x][y] = temp;
      }
    }
  }
}
