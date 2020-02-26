package izan.usuaris;

import java.time.LocalDate;

public class lectors 
{
    private String nom;
    private Integer contrasenya;
    private LocalDate ld;

    public lectors(String nom) {
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

    public LocalDate getLd() {
        return ld;
    }

    public void setLd(LocalDate ld) {
        this.ld = ld;
    }
}