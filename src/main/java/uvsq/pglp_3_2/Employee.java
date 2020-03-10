package uvsq.pglp_3_2;

public abstract class Employee {
	
	protected int Ancienete;
	public  int calculSalaire() {
		return 1500+20*Ancienete;
	}
	
}
