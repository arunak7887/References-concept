package test;
import java.util.*;
public class DemoRef2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		 EAddress ea = new EAddress();
		 Employee e = new Employee(ea);//Con_Call
		 Read r = new Read(e);//Con_Call
		 Display d = new Display(e);//Con_Call
		 r.read(s);
		 d.dis();
		 s.close();

	}

}
