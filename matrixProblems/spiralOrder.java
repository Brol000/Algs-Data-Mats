//PRINT A GIVEN MATRIX IN SPRIAL ORDER

//row and column pointers tracking start and end positions, marking "progress"
//looping pointer tracking over rows and columns without disturbing markers
Public Class spiralOrder{

  public static void main(String[] args){

  }

  //function runs in O(m*n) time
  //loops in spiral pattern -> |
  //                        <- v
  public void printSpiral(int[][] matrix){
    int rowStart = 0;
    int rowEnd = matrix.length - 1;
    int colStart = 0;
    int colEnd = matrix[0].length - 1;

    int i;

    while((rowStart <= rowEnd) && (colStart <= colEnd)){


    }

  }//end printSpiral function
}//end spiralOrder class
