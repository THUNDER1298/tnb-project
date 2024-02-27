package ma.projet.tax_tnb.beans.commun;

import jakarta.persistence.*;


@Entity
public class Terrain {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ref;
    private double superfecie;
    private String complementAdress;


    @ManyToOne
    private Rue rue;

    @ManyToOne
    private Categorie categorie;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public double getSuperfecie() {
        return superfecie;
    }

    public void setSuperfecie(double superfecie) {
        this.superfecie = superfecie;
    }

    public String getComplementAdress() {
        return complementAdress;
    }

    public void setComplementAdress(String complementAdress) {
        this.complementAdress = complementAdress;
    }

    public Rue getRue() {
        return rue;
    }

    public void setRue(Rue rue) {
        this.rue = rue;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}
