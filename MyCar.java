package week1.day2;

public class MyCar {                            //class created with name MyCar
	
	public static  void main(String[] args) {
				 
		Car obj = new Car();                       //object created for class Car in the same package 
		
		String applyBreak = obj.applyBreak();       //methods of class Car  called from class MyCar
		                                             //using object of car class  
		System.out.println(applyBreak);
		
		int applyGear = obj.applyGear();
		System.out.println(applyGear);
		
		
		int switchAccelerate = obj.switchAccelerate();
		System.out.println(switchAccelerate);
	
		
	}
      

	
	

}
