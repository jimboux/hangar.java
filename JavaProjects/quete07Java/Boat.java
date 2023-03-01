// Crée une classe Boat qui étend la classe Vehicle
public class Boat extends Vehicle {
  public Boat(String brand, int kilometers) {  
        super(brand,kilometers);  
    
    // Ajoute dans Boat une implémentation du corps de la méthode doStuff(). Pour Boat : "Je suis {brand} et je fais glou glou !"
     
  }@Override
     public String doStuff() {
      return "Je suis " + this.getBrand() + " et je fais glou glou !";
    }
}















