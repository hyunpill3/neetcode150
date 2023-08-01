package binarysearch;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int low = 0, high = numRows * numCols;
        while (low < high) {
            int mid = (low + high) / 2;
            if (matrix[mid/numCols][mid%numCols] == target) return true;
            else if (matrix[mid/numCols][mid%numCols] < target) low = mid + 1;
            else high = mid;
        }
        return false;
    }
}
