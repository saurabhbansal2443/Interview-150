class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix); 
        reverseRow(matrix); 
    }

    // transpose 

    public void transpose(int[][] matrix){

        for(int r=0;r<matrix.length ; r++){
            for(int c = r ; c<matrix.length ; c++){
                int k = matrix[r][c]; 
                matrix[r][c] = matrix[c][r]; 
                matrix[c][r] = k ; 
            }
        }
    }

    public void reverseRow(int[][] matrix){
        
        for(int i=0 ; i<matrix.length ; i++){
            int[] arr = matrix[i]; 

            int start = 0 ; 
            int end = arr.length-1; 

            while(start<end){
                int k = arr[start]; 
                arr[start]= arr[end]; 
                arr[end] = k ; 
                start++; 
                end--; 
            }
        }
    }
}