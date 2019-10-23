package project1;

public class Tempemp extends Employee{
	int days;
	
	
		
	public Tempemp(String name, String surname, String address, double salary, int days) {
		super(name, surname, address, salary);
		this.days = days;
	}
	
	public double claculateNetSalary() {
		return(days*getSalary()/30);
	}
		
	public String toString() {
		return"TempEmp [days=" + days + ", Name=" + Name + ", Surname=" + Surname + ", Address=" + Address + "]"+"days"+days;
	}
	public static void main(String[] arg) {
			// TODO Auto-generated method stub
	Tempemp t=new Tempemp("Akhil","s","hyderabad",32000,20);
	System.out.println(t.claculateNetSalary());
	
	
	}
		
	}



