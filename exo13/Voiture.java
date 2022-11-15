package exo13;

public class Voiture {

  // L'attribut final indique qu'on
  // ne peut pas redéfinir (=changer)
  // les valeurs de ces variables.
  private final int vitesseMax;
  private final double prixVoiture;
  private final String couleur;

  // Vu que les attributs sont final(s)
  // on doit tous les initialiser 
  // avant de sortir du constructeur.
  public Voiture(int vitesseMax, double prixBase, String couleur) {
    this.vitesseMax = vitesseMax;
    this.prixVoiture = prixBase;
    this.couleur = couleur;
  }

  public double calculerPrixDeVente() {
    return prixVoiture;
  }

}