package exo13;

public class Limousine extends Voiture {
  private final int longueur;

  public Limousine(int vitesseMax, double prixBase, String couleur, int longueur) {
    super(vitesseMax, prixBase, couleur);
    this.longueur = longueur;
  }

  @Override
  public double calculerPrixDeVente() {
    double prixVente = super.calculerPrixDeVente();
    if (longueur > 6) {
      prixVente *= 0.95;
    } else {
      prixVente *= 0.9;
    }
    return prixVente;
  }

}