
public class Sort {
	
	private int[] array;
    private int[] tempMergArr;
    private int length;
    
    public Sort(){
    	
    }//end of constructor
	
	/**
	 * This method accepts an array of float values and sorts them
	 * from low to high
	 * @param: An array of numbers as floats
	 * @return: None
	 * @throws: Nothing is implemented
	 */
	public void bubSort(float nums[]){
		int n = nums.length;		//This is for looks
		float temp = 0;				//this will hold the value of an array number

		for(int i = 0; i < n; ++i){			
			for(int j = 1; j < (n - i); j++){
				if(nums[j-1] > nums[j]){   //Compare array[0] & array[1]
					temp = nums[j-1];	   //If array[0] > array [1] swap it
					nums[j-1] = nums[j];   //Repeat the same steps for array[1] to array[n-1]
					nums[j] = temp;		  
				}//end of if statement
			}//end of 'j' for loop
		}//end of 'i' for loop
	}//end of bubSort method

	public int[] selectionSort(int[] arr){

		for (int i = 0; i < arr.length - 1; i++)
		{
			int index = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[index]) 
					index = j;

			int smallerNumber = arr[index];  
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}//end of for loop
		return arr;
	}//end of selectionSort method
	
	public int[] insertionSort(int[] input){
        
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }//end of if statement
            }//end of nested for loop
        }//end of for loop
        return input;
    }//end of insertionSort Method
	
	public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        mergeSort(0, length - 1);
    }//end of sort method
 
    private void mergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            mergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            mergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }//end of if statement
    }//end of mergeSort method 
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }//end of for loop
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }//end of while loop
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }//end of while loop
    }//end of mergeParts
	
}//end of Sort class
