package uvsq.pglp_3_2;

public class Manager extends Employee{
	
	public Manager(int Anc,int nbEm)
	{
		nbEmp=nbEm;
		Ancienete=Anc;
	}
	private int nbEmp;
	
	public int calculSalaire()
	{
		return super.calculSalaire()+nbEmp*100;
	}
}
