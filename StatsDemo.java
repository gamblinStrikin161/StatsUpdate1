import java.util.*;

@SuppressWarnings("unused")
public class StatsDemo {
	
	public static void main(String args[]){
		float numbers[] = {1, 3, 5, 6, 7, 4, 3, 5, 5, 5, 6, 9, 9};
		
		BasicData myData = new BasicData(numbers);
		
		myData.calculateMean(numbers);
		
		myData.calculateMode(numbers);
		
		System.out.println(myData.getMode());
	}//end of main method
}//end of Stats driver class