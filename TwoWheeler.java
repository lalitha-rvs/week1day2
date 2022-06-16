package week1.day2;

public class TwoWheeler {   //CREATED CLASS WITH NAME TwoWheeler
	 
	
	//global  variables declaration 
	
	public int noOfWheels(){ 
		int number=4;        
	    return (number);      
	}
	
	
	public short noOfMirrors(){  
		short number=2;
	    return (number);
	    
	}
	public boolean isPunctured( ){
		boolean value=true;
	 return (value);}
	
	public  long ChasisNumber() {
		long number=123456798;
		return (number);
	
	}
	public  String bikeName() {
		String name="Access 125";
		return(name);
		
	}
	public  double runningKm(){
	double kiloMeters=6578998;
	return(kiloMeters);
	
	}
	
	
//call of global variables in main method 
	
	
public static void main(String[] args){
    TwoWheeler obj = new TwoWheeler();    //object created for class TwoWheeler
    
    int noOfWheels = obj.noOfWheels();   //methods called using object
    System.out.println(noOfWheels);      
    
    short noOfMirrors = obj.noOfMirrors();
    System.out.println(noOfMirrors);
    
    boolean isPunctured = obj.isPunctured();
    boolean ifPunctured=true;
	System.out.println(ifPunctured);
	
	long chasisNumber = obj.ChasisNumber();
	System.out.println(chasisNumber);
	
	String bikeName = obj.bikeName();
	System.out.println(bikeName);
	
	double runningKm = obj.runningKm();
	System.out.println(runningKm);
}
	

    
}



