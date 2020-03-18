package uvsq.pglp_3_2;

public class Vendeur extends Employee {
	public int Commision;
	
	public  Vendeur(int Anc,int Com)
	{
		if(Com<0 || Anc<0) throw new IllegalArgumentException();
		Commision=Com;
		Ancienete=Anc;
	}
	public int calculSalaire() {
			
		return super.calculSalaire()+Commision;		
	}
	
}
