package week1.day2;



public class PrintDuplicateInArray { //class PrintDuplicateInArray
	public static void main(String[] args) {
		int [] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};//declared the array input 
		
System.out.println(" Duplicate In  Array is :");
	
	
	for( int i=0;i<arr.length;i++) {      //for loop till length of the array 
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {            //if variable i =j in the loop break and print the number 
				System.out.println(arr[j] );
				
			}
		}
			
	}
		
	
		
	}
	
		
		
		
		
	}


