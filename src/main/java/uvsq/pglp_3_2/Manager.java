package uvsq.pglp_3_2;

public class Manager extends Employee {
  public int nbEmp;
  /**
  * Constructeur du manager. 
  * @param anc : les années d'ancienete de l'employé
  * @param nbEm : nombre d'employee sous la responsabilité 
  */
  
  public Manager(int anc,int nbEm) {
    if (nbEm < 0 || anc < 0) { 
      throw new IllegalArgumentException(); 
    }
    nbEmp = nbEm;
    ancienete = anc;
  }

  /**
   * Calcul du salaire de base d'un employee et ajout de la prime manager.
   */ 
  public int calculSalaire() {
    return super.calculSalaire() + nbEmp * 100;
  }
}
