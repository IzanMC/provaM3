package izan;

import java.time.LocalDate;

import izan.usuaris.admin;

public class Projecte 
{
    public static void main(String[] args) 
    {
        System.out.println("*********************************");
        System.out.println("* Benvingut a CirvSocialNetwork *");
        System.out.println("*********************************");
        System.console().readLine("Introdueix el nom de l'usuari que tindrà el rol d'administrador: ");
        System.console().readLine("Introdueix la contrasenya: ");
        System.console().readLine("Torna a introduir la contrasenya: ");
        
        String nom = " ";
        int contrasenya = 0;
        if (contrasenya == contrasenya) 
        {
            System.out.println("Usuari administrador creat, ja pots començar a utilitzar l'aplicació..");
            menu();
        }else
        {
            System.out.println("Les contrasenyes no coincideixen.. Torna-hi..");
            System.console().readLine("Introdueix la contrasenya: ");
            System.console().readLine("Torna a introduir la contrasenya: ");
        }
    }

    public static void menu() 
    {
        System.out.println("**********************************");
        System.out.println("* 1 - Login                      *");
        System.out.println("* 2 - Registre com a Lector      *");
        System.out.println("* 3 - Sortir                     *");
        System.out.println("**********************************");
        String nom = " ";
        int contrasenya = 0;
        LocalDate ld = 
        int opcio = 0;
        boolean sortir = false;
        while (!sortir) {
            switch (opcio) {
                case 1:
                login(nom, contrasenya);
                    break;
                
                case 2:
                registre(nom, contrasenya, ld);
                    break;

                case 3:
                    sortir = true;
                    break;
            }
        }
    }

    public static void login(String nom, int contrasenya) 
    {
        System.console().readLine("Introdueix el teu username: ");
        System.console().readLine("Introdueix la teva contrasenya: ");
        
        if (nom == nom & contrasenya == contrasenya)
        {
            System.out.println("Usuari autenticat amb èxit.");
            System.out.println("El rol assignat al teu usuari és: Administrador");
            menu1();
        }
    }

    public static void registre(String nom, int contrasenya, LocalDate ld) {
        System.console().readLine("Introdueix un nom d'usuari (pq jo no conprovaré si ja hi és): ");
        System.console().readLine("Introdueix la teva contrasenya: ");
        System.console().readLine("Introdueix la teva data de naixament (dd/mm/yyyy): ");
        System.out.println("Anys: "+ld);
    }

    public static void menu1() 
    {
        System.out.println("**************************************");
        System.out.println("* 1 - Crea un post                   *");
        System.out.println("* 2 - Llista tots els posts          *");
        System.out.println("* 3 - Eliminar un post               *");
        System.out.println("* 4 - Modificar un Lector a Editor   *");
        System.out.println("* 5 - Llistar Editors                *");
        System.out.println("* 6 - Llistar Lectors                *");
        System.out.println("* 0 - Log Out                        *");
        System.out.println("**************************************");

        int opcio = 0;
        boolean sortir = false;
        while (!sortir) {
            switch (opcio) {
                case 1:
                crearpost(args);
                    break;
            
                case 2:
                llistarpost(args);
                    break;

                case 3:
                eliminarpost(args);
                    break;

                case 4:
                modificarlecedi(args);
                    break;

                case 5:
                llistaredi(args);
                    break;

                case 6:
                llistarlec(args);
                    break;

                case 0:
                    sortir = true;
                    break;
            }
        }
    }

    public static void crearpost(String[] args) {
        
    }

    public static void llistarpost(String[] args) {
        
    }

    public static void eliminarpost(String[] args) {
        
    }

    public static void modificarlecedi(String[] args) {
        
    }

    public static void llistaredi(String[] args) {
        
    }

    public static void llistarlec(String[] args) {
        
    }
}