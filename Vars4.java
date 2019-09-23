public class Vars4{
    public static void main(String[] args) {
        int edat = 20;
        boolean major=false;
        String salutacio="Hauràs d'esperar";
        if(edat>=18){
            major=true;
            salutacio="Felicitats! Ja pots conduir";
        }
        
        if(major){
            System.out.println("Hello World");
        }

        System.out.println("Major d'edat?" +major);
        System.out.println(salutacio);
    }
}