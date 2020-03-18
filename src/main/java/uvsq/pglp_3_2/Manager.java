package uvsq.pglp_3_2;

public class Manager extends Employee{
	
	public Manager(int Anc,int nbEm)
	{
		if(nbEm<0 || Anc<0) throw new IllegalArgumentException();
		nbEmp=nbEm;
		Ancienete=Anc;
	}
	public int nbEmp;
	
	public int calculSalaire()
	{
		return super.calculSalaire()+nbEmp*100;
	}
}
