package test;

public class Employee {
	public String eId,eName,eDesg;
	 public EAddress ea;//Reference Variable
	 public Employee(EAddress ea) {
	 this.ea=ea;
	 }
	 public String toString() {
	 return "EId:"+eId+"\nEName:"+eName+"\nEDesg:"+eDesg; }

}
