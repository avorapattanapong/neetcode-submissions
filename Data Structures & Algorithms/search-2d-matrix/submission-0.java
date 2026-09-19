class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLength = matrix.length;
        int colLength = matrix[0].length;

        int left = 0;
        int right = rowLength * colLength - 1;

        while (left <= right) {
            int mid = left + (right - left)/2;
            int row = mid / colLength;
            int col = mid % colLength;
            
            if (target < matrix[row][col]) {
                right = mid - 1;
            } else if (target > matrix[row][col]) {
                left = mid  + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
