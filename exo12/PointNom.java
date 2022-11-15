public class PointNom extends Point {
  private String nom;

  public PointNom(String nom, int x, int y){
    setPointNom(nom, x, y);
  }
  
  public void setPointNom(String nom, int x, int y) {
    setPoint(x, y);
    this.nom = nom;
  }

  public void affCoordNom() {
    System.out.println("Le point " + nom + " a pour coordonnées :");
    super.afficheCoords();
  }

}