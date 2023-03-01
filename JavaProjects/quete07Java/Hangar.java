// Crée une classe Hangar qui possédera une méthode main()
public class Hangar {
    public static void main(String[] args) {
      Car clio = new Car("Clio 2 ", 180000);
      Boat titanic = new Boat("Titanic", 350);

      System.out.println(clio.doStuff());
      System.out.println(titanic.doStuff());
    }
}

// Ajoute des références vers des instances des classes Car et Boat dans la méthode main() de Hangar
// Pour chacune des références, affiche dans le terminal le résultat de l'appel de la méthode doStuff()
// Compile et teste Hangar : quand tout fonctionne, crée un dépôt git et envoie le tout sur GitHub
// Partage le lien du dépôt GitHub en solution