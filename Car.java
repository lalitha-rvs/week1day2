package week1.day2;

public class Car {                                       //created class name Car
                                                         //methods of the class are created
	
	public String  applyBreak(){
    String Break = "yes";
   
	return Break;
    }

    public  int applyGear() {
    	int Gear=3;
    	
		return Gear;
    }
    public int switchAccelerate() {
    	int accelerate=65;
    	
		return accelerate;
    	
    }
                                                         //methods called in main method
    public static void main(String[] args)
    {
    	Car obj=new Car();                                 //object created for the class Car
    	String applyBreak = obj.applyBreak();             
    	 System.out.println("apply break="+applyBreak);    //print the called method value 
    	
    	 int applyGear = obj.applyGear();                 //methods called using object
    	
    	System.out.println("apply Gear="+applyGear);
    	  
    	int switchAccelerate = obj.switchAccelerate();
    	 
    	System.out.println("switch accelerate to  "+switchAccelerate );
    	
    }
}
