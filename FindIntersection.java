package week1.day2;

public class FindIntersection {     //class FindIntersection created 
public static void main(String[] args) {
	int[] array1 =new int[]  {3,2,11,4,6,7};// declared array 1
	int[] array2 = {1,2,8,4,9,7};            //declared array2
	 int count= 0;                            //Initialized variable count to 0
    int []a=new int[array1.length+array2.length];//intializing memory for array1 and array 2  
   
	for(int i = 0;i <(array1.length);i++)         // for loop till array1 length 
    {
        for(int j = 0;j < array2.length;j++)
        {
            if(array1[i]==array2[j])                 //to check i==j 
            {
                a[count]=array1[i];                     // intialize memory of a[count] to array1[i] 
                
                count++;                                 //increment the count to next element in the array  
            }
            
            else                                        //if i is not equal to j ...break and loop again 
            continue;
            
        }
    }
    System.out.println("Intersection of two  array is " +"  ");//if i==j print the number 
    for(int k = 0;k < count;k++)                                 //Initializing memory space of variable k to element which r i=j,
    {
        System.out.print("  "+a[k]+" ");                            //print the intersection 
    }
    
}
}

