package test;
import java.util.*;
public class Read {
	public Employee e;
	public Read(Employee e) {
	 this.e=e;
	 }
	 public void read(Scanner s)
	 {
	 System.out.println("Enter the EmpId:");
	 e.eId = s.nextLine();
	 System.out.println("Enter the EmpName:");
	 e.eName = s.nextLine();
	 System.out.println("Enter the EmpDesg:");
	 e.eDesg = s.nextLine();
	 System.out.println("Enter the HNO:");
	 e.ea.hNO = s.nextLine();
	 System.out.println("Enter the SName:");
	 e.ea.sName = s.nextLine();
	 System.out.println("Enter the City:");
	 e.ea.city = s.nextLine();
	 System.out.println("Enter the PinCode:");
	 e.ea.pinCode = s.nextInt();
	 }
	}

