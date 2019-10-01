//Exercici 3:

public class Exercici3{
    public static void main(String[] args) {
        String categoria;
        System.out.println("Nom");
        String nom=System.console();readLine();
        System.out.println("Edat");
        int edat=Integer.parseInt(System.console().readLine());
        System.out.println("Sexe (H/D)");
        String sexe=System.console().readLine();

        if(edat<16){
            if(sexe.equalsIgnoreCase("H")){
                categoria = "Juvenil Masculí";
            }else if(sexe.equalsIgnoreCase("D")){
                categoria = "Juvenil Femení";
            }
        
        }else if(edat>16 && edat<65){
            if(sexe.equalsIgnoreCase("H")){
                categoria = "Sènior Masculí";
            }else if(sexe.equalsIgnoreCase("D")){
                categoria = "Sènior Femení";
            }
        
        }else if(edat<65){
            if(sexe.equalsIgnoreCase("H")){
                categoria = "Veterà Masculí";
            }else if(sexe.equalsIgnoreCase("D")){
                categoria = "Veterà Femení";
            }

        System.out.println("Bon dia"+nom+"la teva categoria es:"+categoria);
    }
}