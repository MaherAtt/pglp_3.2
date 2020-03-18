package uvsq.pglp_3_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmployee {

	@Test
	public void testConstructeurManager() {
		Manager m=new Manager(15,6);
		assert(m.Ancienete==15 && m.nbEmp==6);
	}
	
	public void testConstructeurVendeur()
	{
		Vendeur v=new Vendeur(14,2);
		assert(v.Ancienete==14 && v.Commision==2);
	}

}
