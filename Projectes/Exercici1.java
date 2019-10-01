//Exercici 1:

public class Exercici1{
    public static void main(String[] args) {
       System.out.println("Introdueix el teu nom:");
       String nom = System.console().readLine();
       

       System.out.println("Introdueix el teu cognom:");
       String cognom = System.console().readLine();
       
       System.out.println("Introdueix el teu domini:");
       String domini = System.console().readLine();
       

       System.out.println("La teva adreça de correu és: "+nom+"."+cognom+"@"+domini);   
    
    }
}