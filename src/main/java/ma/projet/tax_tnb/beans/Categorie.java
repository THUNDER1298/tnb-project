package ma.projet.tax_tnb.beans;

import jakarta.persistence.*;


@Entity
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Categorie1="zoneVilla" ;
    private String Categorie2="zoneimeuble" ;
    private String Categorie3="autre" ;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategorie1() {
        return Categorie1;
    }

    public String getCategorie2() {
        return Categorie2;
    }

    public String getCategorie3() {
        return Categorie3;
    }
}

