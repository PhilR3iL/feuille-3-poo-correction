package exo13;

public class Camion extends Voiture {

  private int poids;

  public Camion(int vitesseMax, double prixBase, String couleur, int poids) {
    super(vitesseMax, prixBase, couleur);
    this.poids = poids;
  }

  @Override
  public double calculerPrixDeVente() {
    /*
     * double prixVente = super.calculerPrixDeVente();
     * if(poids < 2000){
     * prixVente *= 0.9;
     * }else{
     * prixVente *= 0.8;
     * }
     * return prixVente;
     */
    return ((poids < 2000) ? 0.9 : 0.8) * super.calculerPrixDeVente();
  }

}