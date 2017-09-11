
public class Search {
	public int binarySearch(int[] inputArr, int key) {
        
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }//end of if statement
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }//end of while loop
        return -1;
    }//end of binarySearch method
	
    public int recursiveBinarySearch(int[] sortedArray, int start, int end, int key) {
        
        if (start < end) {
            int mid = start + (end - start) / 2;  
            if (key < sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, start, mid, key);
                 
            } else if (key > sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, mid+1, end , key);
                 
            } else {
                return mid;   
            }
        }//end of if statement
        return -(start + 1);  
    }//end of recursiveBinarySearch method
	
}//end of Search class
