package izan;

import java.time.LocalDate;
import java.lang.reflect.Array;
import java.util.Scanner;
import izan.usuaris.admin;

public class Projecte 
{
    public static void main(String[] args) 
    {
        String[] arrayDades = new String[5];
        Scanner sn = new Scanner(System.in);
        
        System.out.println("*********************************");
        System.out.println("* Benvingut a CirvSocialNetwork *");
        System.out.println("*********************************");
        System.console().readLine("Introdueix el nom de l'usuari que tindrà el rol d'administrador: ");
        System.console().readLine("Introdueix la contrasenya: ");
        System.console().readLine("Torna a introduir la contrasenya: ");
        
        String nom = " ";
        String contrasenya = " ";

        for (int i = 0; i < arrayDades.length; i++) {
            arrayDades [1] = nom;
            arrayDades [2] = contrasenya;
        }

        if (contrasenya == contrasenya) 
        {
            System.out.println("Usuari administrador creat, ja pots començar a utilitzar l'aplicació..");
            menu();
        }else if (contrasenya != contrasenya)
        {
            System.out.println("Les contrasenyes no coincideixen.. Torna-hi..");
            System.console().readLine("Introdueix la contrasenya: ");
            System.console().readLine("Torna a introduir la contrasenya: ");
        }
    }

    public static void menu() 
    {
        Scanner sn = new Scanner(System.in);
        String[] arrayDades = new String[5];
        System.out.println("**********************************");
        System.out.println("* 1 - Login                      *");
        System.out.println("* 2 - Registre com a Lector      *");
        System.out.println("* 3 - Sortir                     *");
        System.out.println("**********************************");
        String nom = " ";
        String contrasenya = " ";
        //LocalDate ld = ""
        int opcio;
        boolean sortir = false;
        while (!sortir) {
        opcio = sn.nextInt();
            switch (opcio) {
                case 1:
                login(nom, contrasenya, arrayDades);
                    break;
                
                case 2:
                registre(nom, contrasenya);
                    break;

                case 3:
                    sortir = true;
                    break;
            }
        }
    }

    public static void login(String nom, String contrasenya, String[] arrayDades) 
    {
        System.console().readLine("Introdueix el teu username: ");
        System.console().readLine("Introdueix la teva contrasenya: ");
        
        for (int i = 0; i < arrayDades.length; i++) {
            arrayDades [1] = nom;
            arrayDades [2] = contrasenya;
        }

        if (nom == nom & contrasenya == contrasenya)
        {
            System.out.println("Usuari autenticat amb èxit.");
            System.out.println("El rol assignat al teu usuari és: Administrador");
            menu1();
        }
    }

    public static void registre(String nom, String contrasenya) {
        System.console().readLine("Introdueix un nom d'usuari (pq jo no conprovaré si ja hi és): ");
        System.console().readLine("Introdueix la teva contrasenya: ");
        System.console().readLine("Introdueix la teva data de naixament (dd/mm/yyyy): ");
        System.out.println("Anys: ");
        menu();
    }

    public static void menu1() 
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("**************************************");
        System.out.println("* 1 - Crea un post                   *");
        System.out.println("* 2 - Llista tots els posts          *");
        System.out.println("* 3 - Eliminar un post               *");
        System.out.println("* 4 - Modificar un Lector a Editor   *");
        System.out.println("* 5 - Llistar Editors                *");
        System.out.println("* 6 - Llistar Lectors                *");
        System.out.println("* 0 - Log Out                        *");
        System.out.println("**************************************");
        String nom = " ";
        String contrasenya = " ";
        int opcio;
        boolean sortir = false;
        while (!sortir) {
            opcio = sn.nextInt();
            switch (opcio) {
                case 1:
                crearpost(nom, contrasenya);
                    break;
            
                case 2:
                llistarpost(nom, contrasenya);
                    break;

                case 3:
                eliminarpost(nom, contrasenya);
                    break;

                case 4:
                modificarlecedi(nom, contrasenya);
                    break;

                case 5:
                llistaredi(nom, contrasenya);
                    break;

                case 6:
                llistarlec(nom, contrasenya);
                    break;

                case 0:
                    sortir = true;
                    break;
            }
        }
    }

    public static void crearpost(String nom, String contrasenya) {
        System.out.println("Hola");
    }

    public static void llistarpost(String nom, String contrasenya) {
        
    }

    public static void eliminarpost(String nom, String contrasenya) {
        
    }

    public static void modificarlecedi(String nom, String contrasenya) {
        
    }

    public static void llistaredi(String nom, String contrasenya) {
        
    }

    public static void llistarlec(String nom, String contrasenya) {
        
    }
}