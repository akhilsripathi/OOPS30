package project1;

public class Permemp extends Employee {
	float pf;
public Permemp(String name, String surname, String address, double salary,float pf) {
	super(name, surname, address, salary);
	// TODO Auto-generated constructor stub
	this.pf=pf;
}

public double claculateNetSalary() {
	return( getSalary() +(getSalary() * pf/100));
	
}
public String toString() {
	return"TempEmp [pf=" + pf + ", Name=" + Name + ", Surname=" + Surname + ", Address=" + Address + "]"+"days"+pf;
}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	Permemp t=new Permemp("Akhil","Sripathi","Hyd",25000,(float) 0.2);
	Permemp t1=new Permemp("abd","M","Hyd",50000,(float) 0.5);
	Permemp t2=new Permemp("dhoni","v","Hyd",40000,(float) 0.3);
	Permemp t3=new Permemp("akki","k","Hyd",60000,(float) 0.5);
	
System.out.println(t.claculateNetSalary());
System.out.println(t1.claculateNetSalary());
System.out.println(t2.claculateNetSalary());
System.out.println(t3.claculateNetSalary());

}

}

