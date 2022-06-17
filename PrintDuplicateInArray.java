package week1.day2;






public class PrintDuplicateInArray { //class PrintDuplicateInArray
	public static void main(String[] args) {
		int [] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};//declared the array input 
		int length=arr.length;
		System.out.println(length);
		int count=0;
             	
	for( int i=0;i<arr.length-1;i++) {                           //for loop iteration  till length-1 of the array (first loop)
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j])                           //if variable i =j in the loop break and print the number  
			{ count=count+1;
			}
		}if(count>=1){
			                                       
				System.out.println("the count for the number " +arr[i]+  " is " +count );
				
			}
		}
			
	}
		
	
		
	}
	
		
