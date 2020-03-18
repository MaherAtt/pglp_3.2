package uvsq.pglp_3_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmployee {

	@Test
	public void testConstructeurManager() {
		Manager m=new Manager(15,6);
		assert(m.Ancienete==15 && m.nbEmp==6);
	}
	@Test
	public void testConstructeurVendeur()
	{
		Vendeur v=new Vendeur(14,2);
		assert(v.Ancienete==14 && v.Commision==2);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testConstructeurVendeurNegative()
	{
		Vendeur v=new Vendeur(-5,2);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testConstructeurVendeurNegative2()
	{
		Vendeur v=new Vendeur(5,-2);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testConstructeurManagerNegative()
	{
		Manager v=new Manager(-5,2);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testConstructeurManagerNegative2()
	{
		Manager v=new Manager(5,-2);
	}
	
	@Test
	public void testCalculSalaireManager()
	{
		Manager v=new Manager(5,2);
		assert(v.calculSalaire()==1800);
	}
	
	@Test
	public void testCalculSalaireVendeur()
	{
		Vendeur v=new Vendeur(5,2);
		assert(v.calculSalaire()==1602);
	}

}
