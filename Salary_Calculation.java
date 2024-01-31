import java.util.ArrayList;

interface Employee{
	
	double getCalculateGrossSalary();
	double getCalculateNetSalary();
	double getCalculateTax();
	//ArrayList<Employee> labourDeptViolationReportList = new ArrayList();

}

class Manager implements Employee {

	private float numberOfWorkingHours;
	private int id;
	private String name;
	
	
	Manager(float numberOfWorkingHours,int id,String name){
		this.numberOfWorkingHours = numberOfWorkingHours;
		this.id = id;
		this.name = name;
	}
	
	public float getNumberOfWorkingHours(){
		return numberOfWorkingHours;
	}
	


	@Override 
	public double getCalculateGrossSalary(){
		
		if (getNumberOfWorkingHours() > 60){
			double grossSalary = 60 * 500;
			return grossSalary;
			
		}else {
			double grossSalary = getNumberOfWorkingHours() * 500;
			return grossSalary;
		}
		
	}

	@Override
	public double getCalculateTax(){
		double tax = getCalculateGrossSalary() *.30;
		return tax;
	}

	@Override
	public double getCalculateNetSalary(){
		double netSalary = getCalculateGrossSalary() - getCalculateTax();
		return netSalary;

	}

	public String toString(){
		return "Working Hours:-" + numberOfWorkingHours + " ,id:- " + id + " ,name:- " + name;
	}

	
}
class Supervisor implements Employee {

	private float numberOfWorkingHours;
	private int id;
	private String name;
	
	
	Supervisor(float numberOfWorkingHours,int id,String name){
		this.numberOfWorkingHours = numberOfWorkingHours;
		this.id = id;
		this.name = name;
	}
	
	public float getNumberOfWorkingHours(){
		return numberOfWorkingHours;
	}
	


	@Override 
	public double getCalculateGrossSalary(){
		if (getNumberOfWorkingHours() > 60){
			double grossSalary = 40 * 300 + 20 * 450;
			return grossSalary;
		} else {
			double grossSalary =  (getNumberOfWorkingHours() - 40) * 450 + 40 * 300 ;
			return grossSalary;
		}
	}

	@Override
	public double getCalculateTax(){
		double tax = getCalculateGrossSalary() *.30;
		return tax;
	}

	@Override
	public double getCalculateNetSalary(){
		double netSalary = getCalculateGrossSalary() - getCalculateTax();
		return netSalary;
	}

	public String toString(){
		return "Working Hours:-" + numberOfWorkingHours + " ,id:- " + id + " ,name:- " + name;
	}

	
}

class Worker implements Employee {

	private float numberOfWorkingHours;
	private int id;
	private String name;
	
	
	Worker(float numberOfWorkingHours,int id,String name){
		this.numberOfWorkingHours = numberOfWorkingHours;
		this.id = id;
		this.name = name;
	}
	
	public float getNumberOfWorkingHours(){
		return numberOfWorkingHours;
	}
	


	@Override 
	public double getCalculateGrossSalary(){
		if (getNumberOfWorkingHours() > 60 ){
			double grossSalary = 40 * 200 + 20 * 300;
			return grossSalary;
		} else {
			double grossSalary = (getNumberOfWorkingHours() - 40) * 300 + 40 * 200 ;
			return grossSalary;
		}
	}

	@Override
	public double getCalculateTax(){
		double tax = getCalculateGrossSalary() *.30;
		return tax;
	}

	@Override
	public double getCalculateNetSalary(){
		double netSalary = getCalculateGrossSalary() - getCalculateTax();
		return netSalary;
	}

	public String toString(){
		return "Working Hours:-" + numberOfWorkingHours + " ,id:- " + id + " ,name:- " + name;
	}

	
}

public class Exam2{
	public static void main(String[] args){
		
		Manager m1 = new Manager(61f , 4 ,"Nia");
		
		Supervisor s1 = new Supervisor(56f, 1, "Divya");
		Supervisor s2 = new Supervisor(65f, 2, "Reena");

		Worker w1 = new Worker(49f, 3, "Shanti");
		Worker w2 = new Worker(56f, 4, "Alice");
		Worker w3 = new Worker(59f, 5, "Bob");
		Worker w4 = new Worker(69f, 6, "Riya");
		Worker w5 = new Worker(45f, 7, "Chef");
		Worker w6 = new Worker(42f, 8, "Chefland");
		Worker w7 = new Worker(60f, 9, "Meena");
		Worker w8 = new Worker(90f, 10, "Teena");
		Worker w9 = new Worker(56f, 11, "Sonam");
		Worker w10 = new Worker(48f, 12, "Vanshika");	

		ArrayList<Employee> employeeList = new ArrayList<>();

		employeeList.add(m1);
		employeeList.add(s1);
		employeeList.add(s2);
		employeeList.add(w1);
		employeeList.add(w2);
		employeeList.add(w3);
		employeeList.add(w4);
		employeeList.add(w5);
		employeeList.add(w6);
		employeeList.add(w7);
		employeeList.add(w8);
		employeeList.add(w9);
		employeeList.add(w10);

		
		double companyGrossSalary = 0;
		double companyTax = 0;
		double companyNetSalary = 0;

		for(Employee employee  :employeeList){
			companyGrossSalary = companyGrossSalary + employee.getCalculateGrossSalary();
			companyTax = companyTax + employee.getCalculateTax();
			companyNetSalary = companyNetSalary + employee.getCalculateNetSalary();
				
		}
		System.out.println(companyGrossSalary);
		System.out.println(companyTax);
		System.out.println(companyNetSalary);		
		//System.out.println(labourDeptViolationReportList);	
	}
}	
