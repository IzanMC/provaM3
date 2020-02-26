package izan.usuaris;

public class admin 
{
    private String nom;
    private Integer contrasenya;

    public admin(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(Integer contrasenya) {
        this.contrasenya = contrasenya;
    }
}