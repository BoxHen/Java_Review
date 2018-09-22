import java.util.HashSet;

public class zeroMatrix{
  public static void main(String[] args){
    int[][] matrix = {{1,2,3,4,5}, {6,7,0,9,8}, {1,2,3,4,5}, {6,7,8,9,8}, {0,2,3,4,5}};  //5 x 5 matrix

    System.out.println("Input matrix is:");
    printMatrix(matrix); // old
    matrix(matrix);
    System.out.println("Output matrix is:");
    printMatrix(matrix); // new
  }
  /*===============================Change Matrix================================*/
  public static void matrix(int[][] matrix){
    HashSet<Integer> zeroLocationRow = new HashSet<>();
    HashSet<Integer> zeroLocationCol = new HashSet<>();

    for(int i=0; i<matrix.length; i++){ // finds all zero's in matrix
      for(int j=0; j<matrix[0].length; j++){ //matrix[0].length think about it like this {(6 in here), (6 in here), (6 in here), (6 in here), (6 in here)}
         if(matrix[i][j] == 0){
           zeroLocationRow.add(i);
           zeroLocationCol.add(j);
         }
      }
    }

    for(int i=0; i<matrix.length; i++){
      for(int j=0; j<matrix[0].length; j++){
        if(zeroLocationRow.contains(i) | zeroLocationCol.contains(j)){ // if this row or column had a zero in it make it zero
          matrix[i][j] = 0;
        }
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
