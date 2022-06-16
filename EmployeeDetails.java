package week1.day2;

public class EmployeeDetails {      
                                     //class created with name EmployeeDetails
   

	public void printEmployeeName(String empName,int empId) {   //variables declared for the class in the method
		
            System.out.println("employee id = "+empId);
	        System.out.println("employeeName = "+empName);}
		
	public void getEmployeeAdress(String empAddress) {
		
	         System.out.println("Employee Adress = " +empAddress);
		}
	public void printEmployeeSalary(double empSalary) {
		      System.out.println("employee salary = "+ empSalary);
		}
		public void printEmployeeMobileNumber(long mobNum) {
			System.out.println("employee mobile number ="+mobNum);}
		
			
	public static void main(String[] args) {
			EmployeeDetails obj=new EmployeeDetails();//object created for the class 
			obj.printEmployeeName("Lalitha",74955 );  //methods called using the object 
			obj.getEmployeeAdress("Bengaluru");
			obj.printEmployeeSalary(150000);
			obj.printEmployeeMobileNumber(1234567890);
		}
			
		
		
	}
	


