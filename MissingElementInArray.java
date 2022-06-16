package week1.day2;

import java.util.Arrays;        //package imported for arrays

public class MissingElementInArray {  //class MissingElementArray created 
 
	public static void main(String[] args) {   
	
		int[] arr =new int[] {1,2,3,4,7,6,8};//array declared 
	
		System.out.println("the original array is :" );  
	
	for(int i=0;i<arr.length;i++) { //for loop  till the length of the array
		
	System.out.print(arr[i]+ "  ");}   
	{System.out.println(".........");}
	System.out.println("the modified array is :");
	
		Arrays.sort(arr);                  //function for sorting array 
		
	for(int i=0;i<arr.length;i++)           // for loop iteration till length of the array
		
	{
		
	System.out.println( "  "+arr[i] + " " );}//print the sorted array
	
	
		
}


}
