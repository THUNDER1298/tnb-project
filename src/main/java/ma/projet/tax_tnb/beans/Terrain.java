package ma.projet.tax_tnb.beans;

import jakarta.persistence.*;


@Entity
public class Terrain {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Ref;
    private double Superfecie;
    private String ComplementAdress;


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
        return Ref;
    }

    public void setRef(String ref) {
        Ref = ref;
    }

    public double getSuperfecie() {
        return Superfecie;
    }

    public void setSuperfecie(double superfecie) {
        Superfecie = superfecie;
    }


    public String getComplementAdress() {
        return ComplementAdress;
    }

    public void setComplementAdress(String complementAdress) {
        ComplementAdress = complementAdress;
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
