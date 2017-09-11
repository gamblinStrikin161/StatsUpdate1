import java.util.*;

@SuppressWarnings("unused")
public class BasicData {
	private Sort dataSort = new Sort();		//Sort object used to sort data sets
	private float mean;			//field to store the mean
	private float median;		//field to store the median
	private float mode;			//field to store the mode
	
	/**
	 * This no-arg constructor will initiate the fields to zero 
	 */
	public BasicData(){
		mean = 0;
		median = 0;
		mode = 0;
	}
	
	/**
	 * This constructor will initiate the fields with the assigned values passed by the user and will sort the values in ascending order
	 */
	public BasicData(float[] nums){
		dataSort.bubSort(nums);
	}
	
	/**
	 * This method will accept an array of numbers and will sum them up, divide them by
	 * the number of values in the array and return the result as a float
	 * 
	 * @param: An array of numbers as floats
	 * @return: None
	 * @throws: Nothing is implemented
	 */
	public void calculateMean(float nums[]){
		float sum = 0;		//initializing the accumulator to zero
		for(int i = 0; i < nums.length; i++){
			sum += nums[i];			//getting all the values from the array and adding them
		}
		mean = sum / nums.length;
	}//end of calculateMean method
	
	/**
	 * This method will accept an array of numbers and will sum them up, divide them by
	 * the number of values in the array and return the result as a float
	 * 
	 * @param: None
	 * @return: The average of all the numbers in the array as a float
	 * @throws: Nothing is implemented
	 */
	public float getMean(){
		return mean;		//returning the average of all the numbers
	}
	
	/**
	 * This method accepts an array of values sorted in low-high order.
	 * It then calculates the median of those values based on whether the array
	 * is an even or odd quantity of numbers.
	 * @param: A sorted array of float values
	 * @return: none
	 * @throws: Nothing is implemented
	 */
	public void calculateMedian(float n[]){
		if(n.length % 2 == 0) {
			median = (n[n.length / 2] + n[(n.length / 2) + 1]) / 2;		//If the data set range is even
		}
		else
			median = n[(n.length / 2) + 1];			//If the data set range is odd
	}//end of calculateMedian method
	
	/**
	 * This method will return the calculated median
	 * 
	 * @param: None
	 * @return: The median of all the numbers in the array as a float
	 * @throws: Nothing is implemented
	 */
	public float getMedian(){
		return median;
	}//end of getMedian method

	/**
	 * This method will return the most popular number or numbers in a given data set
	 * @param: None
	 * @return: The most popular number(s) in a data set as float values
	 * @throws: Nothing is implemented
	 */
	public float getMode() {
		return mode;
	}

	/**
	 * This method will calculate the mode (most popular number in a data set) by
	 * counting the number of times a number is repeated and then checking to see 
	 * if it is the most repeated (popular).
	 * @param: A data set of values containing float numbers
	 * @return: Nothing
	 * @throws: Nothing is implemented
	 */
	public void calculateMode(float nums[]) {
	    float maxValue, maxCount = 0;		//This variables will store the values to be compare the most popular number

	    //This will loop through the data set in order to find the most repeated values
	    for (int i = 0; i < nums.length; ++i) {
	        int count = 0;
	        for (int j = 0; j < nums.length; ++j) {
	            if (nums[j] == nums[i]) ++count;		//Comparing which value from the data set was repeated most
	        }
	        if (count > maxCount) {
	            maxCount = count;
	            maxValue = nums[i];
	            mode = maxValue;			//Assigning most popular value to the mode field
	        }//end of if statement
	    }//end of for loop
	}//end of calculatingMode method
}//end of class BasicData