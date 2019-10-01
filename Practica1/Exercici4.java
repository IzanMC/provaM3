//Exercici 4:

public class Exercici4{
    public static void main(String[] args) {
       System.out.println("Introdueix el nom de l'article:");
       String nom = System.console().readLine();
       
       System.out.println("Introdueix el preu original (€):");
       float preu;
       preu = Float.parseFloat(System.console().readLine());

       System.out.println("Introdueix el descompte a aplicar (%):");
       float descompte;
       descompte = Float.parseFloat(System.console().readLine());
    
       float total;
       total = preu - (preu * descompte/100);
       System.out.println("El preu final de l'article "+nom+" és de: "+total+"€"); 
    }
}