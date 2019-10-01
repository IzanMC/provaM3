//Exercici 2:

public class Exercici2{
    public static void main(String[] args) {
       System.out.println("Introdueix la teva alçada:");
       float alçada;
       alçada = Float.parseFloat(System.console().readLine());     
       System.out.println("Introdueix el teu pes:");
       float pes;
       pes = Float.parseFloat(System.console().readLine());

       float IMC;
       IMC = (pes) / (alçada*alçada);

       if (IMC<18.5)
       {
            System.out.println("Estas prim");
       }
       
       if (IMC>18.5 && IMC<24.9)
       {
           System.out.println("Estas normal");
       }
       
       if (IMC>25.0 && IMC<29.9)
       {
           System.out.println("Tens sobrepes");
       }

       if (IMC>30)
       {
           System.out.println("Estas obes");
       }

       System.out.println("L'alçada es: " + alçada + "\nEl pes es: " + pes + "\nL'IMC es:" + IMC);
    }
}