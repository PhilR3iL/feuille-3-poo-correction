package exo13;
public class Renault extends Voiture{
  private int anneeFabrication;
  private int reductionConstructeur;

  public Renault(int vitesseMax, double prixBase, String couleur, int anneeFabrication, int reductionConstructeur) {
    super(vitesseMax, prixBase, couleur);
    this.anneeFabrication = anneeFabrication;
    this.reductionConstructeur = reductionConstructeur;
  }

  @Override
  public double calculerPrixDeVente(){
    return super.calculerPrixDeVente() - ((double) reductionConstructeur);
  }
}