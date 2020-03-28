package uvsq.pglp_3_2;

public class Vendeur extends Employee {
  public int commision;
  
  /**
   * Constructeur du vendeur. 
   * @param anc : les années d'ancienete de l'employé
   * @param com : la commision du vendeur
   */
  public  Vendeur(int anc,int com) {
    if (com < 0 || anc < 0) {
      throw new IllegalArgumentException();
    }
    commision = com;
    ancienete = anc;
  }
  
  /**
   * Calcul du salaire de base d'un employee et ajout de la commision.
   */ 
  public int calculSalaire() {
    return super.calculSalaire() + commision;
  }
}